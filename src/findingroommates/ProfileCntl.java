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
public class ProfileCntl {
    
    private NavCntl parentNavCntl;
    private ProfileUI theProfileUI;
    

    public ProfileCntl(NavCntl theNavCntl, UserAccount userName) {
        parentNavCntl = theNavCntl;
        navToProfileUI(userName);
    }
    
    public void navToProfileUI(UserAccount userName) {
        theProfileUI = new ProfileUI(this, userName);
        theProfileUI.setVisible(true);
        theProfileUI.setLocationRelativeTo(null);
    }
    
    public void navBackToMainMenu() {
        theProfileUI.dispose();
        parentNavCntl.showNavControl();  
    }
    
}