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
public abstract class UserAccount {
    
    private String username = "";
    private char[] password = null;
     
    public UserAccount(){   
    }
    
    public UserAccount(String newUsername, char[] newPassword){
        username = newUsername;
        password = newPassword;
    }
    
    public String getUsername(){
        return username;
    }
    
    public char[] getPassword(){
        return password;
    }
    
    public abstract boolean authenticate(String unToCheck, char[] pwTocheck);
}
