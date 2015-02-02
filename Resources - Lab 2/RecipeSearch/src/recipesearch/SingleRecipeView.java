/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipesearch;

import java.util.List;
import javax.swing.ImageIcon;
import se.chalmers.ait.dat215.lab2.Ingredient;
import se.chalmers.ait.dat215.lab2.Recipe;
import se.chalmers.ait.dat215.lab2.RecipeDatabase;
import se.chalmers.ait.dat215.lab2.SearchFilter;


/**
 *
 * @author Joakim
 */
public class SingleRecipeView extends javax.swing.JFrame {
    
    private String name;
    private int servings;
    private int price;
    private ImageIcon image;
    private String description;
    private List<Ingredient> ingredients;
    private Recipe r;
    private String ingrList;
    
                
    
    
    /**
     * Creates new form SingleRecipeView
     */
    public SingleRecipeView(Recipe r) {
        
        initComponents();
        this.singleRecipeImage.setIcon((r.getImage()));
        this.singleRecipeTitle.setText(r.getName());
        this.singleRecipeServingsData.setText(((Integer)r.getServings()).toString());
        this.singleRecipePriceData.setText(((Integer)r.getPrice()).toString());
        this.singleRecipeTimeData.setText(((Integer)r.getTime()).toString());
        for (Ingredient i : r.getIngredients()){
            if (ingrList == null){
                ingrList = "<html>"+"<body>"+i.toString();         
            }
            else{
                ingrList = ingrList + "<br />"+i.toString();
            }  
        }
        ingrList = ingrList+"</body>"+"</html>";
        this.singleRecipeIngrData.setText(ingrList);
        this.singeRecipeDescData.setText("<html>"+r.getDescription());
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        singleRecipeShort = new javax.swing.JPanel();
        singleRecipeTitle = new javax.swing.JLabel();
        singleRecipeServings = new javax.swing.JLabel();
        singleRecipeTime = new javax.swing.JLabel();
        singleRecipePrice = new javax.swing.JLabel();
        singleRecipeServingsData = new javax.swing.JLabel();
        singleRecipeTimeData = new javax.swing.JLabel();
        singleRecipePriceData = new javax.swing.JLabel();
        singleRecipeImage = new javax.swing.JLabel();
        singleRecipeDescPanel = new javax.swing.JPanel();
        singeRecipeDescData = new javax.swing.JLabel();
        singleRecipeIngrPanel = new javax.swing.JPanel();
        singleRecipeIngrData = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(241, 241, 241));

        singleRecipeShort.setBackground(new java.awt.Color(255, 255, 255));

        singleRecipeTitle.setText("Titel");

        singleRecipeServings.setText("Antal portioner:");

        singleRecipeTime.setText("Tid:");

        singleRecipePrice.setText("Pris:");

        singleRecipeServingsData.setText("jLabel1");

        singleRecipeTimeData.setText("jLabel2");

        singleRecipePriceData.setText("jLabel3");

        javax.swing.GroupLayout singleRecipeShortLayout = new javax.swing.GroupLayout(singleRecipeShort);
        singleRecipeShort.setLayout(singleRecipeShortLayout);
        singleRecipeShortLayout.setHorizontalGroup(
            singleRecipeShortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singleRecipeShortLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(singleRecipeShortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(singleRecipeTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(singleRecipeShortLayout.createSequentialGroup()
                        .addGroup(singleRecipeShortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(singleRecipeServings)
                            .addComponent(singleRecipeTime)
                            .addComponent(singleRecipePrice))
                        .addGap(33, 33, 33)
                        .addGroup(singleRecipeShortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(singleRecipePriceData)
                            .addComponent(singleRecipeTimeData)
                            .addComponent(singleRecipeServingsData))
                        .addGap(0, 335, Short.MAX_VALUE)))
                .addContainerGap())
        );
        singleRecipeShortLayout.setVerticalGroup(
            singleRecipeShortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singleRecipeShortLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(singleRecipeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(singleRecipeShortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(singleRecipeServings)
                    .addComponent(singleRecipeServingsData))
                .addGap(18, 18, 18)
                .addGroup(singleRecipeShortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(singleRecipeTime)
                    .addComponent(singleRecipeTimeData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(singleRecipeShortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(singleRecipePrice)
                    .addComponent(singleRecipePriceData))
                .addGap(53, 53, 53))
        );

        singleRecipeDescPanel.setBackground(new java.awt.Color(255, 255, 255));

        singeRecipeDescData.setText("jLabel4");

        javax.swing.GroupLayout singleRecipeDescPanelLayout = new javax.swing.GroupLayout(singleRecipeDescPanel);
        singleRecipeDescPanel.setLayout(singleRecipeDescPanelLayout);
        singleRecipeDescPanelLayout.setHorizontalGroup(
            singleRecipeDescPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singleRecipeDescPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(singeRecipeDescData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        singleRecipeDescPanelLayout.setVerticalGroup(
            singleRecipeDescPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singleRecipeDescPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(singeRecipeDescData)
                .addContainerGap(307, Short.MAX_VALUE))
        );

        singleRecipeIngrPanel.setBackground(new java.awt.Color(255, 255, 255));

        singleRecipeIngrData.setText("jLabel1");

        javax.swing.GroupLayout singleRecipeIngrPanelLayout = new javax.swing.GroupLayout(singleRecipeIngrPanel);
        singleRecipeIngrPanel.setLayout(singleRecipeIngrPanelLayout);
        singleRecipeIngrPanelLayout.setHorizontalGroup(
            singleRecipeIngrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singleRecipeIngrPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(singleRecipeIngrData)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        singleRecipeIngrPanelLayout.setVerticalGroup(
            singleRecipeIngrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singleRecipeIngrPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(singleRecipeIngrData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(234, Short.MAX_VALUE)
                        .addComponent(singleRecipeImage)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(singleRecipeIngrPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(singleRecipeShort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(singleRecipeDescPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(singleRecipeShort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(singleRecipeImage))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(singleRecipeDescPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(singleRecipeIngrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SingleRecipeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SingleRecipeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SingleRecipeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SingleRecipeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
                public void run() {
                    RecipeDatabase db = RecipeDatabase.getSharedInstance();
                    List <Recipe> listRecipe = db.search(new SearchFilter("Svår", 30, "Grekland", 150, "Kött"));
                    new SingleRecipeView(listRecipe.get(0)).setVisible(true);  
                }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel singeRecipeDescData;
    private javax.swing.JPanel singleRecipeDescPanel;
    private javax.swing.JLabel singleRecipeImage;
    private javax.swing.JLabel singleRecipeIngrData;
    private javax.swing.JPanel singleRecipeIngrPanel;
    private javax.swing.JLabel singleRecipePrice;
    private javax.swing.JLabel singleRecipePriceData;
    private javax.swing.JLabel singleRecipeServings;
    private javax.swing.JLabel singleRecipeServingsData;
    private javax.swing.JPanel singleRecipeShort;
    private javax.swing.JLabel singleRecipeTime;
    private javax.swing.JLabel singleRecipeTimeData;
    private javax.swing.JLabel singleRecipeTitle;
    // End of variables declaration//GEN-END:variables
}
