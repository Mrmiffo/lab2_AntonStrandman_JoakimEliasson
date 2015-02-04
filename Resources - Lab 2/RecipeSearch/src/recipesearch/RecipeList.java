/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipesearch;

import java.awt.Component;
import java.awt.Font;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import se.chalmers.ait.dat215.lab2.Recipe;

/**
 *This class is used by the recipe viewer to create a result list with customized layout.
 * @author Anton
 */
public final class RecipeList extends DefaultListCellRenderer{
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Font font = new Font("helvetica", Font.BOLD,24);
        JLabel label;
        
        label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        label.setIcon(((Recipe)value).getImage());
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setText(((Recipe)value).getName());
        label.setFont(font);

        //Used to add rowbreaks after each ingridient in the tooltip.
        String toolTip = "<html><body>"+((Recipe)value).getIngredients().get(0);
        for (int i = 1;i< ((Recipe)value).getIngredients().size();i++){
            toolTip = toolTip + "<br>" + ((Recipe)value).getIngredients().get(i);
        }
        label.setToolTipText(toolTip);
        return label;
    }
    
}
