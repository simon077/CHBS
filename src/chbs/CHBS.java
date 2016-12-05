/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chbs;

/**
 *
 * @author Simon
 */
public class CHBS {

    /*
     * @param args the command line arguments
     */
    
    static String fileContentsString;
    public static void main(String[] args) {
        // TODO code application logic here
        LoginForm form1 = new LoginForm();
        form1.setVisible(true);
        
        HomeForm.run();
    }
}
