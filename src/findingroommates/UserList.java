/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findingroommates;

/**
 *
 * @author bch5177
 */
import java.util.ArrayList;

public class UserList {
    
    private ArrayList<UserAccount> listOfUsers = null;
    
    public UserList(){  
       listOfUsers = new ArrayList();
       for(int i = 0; i < 5; i++){
           String testUsername = "test";
           char[] testPassword = {'t', 'e', 's', 't'};
           Member newMember  = new Member (testUsername, testPassword);
           listOfUsers.add(newMember);
       }
    }
    
      public ArrayList<UserAccount> getListOfUsers(){
        return listOfUsers;
    }
      
      public UserAccount getCurrentUser(String userName) {
          UserAccount userAccountToPass = null;
          for(UserAccount account : listOfUsers) {
              if(account.getUsername().equals(userName)) {
                  userAccountToPass = account;
              }
          }
          return userAccountToPass;
      }
    
    public boolean authenticate(String username2check, char[] password2check){
        boolean authenticated = false;
        for(int i = 0; i < listOfUsers.size(); i++){
            if(listOfUsers.get(i).authenticate(username2check, password2check)){
                authenticated = true;
                break;
            }
        }
        return authenticated;
    }
    
}