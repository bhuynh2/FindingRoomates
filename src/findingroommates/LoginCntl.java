/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findingroommates;

/**
 *
 * @author Computer
 */
public class LoginCntl {
    
    private LoginUI theLoginUI = null;
    private UserList theUserList = null;
    
    public  LoginCntl(){
        theLoginUI = new LoginUI(this);
        theLoginUI.setLocationRelativeTo(null);
        theLoginUI.setVisible(true);
}
    
    public UserList getUserList(){
    if(theUserList == null){
    
    theUserList = new UserList();
 
    }
    
    return theUserList;
    }
    
    protected boolean requestAuthenticate(String theUsername, char[] thePassword){
        boolean authenticated = false;
        
         if(getUserList().authenticate(theUsername, thePassword)){
            System.out.println("Welcome!");
            theLoginUI.setVisible(false);
            
            UserAccount currentUser = getUserList().getCurrentUser(theUsername);
            
            NavCntl theNavCntl = new NavCntl(currentUser);
            authenticated = true;
        }
        return authenticated;
 }
    
}