/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chloe Larsen, Rene Kruger & Kayla Beyers
 */
import javax.swing.*;
public class ChooseUser extends javax.swing.JFrame {
    private String name = "";//Initialise and Sets a default value to the name variable that stores the name of the person that was choosen
    private static String sql = "";//Initialise and Sets a defult value to the sql variable which stores the sql statement that will be used for the rest of the program until it is ended or another name is chosen.
    
    
    private void setSQL(int id){//helper method that creates the sql statement with the read in user id;
        sql = "SELECT * FROM tblRide WHERE UserID = " + id;
    }

    public String getSQL() {//accessor method that helps classes outside of the ChooseUser class to access the sql statement
        return sql;
    }                
    /**
     * Creates new form ChooseUser
     */
    public ChooseUser() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUserChoice = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblGetStarted = new javax.swing.JLabel();
        pnlChooseUser = new javax.swing.JPanel();
        comBoxUserChoice = new javax.swing.JComboBox<>();
        btnNextFrame = new javax.swing.JButton();
        lblUserChoice = new javax.swing.JLabel();
        btnQuestion = new javax.swing.JButton();
        lblCity = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Choose A User");

        pnlUserChoice.setBackground(new java.awt.Color(255, 255, 255));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Uber Carbon Calculator Logo.png"))); // NOI18N

        lblGetStarted.setFont(new java.awt.Font("Uber Move", 1, 24)); // NOI18N
        lblGetStarted.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGetStarted.setText("Let's get started.");

        pnlChooseUser.setBackground(new java.awt.Color(255, 255, 255));
        pnlChooseUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 5, true));

        comBoxUserChoice.setFont(new java.awt.Font("Uber Move", 0, 20)); // NOI18N
        comBoxUserChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "null", "John Smith", "Jane Doe", "Robert Johnson", "Sarah White", "Micheal Brown", "Emily Davis", "David Lee" }));

        btnNextFrame.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnNextFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Let's Go Button.png"))); // NOI18N
        btnNextFrame.setBorder(null);
        btnNextFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextFrameActionPerformed(evt);
            }
        });

        lblUserChoice.setFont(new java.awt.Font("Uber Move", 0, 20)); // NOI18N
        lblUserChoice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserChoice.setText("Choose a user:");

        btnQuestion.setFont(new java.awt.Font("Uber Move", 0, 20)); // NOI18N
        btnQuestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Question Button.png"))); // NOI18N
        btnQuestion.setBorder(null);
        btnQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuestionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlChooseUserLayout = new javax.swing.GroupLayout(pnlChooseUser);
        pnlChooseUser.setLayout(pnlChooseUserLayout);
        pnlChooseUserLayout.setHorizontalGroup(
            pnlChooseUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChooseUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNextFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChooseUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlChooseUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChooseUserLayout.createSequentialGroup()
                        .addComponent(lblUserChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChooseUserLayout.createSequentialGroup()
                        .addComponent(comBoxUserChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)))
                .addComponent(btnQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlChooseUserLayout.setVerticalGroup(
            pnlChooseUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChooseUserLayout.createSequentialGroup()
                .addGroup(pnlChooseUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlChooseUserLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlChooseUserLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblUserChoice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comBoxUserChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(btnNextFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        lblCity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/city.png"))); // NOI18N

        javax.swing.GroupLayout pnlUserChoiceLayout = new javax.swing.GroupLayout(pnlUserChoice);
        pnlUserChoice.setLayout(pnlUserChoiceLayout);
        pnlUserChoiceLayout.setHorizontalGroup(
            pnlUserChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblGetStarted, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserChoiceLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCity))
            .addGroup(pnlUserChoiceLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(pnlChooseUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlUserChoiceLayout.setVerticalGroup(
            pnlUserChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserChoiceLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblLogo)
                .addGap(18, 18, 18)
                .addComponent(lblGetStarted)
                .addGap(31, 31, 31)
                .addComponent(pnlChooseUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnlUserChoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnlUserChoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextFrameActionPerformed
        if (!(comBoxUserChoice.getSelectedItem() + "").equalsIgnoreCase("null")){//If statement to check that the user has been chosen
            ChooseCarbonReport jFChooseCarbonReport = new ChooseCarbonReport();//Creating an object to access the next JFrame
            jFChooseCarbonReport.show(); // Opening JFrame with ChooseCarbonReport
            dispose(); // closing ChooseUser JFrame   
            name = comBoxUserChoice.getSelectedItem() + "";//sets the name variable with the value that was selected
            if(name.equalsIgnoreCase("John Smith")){//checks if the  name is John Smith
                setSQL(3);//if it is create the sql statement, "SELECT * FROM tblRide WHERE UserID = 3"
            }else if(name.equalsIgnoreCase("Jane Doe")){//checks if the  name is Jane Doe
                setSQL(4);//if it is create the sql statement, "SELECT * FROM tblRide WHERE UserID = 4"
            }else if(name.equalsIgnoreCase("Robert Johnson")){//checks if the  name is Robert Johnson
                setSQL(5);//if it is create the sql statement, "SELECT * FROM tblRide WHERE UserID = 5"
            }else if(name.equalsIgnoreCase("Sarah White")){//checks if the  name is Sarah White
                setSQL(6);//if it is create the sql statement, "SELECT * FROM tblRide WHERE UserID = 6"
            }else if(name.equalsIgnoreCase("Michael Brown")){//checks if the  name is Michael Brown
                setSQL(7);//if it is create the sql statement, "SELECT * FROM tblRide WHERE UserID = 7"
            }else if(name.equalsIgnoreCase("Emily Davis")){//checks if the  name is Emily Davis
                setSQL(8);//if it is create the sql statement, "SELECT * FROM tblRide WHERE UserID = 8"
            }else if(name.equalsIgnoreCase("David Lee")){//checks if the  name is David Lee
                setSQL(9);//if it is create the sql statement, "SELECT * FROM tblRide WHERE UserID = 9"
            }
            
        } else{//If no user is chosen
            JOptionPane.showMessageDialog(null, "Please choose a user");
        }    
    }//GEN-LAST:event_btnNextFrameActionPerformed

    private void btnQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuestionActionPerformed
        JOptionPane.showMessageDialog(null, "Choose a user from our sample group");//If the user doesn't know what to do then they click the question mark button and it gives instructions
    }//GEN-LAST:event_btnQuestionActionPerformed

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
                if ("FlatLaf Light".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChooseUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNextFrame;
    private javax.swing.JButton btnQuestion;
    private javax.swing.JComboBox<String> comBoxUserChoice;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblGetStarted;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblUserChoice;
    private javax.swing.JPanel pnlChooseUser;
    private javax.swing.JPanel pnlUserChoice;
    // End of variables declaration//GEN-END:variables
}
