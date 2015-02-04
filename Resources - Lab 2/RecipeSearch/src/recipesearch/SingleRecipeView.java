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
import java.awt.Dimension;
import java.awt.image.BufferedImage;

/**
 *
 * @author Joakim
 */
public class SingleRecipeView extends javax.swing.JFrame {
    
    private String name;
    private int servings;
    private int price;
    
    private String description;
    private List<Ingredient> ingredients;
    private Recipe recipe;
    private String ingrList;
    private static int nbrOfWindows;
    
    
                
    
    
    /**
     * Creates new form SingleRecipeView
     */
    public SingleRecipeView(Recipe r) {
        this.recipe = r;
        initComponents();
        ImageIcon frameIcon = new ImageIcon(
        getClass().getResource("/RecipeSearch/resources/img.png"));
    
        setIconImage(frameIcon.getImage());
        this.setLocation(nbrOfWindows*40,nbrOfWindows*40);
        nbrOfWindows = (nbrOfWindows+1)%20;
        this.singleRecipeImage.setIcon((r.getImage(234,234)));
        this.singleRecipeTitle.setText(r.getName());
        this.singleRecipeServingsData.setText(((Integer)r.getServings()).toString()+" st");
        this.singleRecipePriceData.setText(((Integer)r.getPrice()).toString()+" kr");
        this.singleRecipeTimeData.setText(((Integer)r.getTime()).toString()+" min");
        this.singleRecipeDifficultyData.setText(r.getDifficulty());
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
        this.singleRecipeDescData.setText("<html>"+r.getDescription());
       
        
       
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
        singleRecipeDifficulty = new javax.swing.JLabel();
        singleRecipeDifficultyData = new javax.swing.JLabel();
        singleRecipeImage = new javax.swing.JLabel();
        singleRecipeDescPanel = new javax.swing.JPanel();
        singleRecipeDescData = new javax.swing.JLabel();
        singleRecipeDescTitle = new javax.swing.JLabel();
        singleRecipeIngrPanel = new javax.swing.JPanel();
        singleRecipeIngrData = new javax.swing.JLabel();
        singleRecipeIngrTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(recipe.getName());
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        singleRecipeShort.setBackground(new java.awt.Color(255, 255, 255));
        singleRecipeShort.setMinimumSize(new java.awt.Dimension(450, 234));
        singleRecipeShort.setPreferredSize(new java.awt.Dimension(450, 234));

        singleRecipeTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        singleRecipeTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        singleRecipeTitle.setText("Titel");

        singleRecipeServings.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        singleRecipeServings.setText("Antal portioner:");

        singleRecipeTime.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        singleRecipeTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        singleRecipeTime.setText("Beräknad tid:");

        singleRecipePrice.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        singleRecipePrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        singleRecipePrice.setText("Beräknat pris:");

        singleRecipeServingsData.setText("jLabel1");

        singleRecipeTimeData.setText("jLabel2");

        singleRecipePriceData.setText("jLabel3");

        singleRecipeDifficulty.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        singleRecipeDifficulty.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        singleRecipeDifficulty.setText("Svårighet:");

        singleRecipeDifficultyData.setText("jLabel1");

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
                            .addGroup(singleRecipeShortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(singleRecipeServings, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(singleRecipePrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(singleRecipeTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(singleRecipeDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(singleRecipeShortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(singleRecipeDifficultyData)
                            .addComponent(singleRecipePriceData)
                            .addComponent(singleRecipeTimeData)
                            .addComponent(singleRecipeServingsData))
                        .addGap(0, 220, Short.MAX_VALUE))))
        );
        singleRecipeShortLayout.setVerticalGroup(
            singleRecipeShortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singleRecipeShortLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(singleRecipeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(singleRecipeShortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(singleRecipeServings)
                    .addComponent(singleRecipeServingsData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(singleRecipeShortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(singleRecipeTime)
                    .addComponent(singleRecipeTimeData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(singleRecipeShortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(singleRecipePrice)
                    .addComponent(singleRecipePriceData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(singleRecipeShortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(singleRecipeDifficulty)
                    .addComponent(singleRecipeDifficultyData))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        singleRecipeImage.setBackground(new java.awt.Color(255, 255, 255));

        singleRecipeDescPanel.setBackground(new java.awt.Color(255, 255, 255));
        singleRecipeDescPanel.setMinimumSize(new java.awt.Dimension(450, 0));
        singleRecipeDescPanel.setPreferredSize(new java.awt.Dimension(450, 118));

        singleRecipeDescData.setText("jLabel4");

        singleRecipeDescTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        singleRecipeDescTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        singleRecipeDescTitle.setText("Gör så här:");

        javax.swing.GroupLayout singleRecipeDescPanelLayout = new javax.swing.GroupLayout(singleRecipeDescPanel);
        singleRecipeDescPanel.setLayout(singleRecipeDescPanelLayout);
        singleRecipeDescPanelLayout.setHorizontalGroup(
            singleRecipeDescPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singleRecipeDescPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(singleRecipeDescPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(singleRecipeDescTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addGroup(singleRecipeDescPanelLayout.createSequentialGroup()
                        .addComponent(singleRecipeDescData)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        singleRecipeDescPanelLayout.setVerticalGroup(
            singleRecipeDescPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singleRecipeDescPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(singleRecipeDescTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(singleRecipeDescData)
                .addContainerGap(269, Short.MAX_VALUE))
        );

        singleRecipeIngrPanel.setBackground(new java.awt.Color(255, 255, 255));
        singleRecipeIngrPanel.setMinimumSize(new java.awt.Dimension(234, 0));
        singleRecipeIngrPanel.setPreferredSize(new java.awt.Dimension(234, 52));

        singleRecipeIngrData.setText("jLabel1");

        singleRecipeIngrTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        singleRecipeIngrTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        singleRecipeIngrTitle.setText("Ingredienser:");

        javax.swing.GroupLayout singleRecipeIngrPanelLayout = new javax.swing.GroupLayout(singleRecipeIngrPanel);
        singleRecipeIngrPanel.setLayout(singleRecipeIngrPanelLayout);
        singleRecipeIngrPanelLayout.setHorizontalGroup(
            singleRecipeIngrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singleRecipeIngrPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(singleRecipeIngrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(singleRecipeIngrTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(singleRecipeIngrData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        singleRecipeIngrPanelLayout.setVerticalGroup(
            singleRecipeIngrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singleRecipeIngrPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(singleRecipeIngrTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(singleRecipeIngrData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(singleRecipeImage)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(singleRecipeIngrPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(singleRecipeDescPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(singleRecipeShort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(singleRecipeImage)
                    .addComponent(singleRecipeShort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(singleRecipeDescPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(singleRecipeIngrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
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
    private javax.swing.JLabel singleRecipeDescData;
    private javax.swing.JPanel singleRecipeDescPanel;
    private javax.swing.JLabel singleRecipeDescTitle;
    private javax.swing.JLabel singleRecipeDifficulty;
    private javax.swing.JLabel singleRecipeDifficultyData;
    private javax.swing.JLabel singleRecipeImage;
    private javax.swing.JLabel singleRecipeIngrData;
    private javax.swing.JPanel singleRecipeIngrPanel;
    private javax.swing.JLabel singleRecipeIngrTitle;
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
