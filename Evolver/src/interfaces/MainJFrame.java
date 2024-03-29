/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import monsters.Monster;
import player.Player;
import text.CombatProcessor;
import text.MainText;
import text.TextTypeProcessor;

/**
 *
 * @author hieudbui
 */
public class MainJFrame extends javax.swing.JFrame {
    private int storyStep = 0;
    private Player mainChar;
    private Map<Integer, Monster> monsters;
    private String commandClipBoard;
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        init();
        start();
    }
    
    private void init(){
        mainChar = new Player(6, 1);     
        monsters = new HashMap<>(); // Key = storyStep, Value = mob
        monsters.put(1, new Monster("Slime",6, 1, 2, 1)); // Slime step 1
        monsters.put(3, new Monster("Gem Slime", 8, 2, 3, 2)); // Gem slime step 3
        monsters.put(6, new Monster("Wild Slime", 15, 2, 10, 4));// Wild slime step 6
    }
    
    private void start(){
        //txtaMain.setText(IMainText.cave1);
        txtaMain.setText(MainText.MainEvent[storyStep]);
        lbHPValue.setText(mainChar.getCurrentHP()+"/"+mainChar.getMaxHP());
        lbLevelValue.setText(mainChar.getLevel()+"");
        pbExperience.setMaximum(mainChar.getMaxXP());
        pbExperience.setValue(mainChar.getCurrentXP());
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtaMain = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaSub = new javax.swing.JTextArea();
        txtCommand = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbHPValue = new javax.swing.JLabel();
        lbMonsterName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbMobHPValue = new javax.swing.JLabel();
        pbExperience = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        lbLevelValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtaMain.setEditable(false);
        txtaMain.setColumns(20);
        txtaMain.setFont(new java.awt.Font("MS Gothic", 0, 18)); // NOI18N
        txtaMain.setLineWrap(true);
        txtaMain.setRows(5);
        txtaMain.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtaMain);

        txtaSub.setEditable(false);
        txtaSub.setColumns(20);
        txtaSub.setLineWrap(true);
        txtaSub.setRows(5);
        txtaSub.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtaSub);

        txtCommand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCommandKeyPressed(evt);
            }
        });

        jLabel1.setText(">");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel2.setText("PLAYER");

        jLabel3.setText("HP:");

        lbHPValue.setText("HP_VALUE");

        lbMonsterName.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        lbMonsterName.setText("MOB_NAME");

        jLabel4.setText("HP:");

        lbMobHPValue.setText("HP_VALUE");

        pbExperience.setRequestFocusEnabled(false);
        pbExperience.setStringPainted(true);

        jLabel5.setText("Level:");

        lbLevelValue.setText("LEVEL_VALUE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(2, 2, 2)
                                .addComponent(txtCommand)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbHPValue))
                            .addComponent(jLabel2))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbLevelValue))
                            .addComponent(pbExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMonsterName)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbMobHPValue, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbMonsterName)
                    .addComponent(jLabel5)
                    .addComponent(lbLevelValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(lbHPValue)
                        .addComponent(jLabel4)
                        .addComponent(lbMobHPValue))
                    .addComponent(pbExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCommand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCommandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCommandKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            String command = txtCommand.getText();
            if (!command.trim().isEmpty()){
                txtaMain.append("\n> " + command);
                txtCommand.setText("");
                commandClipBoard = command;

                TextTypeProcessor processor = new TextTypeProcessor(command, storyStep);
                int result = processor.analyzeCommand();
                switch(result){
                    case 0: //nothing
                        txtaMain.append("\nYou loafing around doing nothing...");
                        break;
                    case 1: // next
                        storyStep++;
                        advanceToNextStep();
                        break;
                    case 3: // combat
                        Monster mob = monsters.get(storyStep);  
                        lbMobHPValue.setText(mob.getCurrentHP()+"/"+mob.getMaxHP());
                        lbMonsterName.setText(mob.name);
                        CombatProcessor combatP = new CombatProcessor(mob, mainChar);                     
                        combatP.analyzeCombat(command, txtaSub);
                        lbMobHPValue.setText(mob.getCurrentHP()+"/"+mob.getMaxHP());
                        if (mob.getCurrentHP() <= 0){
                            txtaSub.append("\n" + mob.name + " died...");
                            gainExperience(mob);
                            storyStep++;
                            advanceToNextStep();
                        }        
                        else{
                             combatP.monsterRetaliate(txtaSub);
                            lbHPValue.setText(mainChar.getCurrentHP()+"/"+mainChar.getMaxHP());
                            if (mainChar.getCurrentHP() <= 0){
                                // Game over
                                JOptionPane.showMessageDialog(this, "You dead!");
                                System.exit(1);
                            }      
                        }                                                     
                        break;
                    case 2: // alternate route
                        storyStep += 2;
                        advanceToNextStep();
                        break;
                    case 4: // combat alternate
                        mob = monsters.get(storyStep);  
                        lbMobHPValue.setText(mob.getCurrentHP()+"/"+mob.getMaxHP());
                        lbMonsterName.setText(mob.name);
                        combatP = new CombatProcessor(mob, mainChar);                     
                        combatP.analyzeCombat(command, txtaSub);
                        lbMobHPValue.setText(mob.getCurrentHP()+"/"+mob.getMaxHP());
                        if (mob.getCurrentHP() <= 0){
                            txtaSub.append("\n" + mob.name + " died...");
                            gainExperience(mob);
                            storyStep += 2;
                            advanceToNextStep();
                        }        
                        else{
                             combatP.monsterRetaliate(txtaSub);
                            lbHPValue.setText(mainChar.getCurrentHP()+"/"+mainChar.getMaxHP());
                            if (mainChar.getCurrentHP() <= 0){
                                // Game over
                                JOptionPane.showMessageDialog(this, "You dead!");
                                System.exit(1);
                            }      
                        }                                                     
                        break;    
                }              
            }         
        }
        else if (evt.getKeyCode() == KeyEvent.VK_RIGHT){
            txtCommand.setText(commandClipBoard);
        }
    }//GEN-LAST:event_txtCommandKeyPressed
    
    private void advanceToNextStep(){
        txtaMain.append("\n");
        txtaMain.append(MainText.MainEvent[storyStep]);
        giveOrRemoveWeapon();
    }
    
    private void giveOrRemoveWeapon(){
        List<String> weaponInv = mainChar.getWeapons();
        switch(storyStep){
            case 1:
                weaponInv.add("branch");
                break;
            case 6:
                weaponInv.add("axe");
                weaponInv.remove("branch");
                break;
            default:
                break;
        }
    }
    
    private void gainExperience(Monster monster){
        int currentXP = mainChar.getCurrentXP();
        int maxXP = mainChar.getMaxXP();
        int level = mainChar.getLevel();
        int maxHP = mainChar.getMaxHP();
        int XP_Gain = monster.getExperience();       
        
        int tmp_XP = currentXP;
        txtaSub.append("\nGain " + XP_Gain + " experience!");
        currentXP += XP_Gain;
        do {                      
            if (currentXP >= maxXP){
                mainChar.setLevel(++level);
                mainChar.setCurrentXP(currentXP - maxXP);
                mainChar.setMaxXP(maxXP * 2);
                mainChar.setBothHP(maxHP + 5);
                //
                txtaSub.append("\nYou level up!");
                lbLevelValue.setText(mainChar.getLevel()+"");
                pbExperience.setMaximum(mainChar.getMaxXP());
                pbExperience.setValue(mainChar.getCurrentXP());
                lbHPValue.setText(mainChar.getCurrentHP()+"/"+mainChar.getMaxHP());
                //
                currentXP -= maxXP;
                maxXP *= 2;
                maxHP += 5;
            }
        } while (currentXP >= maxXP);
        /*if(currentXP >= maxXP){
            mainChar.setLevel(++level);
            mainChar.setCurrentXP(currentXP - maxXP);
            mainChar.setMaxXP(maxXP * 2);
            mainChar.setBothHP(maxHP + 5);
            //
            txtaSub.append("\nYou level up!");
            lbLevelValue.setText(mainChar.getLevel()+"");
            pbExperience.setMaximum(mainChar.getMaxXP());
            pbExperience.setValue(mainChar.getCurrentXP());
            lbHPValue.setText(mainChar.getCurrentHP()+"/"+mainChar.getMaxHP());
        }*/
    }
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbHPValue;
    private javax.swing.JLabel lbLevelValue;
    private javax.swing.JLabel lbMobHPValue;
    private javax.swing.JLabel lbMonsterName;
    private javax.swing.JProgressBar pbExperience;
    private javax.swing.JTextField txtCommand;
    private javax.swing.JTextArea txtaMain;
    private javax.swing.JTextArea txtaSub;
    // End of variables declaration//GEN-END:variables
}
