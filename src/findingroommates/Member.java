/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findingroommates;

import java.util.Arrays;

/**
 *
 * @author Computer
 */
public class Member extends UserAccount {
    
      public Member(String newUsername, char[] newPassword){
        super(newUsername, newPassword);  
    }
    
    public boolean authenticate(String username, char[] pwToCheck){
        boolean authenticated = false;
        if(this.getUsername().equals(username) && Arrays.equals(this.getPassword(), pwToCheck)){
            authenticated = true;
        }
        return authenticated;
    }
    
}
