package recipesearch;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.ButtonModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import se.chalmers.ait.dat215.lab2.Recipe;
import se.chalmers.ait.dat215.lab2.RecipeDatabase;
import se.chalmers.ait.dat215.lab2.SearchFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class RecipeSearchView extends javax.swing.JFrame {

    /**
     * Creates new form ExampleApplicationView
     */
    public RecipeSearchView() {
        search = new RecipeSearchController();
        
        initComponents();
        resultList.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                if (e.getClickCount() == 2){
                    new SingleRecipeView((Recipe)((JList)e.getComponent()).getSelectedValue());
            
                }
            }
        });
        fetchAndDisplayResults();
        
    }

    //Osäker på om vi vill skapa filter i viewern, eller om vi ska delegera det till RecipeSeachController. (View har all info, men ska ju egentligen inte göra den typen av beräkningar kan jag tycka)
    private SearchFilter createFilter(){
        return new SearchFilter(getDifficulty(), getMaxTime(), getCuisine(), getMaxPrice(), getMainIngredient());
    }

    private String getMainIngredient(){
        ButtonModel tempButton = mainIngrGroup.getSelection();
        
        if (tempButton != null){
            String buttonActionText = tempButton.getActionCommand();
            return buttonActionText;
        }

        return null;

    }
    
    private String getCuisine(){
        ButtonModel tempButton = cuisineGroup.getSelection();
        if (tempButton != null){
            String buttonActionText = tempButton.getActionCommand();
            return buttonActionText;
        }

            return null;

    }
    
    private String getDifficulty(){
        ButtonModel tempButton = difficultyGroup.getSelection();
        if (tempButton != null){
            String buttonActionText = tempButton.getActionCommand();
            return buttonActionText;
        }
        return null;

            
    }
    
    private int getMaxTime(){
        return timeSlider.getValue();
    }
    
    private int getMaxPrice(){
        return priceSlider.getValue();
    }
    
    //Om vi lägger till en funktion för att söka på namn så behöver vi bara skapa en overloaded metod med samma man som tar in en sträng också, alternativ ett annat custom filter.
    private void fetchAndDisplayResults(){
        List<Recipe> results = search.getResults(createFilter());
        displayResults(results);
    }
    
    private void displayResults(List<Recipe> results){
        Recipe[] resultArray = new Recipe[results.size()];
        for (int i = 0; i < resultArray.length; i++){
            resultArray[i] = results.get(i);
        }
        resultList.setListData(resultArray);
        resultList.setCellRenderer(new RecipeList());
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainIngrGroup = new javax.swing.ButtonGroup();
        difficultyGroup = new javax.swing.ButtonGroup();
        cuisineGroup = new javax.swing.ButtonGroup();
        layoutPanel = new javax.swing.JPanel();
        meatToggleButton = new javax.swing.JToggleButton();
        fishToggleButton = new javax.swing.JToggleButton();
        chickenToggleButton = new javax.swing.JToggleButton();
        vegToggleButton = new javax.swing.JToggleButton();
        timeSlider = new javax.swing.JSlider();
        priceSlider = new javax.swing.JSlider();
        timeLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        priceText = new javax.swing.JTextField();
        easyDifficultyButton = new javax.swing.JToggleButton();
        swedenKitchenButton = new javax.swing.JToggleButton();
        hardDifficultyButton = new javax.swing.JToggleButton();
        franceKitchenButton = new javax.swing.JToggleButton();
        greeceKitchenButton = new javax.swing.JToggleButton();
        africaKitchenButton = new javax.swing.JToggleButton();
        indiaKitchenButton = new javax.swing.JToggleButton();
        asiaKitchenButton = new javax.swing.JToggleButton();
        timeText = new javax.swing.JTextField();
        mediumDifficultyButton = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultList = new javax.swing.JList();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("recipesearch/resources/RecipeSearch"); // NOI18N
        setTitle(bundle.getString("Application.title")); // NOI18N
        setMaximumSize(null);
        setMinimumSize(null);
        setName("applicationFrame"); // NOI18N
        setResizable(false);

        layoutPanel.setBackground(new java.awt.Color(244, 244, 192));
        layoutPanel.setMaximumSize(null);

        mainIngrGroup.add(meatToggleButton);
        meatToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recipesearch/resources/cow2.png"))); // NOI18N
        meatToggleButton.setToolTipText("Kött");
        meatToggleButton.setActionCommand("Kött");
        meatToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        meatToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainIngrAction(evt);
            }
        });

        mainIngrGroup.add(fishToggleButton);
        fishToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recipesearch/resources/fish2.png"))); // NOI18N
        fishToggleButton.setToolTipText("Fisk");
        fishToggleButton.setActionCommand("Fisk");
        fishToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fishToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainIngrAction(evt);
            }
        });

        mainIngrGroup.add(chickenToggleButton);
        chickenToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recipesearch/resources/chicken2.png"))); // NOI18N
        chickenToggleButton.setToolTipText("Kyckling");
        chickenToggleButton.setActionCommand("Kyckling");
        chickenToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chickenToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainIngrAction(evt);
            }
        });

        mainIngrGroup.add(vegToggleButton);
        vegToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recipesearch/resources/carrot4.png"))); // NOI18N
        vegToggleButton.setToolTipText("Vegitariskt");
        vegToggleButton.setActionCommand("Vegetarisk");
        vegToggleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        vegToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainIngrAction(evt);
            }
        });

        timeSlider.setMajorTickSpacing(30);
        timeSlider.setMaximum(150);
        timeSlider.setMinorTickSpacing(10);
        timeSlider.setPaintLabels(true);
        timeSlider.setPaintTicks(true);
        timeSlider.setSnapToTicks(true);
        timeSlider.setValue(0);
        timeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                timeSliderStateChanged(evt);
            }
        });

        priceSlider.setMajorTickSpacing(20);
        priceSlider.setMinorTickSpacing(5);
        priceSlider.setPaintLabels(true);
        priceSlider.setPaintTicks(true);
        priceSlider.setSnapToTicks(true);
        priceSlider.setValue(0);
        priceSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                priceSliderStateChanged(evt);
            }
        });

        timeLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 36)); // NOI18N
        timeLabel.setText("Tid");

        priceLabel.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 36)); // NOI18N
        priceLabel.setText("Pris");

        priceText.setText("0");
        priceText.setInputVerifier(new integerInputVerifier());
        priceText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                priceTextFocusLost(evt);
            }
        });

        difficultyGroup.add(easyDifficultyButton);
        easyDifficultyButton.setText("Enkelt");
        easyDifficultyButton.setActionCommand("Lätt");
        easyDifficultyButton.setPreferredSize(new java.awt.Dimension(216, 160));
        easyDifficultyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficultyAction(evt);
            }
        });

        cuisineGroup.add(swedenKitchenButton);
        swedenKitchenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recipesearch/resources/sweden_flag_map2.png"))); // NOI18N
        swedenKitchenButton.setToolTipText("Svensk mat");
        swedenKitchenButton.setActionCommand("Sverige");
        swedenKitchenButton.setPreferredSize(new java.awt.Dimension(216, 160));
        swedenKitchenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusineAction(evt);
            }
        });

        difficultyGroup.add(hardDifficultyButton);
        hardDifficultyButton.setText("Svårt");
        hardDifficultyButton.setActionCommand("Svår");
        hardDifficultyButton.setPreferredSize(new java.awt.Dimension(216, 160));
        hardDifficultyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficultyAction(evt);
            }
        });

        cuisineGroup.add(franceKitchenButton);
        franceKitchenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recipesearch/resources/france2.png"))); // NOI18N
        franceKitchenButton.setToolTipText("Fransk mat");
        franceKitchenButton.setActionCommand("Frankrike");
        franceKitchenButton.setPreferredSize(new java.awt.Dimension(216, 160));
        franceKitchenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusineAction(evt);
            }
        });

        cuisineGroup.add(greeceKitchenButton);
        greeceKitchenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recipesearch/resources/greece2.png"))); // NOI18N
        greeceKitchenButton.setToolTipText("Grekisk mat");
        greeceKitchenButton.setActionCommand("Grekland");
        greeceKitchenButton.setPreferredSize(new java.awt.Dimension(216, 160));
        greeceKitchenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusineAction(evt);
            }
        });

        cuisineGroup.add(africaKitchenButton);
        africaKitchenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recipesearch/resources/africa2.png"))); // NOI18N
        africaKitchenButton.setText("jToggleButton2");
        africaKitchenButton.setToolTipText("Afrikansk mat");
        africaKitchenButton.setActionCommand("Afrika");
        africaKitchenButton.setPreferredSize(new java.awt.Dimension(216, 160));
        africaKitchenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusineAction(evt);
            }
        });

        cuisineGroup.add(indiaKitchenButton);
        indiaKitchenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recipesearch/resources/india2.png"))); // NOI18N
        indiaKitchenButton.setText("jToggleButton2");
        indiaKitchenButton.setToolTipText("Insisk mat");
        indiaKitchenButton.setActionCommand("Indien");
        indiaKitchenButton.setPreferredSize(new java.awt.Dimension(216, 160));
        indiaKitchenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusineAction(evt);
            }
        });

        cuisineGroup.add(asiaKitchenButton);
        asiaKitchenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recipesearch/resources/asia3.png"))); // NOI18N
        asiaKitchenButton.setText("jToggleButton2");
        asiaKitchenButton.setToolTipText("Asiatisk mat");
        asiaKitchenButton.setActionCommand("Asien");
        asiaKitchenButton.setPreferredSize(new java.awt.Dimension(216, 160));
        asiaKitchenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusineAction(evt);
            }
        });

        timeText.setText("0");
        timeText.setInputVerifier(new integerInputVerifier());
        timeText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                timeTextFocusLost(evt);
            }
        });

        difficultyGroup.add(mediumDifficultyButton);
        mediumDifficultyButton.setText("Medelsvårt");
        mediumDifficultyButton.setActionCommand("Mellan");
        mediumDifficultyButton.setPreferredSize(new java.awt.Dimension(216, 160));
        mediumDifficultyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficultyAction(evt);
            }
        });

        jScrollPane1.setMaximumSize(null);
        jScrollPane1.setMinimumSize(null);
        jScrollPane1.setPreferredSize(new Dimension((int)(layoutPanel.getSize().getWidth()*0.5),(int)(layoutPanel.getSize().getHeight()-10)));

        resultList.setBackground(new java.awt.Color(244, 244, 192));
        resultList.setModel(listModel);
        resultList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        resultList.setToolTipText("");
        resultList.setMaximumSize(new java.awt.Dimension(490, 934));
        jScrollPane1.setViewportView(resultList);

        javax.swing.GroupLayout layoutPanelLayout = new javax.swing.GroupLayout(layoutPanel);
        layoutPanel.setLayout(layoutPanelLayout);
        layoutPanelLayout.setHorizontalGroup(
            layoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timeLabel)
                    .addComponent(priceLabel)
                    .addGroup(layoutPanelLayout.createSequentialGroup()
                        .addComponent(easyDifficultyButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mediumDifficultyButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hardDifficultyButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layoutPanelLayout.createSequentialGroup()
                        .addComponent(africaKitchenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(indiaKitchenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(asiaKitchenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layoutPanelLayout.createSequentialGroup()
                        .addComponent(swedenKitchenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(franceKitchenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(greeceKitchenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layoutPanelLayout.createSequentialGroup()
                        .addGroup(layoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(priceSlider, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(timeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layoutPanelLayout.createSequentialGroup()
                                .addComponent(meatToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fishToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chickenToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vegToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceText)
                            .addComponent(timeText))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
        );
        layoutPanelLayout.setVerticalGroup(
            layoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layoutPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(layoutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layoutPanelLayout.createSequentialGroup()
                        .addGroup(layoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vegToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chickenToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fishToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meatToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(timeText)
                            .addComponent(timeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(priceText)
                            .addComponent(priceSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(easyDifficultyButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hardDifficultyButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mediumDifficultyButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layoutPanelLayout.createSequentialGroup()
                                .addGroup(layoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(franceKitchenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(swedenKitchenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(africaKitchenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(indiaKitchenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(asiaKitchenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(greeceKitchenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1134, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_timeSliderStateChanged
        timeText.setText(((Integer)timeSlider.getValue()).toString());
        fetchAndDisplayResults();
        
    }//GEN-LAST:event_timeSliderStateChanged

    private void timeTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_timeTextFocusLost
        timeSlider.setValue(Integer.parseInt(timeText.getText()));
    }//GEN-LAST:event_timeTextFocusLost

    private void priceTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priceTextFocusLost
        priceSlider.setValue(Integer.parseInt(priceText.getText()));
    }//GEN-LAST:event_priceTextFocusLost

    private void cusineAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusineAction
        fetchAndDisplayResults();
    }//GEN-LAST:event_cusineAction

    private void difficultyAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficultyAction
        fetchAndDisplayResults();
    }//GEN-LAST:event_difficultyAction

    private void mainIngrAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainIngrAction
        fetchAndDisplayResults();
    }//GEN-LAST:event_mainIngrAction

    private void priceSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_priceSliderStateChanged
        priceText.setText(((Integer)priceSlider.getValue()).toString());
        fetchAndDisplayResults();
    }//GEN-LAST:event_priceSliderStateChanged
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton africaKitchenButton;
    private javax.swing.JToggleButton asiaKitchenButton;
    private javax.swing.JToggleButton chickenToggleButton;
    private javax.swing.ButtonGroup cuisineGroup;
    private javax.swing.ButtonGroup difficultyGroup;
    private javax.swing.JToggleButton easyDifficultyButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JToggleButton fishToggleButton;
    private javax.swing.JToggleButton franceKitchenButton;
    private javax.swing.JToggleButton greeceKitchenButton;
    private javax.swing.JToggleButton hardDifficultyButton;
    private javax.swing.JToggleButton indiaKitchenButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel layoutPanel;
    private javax.swing.ButtonGroup mainIngrGroup;
    private javax.swing.JToggleButton meatToggleButton;
    private javax.swing.JToggleButton mediumDifficultyButton;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JSlider priceSlider;
    private javax.swing.JTextField priceText;
    private javax.swing.JList resultList;
    private javax.swing.JToggleButton swedenKitchenButton;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JSlider timeSlider;
    private javax.swing.JTextField timeText;
    private javax.swing.JToggleButton vegToggleButton;
    // End of variables declaration//GEN-END:variables

    private RecipeSearchController search;
    private Recipe[] lastResult;
    private DefaultListModel listModel = new DefaultListModel();
}
