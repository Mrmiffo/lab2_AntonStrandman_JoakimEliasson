/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipesearch;

import javax.swing.InputVerifier;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author Anton
 */
public class integerInputVerifier extends InputVerifier{

    @Override
    public boolean verify(JComponent input) {
        try{
            JTextField fieldToTest = (JTextField) input;
            int resultValue = Integer.parseInt(fieldToTest.getText());
        } catch (NumberFormatException e) {
            return false;
        } catch (ClassCastException e1){
            return false;
        }
        return true;
    }
    
}
