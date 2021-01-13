
import java.awt.CardLayout;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ifaldzi
 */
public class ATMGUI extends javax.swing.JFrame {
    private boolean inputPin;
    private ATM atm;
    /**
     * Creates new form ATMGUI
     */
    public ATMGUI() {
        initComponents();
        inputPin = false;
        atm = new ATM();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        screen = new javax.swing.JPanel();
        loginMenu = new javax.swing.JPanel();
        titleLoginLabel = new javax.swing.JLabel();
        inputAccNumLabel = new javax.swing.JLabel();
        noAccTxtField = new javax.swing.JTextField();
        enterLabel = new javax.swing.JLabel();
        inputPinLabel = new javax.swing.JLabel();
        cancelLabel = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        pinField = new javax.swing.JPasswordField();
        penarikan = new javax.swing.JPanel();
        numPad = new javax.swing.JPanel();
        num1 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        rightChooseBtn1 = new javax.swing.JButton();
        rightChooseBtn2 = new javax.swing.JButton();
        rightChooseBtn3 = new javax.swing.JButton();
        rightChooseBtn4 = new javax.swing.JButton();
        leftChooseBtn1 = new javax.swing.JButton();
        leftChooseBtn2 = new javax.swing.JButton();
        leftChooseBtn3 = new javax.swing.JButton();
        leftChooseBtn4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        screen.setBackground(new java.awt.Color(0, 51, 255));
        screen.setLayout(new java.awt.CardLayout());

        loginMenu.setBackground(new java.awt.Color(0, 51, 255));

        titleLoginLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        titleLoginLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLoginLabel.setText("SELAMAT DATANG DI ATM PARADISO");

        inputAccNumLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputAccNumLabel.setForeground(new java.awt.Color(255, 255, 255));
        inputAccNumLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inputAccNumLabel.setText("MASUKKAN  NO.AKUN ANDA");

        noAccTxtField.setEditable(false);
        noAccTxtField.setBackground(new java.awt.Color(0, 51, 255));
        noAccTxtField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        noAccTxtField.setForeground(new java.awt.Color(255, 255, 255));
        noAccTxtField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        enterLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        enterLabel.setText("ENTER >>");

        inputPinLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputPinLabel.setForeground(new java.awt.Color(255, 255, 255));
        inputPinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inputPinLabel.setText("MASUKKAN PIN ANDA");

        cancelLabel.setForeground(new java.awt.Color(255, 255, 255));
        cancelLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cancelLabel.setText("CANCEL >>");

        infoLabel.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel.setText("<html>Masukkan no.akun dan PIN anda<br/>Lalu tekan enter<br/>Tekan Cancel untuk keluar</html>");

        pinField.setBackground(new java.awt.Color(0, 51, 255));
        pinField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pinField.setForeground(new java.awt.Color(255, 255, 255));
        pinField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout loginMenuLayout = new javax.swing.GroupLayout(loginMenu);
        loginMenu.setLayout(loginMenuLayout);
        loginMenuLayout.setHorizontalGroup(
            loginMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginMenuLayout.createSequentialGroup()
                .addGroup(loginMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginMenuLayout.createSequentialGroup()
                        .addContainerGap(100, Short.MAX_VALUE)
                        .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(loginMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputPinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginMenuLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(noAccTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(enterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(titleLoginLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputAccNumLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(loginMenuLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(pinField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginMenuLayout.setVerticalGroup(
            loginMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputAccNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(loginMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noAccTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(inputPinLabel)
                .addGap(18, 18, 18)
                .addComponent(pinField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(loginMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginMenuLayout.createSequentialGroup()
                        .addGap(0, 42, Short.MAX_VALUE)
                        .addComponent(cancelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(infoLabel))
                .addContainerGap())
        );

        screen.add(loginMenu, "loginMenu");

        penarikan.setBackground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout penarikanLayout = new javax.swing.GroupLayout(penarikan);
        penarikan.setLayout(penarikanLayout);
        penarikanLayout.setHorizontalGroup(
            penarikanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        penarikanLayout.setVerticalGroup(
            penarikanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        screen.add(penarikan, "penarikan");

        numPad.setBackground(new java.awt.Color(255, 255, 255));

        num1.setText("1");
        num1.setMaximumSize(new java.awt.Dimension(39, 25));
        num1.setMinimumSize(new java.awt.Dimension(39, 25));
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        num2.setText("2");
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        num3.setText("3");
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        num4.setText("4");
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });

        num5.setText("5");
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });

        num6.setText("6");
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });

        num7.setText("7");
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });

        num8.setText("8");
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });

        num9.setText("9");
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });

        num0.setText("0");
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout numPadLayout = new javax.swing.GroupLayout(numPad);
        numPad.setLayout(numPadLayout);
        numPadLayout.setHorizontalGroup(
            numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numPadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(num0, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(num7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(numPadLayout.createSequentialGroup()
                        .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(num8, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(num2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(num6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(num3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(num9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        numPadLayout.setVerticalGroup(
            numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numPadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2)
                    .addComponent(num3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num4)
                    .addComponent(num5)
                    .addComponent(num6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num7)
                    .addComponent(num8)
                    .addComponent(num9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num0)
                    .addComponent(deleteButton))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        rightChooseBtn1.setText("Pilih");
        rightChooseBtn1.setPreferredSize(new java.awt.Dimension(60, 25));
        rightChooseBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightChooseBtn1ActionPerformed(evt);
            }
        });

        rightChooseBtn2.setText("Pilih");
        rightChooseBtn2.setPreferredSize(new java.awt.Dimension(60, 25));

        rightChooseBtn3.setText("Pilih");
        rightChooseBtn3.setPreferredSize(new java.awt.Dimension(60, 25));

        rightChooseBtn4.setText("Pilih");
        rightChooseBtn4.setPreferredSize(new java.awt.Dimension(60, 25));

        leftChooseBtn1.setText("Pilih");
        leftChooseBtn1.setPreferredSize(new java.awt.Dimension(60, 25));

        leftChooseBtn2.setText("Pilih");
        leftChooseBtn2.setPreferredSize(new java.awt.Dimension(60, 25));

        leftChooseBtn3.setText("Pilih");
        leftChooseBtn3.setPreferredSize(new java.awt.Dimension(60, 25));

        leftChooseBtn4.setText("Pilih");
        leftChooseBtn4.setPreferredSize(new java.awt.Dimension(60, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(numPad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(leftChooseBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(leftChooseBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(leftChooseBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(leftChooseBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(screen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rightChooseBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rightChooseBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rightChooseBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rightChooseBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(rightChooseBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rightChooseBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rightChooseBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rightChooseBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(leftChooseBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(leftChooseBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(leftChooseBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(leftChooseBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(numPad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        addInput("1");
    }//GEN-LAST:event_num1ActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        addInput("Delete");
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        addInput("2");
    }//GEN-LAST:event_num2ActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
        addInput("3");
    }//GEN-LAST:event_num3ActionPerformed

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
        addInput("4");
    }//GEN-LAST:event_num4ActionPerformed

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
        addInput("5");
    }//GEN-LAST:event_num5ActionPerformed

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
        addInput("6");
    }//GEN-LAST:event_num6ActionPerformed

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
        addInput("7");
    }//GEN-LAST:event_num7ActionPerformed

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
        addInput("8");
    }//GEN-LAST:event_num8ActionPerformed

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
        addInput("9");
    }//GEN-LAST:event_num9ActionPerformed

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
        addInput("0");
    }//GEN-LAST:event_num0ActionPerformed

    private void rightChooseBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightChooseBtn1ActionPerformed
        if(pinField.getPassword().length == 0)
            inputPin = true;
        else
            login();
    }//GEN-LAST:event_rightChooseBtn1ActionPerformed

    private void addInput(String input){
        JTextField textField = new JTextField();
        if("loginMenu".equals(atm.getScreen()))
            if(!inputPin)
                textField = noAccTxtField;
            else
                textField = pinField;
        String text = textField.getText();
        if(!input.equals("Delete"))
            text += input;
        else
            if(text.length() != 0)
                text = text.substring(0, text.length() -1);
        textField.setText(text);
    }
    
    public void login(){
        int accountNumber = Integer.parseInt(noAccTxtField.getText());
        char[] pinChar = pinField.getPassword();
        int pin = Integer.parseInt(new String(pinChar));
        
        Account account = atm.findAccount(accountNumber);
        CardLayout card = (CardLayout) screen.getLayout();
        if(account.validatePin(pin)){
            atm.setScreen("penarikan");
            card.show(screen, "penarikan");
        }
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
            java.util.logging.Logger.getLogger(ATMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATMGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ATMGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel enterLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel inputAccNumLabel;
    private javax.swing.JLabel inputPinLabel;
    private javax.swing.JButton leftChooseBtn1;
    private javax.swing.JButton leftChooseBtn2;
    private javax.swing.JButton leftChooseBtn3;
    private javax.swing.JButton leftChooseBtn4;
    private javax.swing.JPanel loginMenu;
    private javax.swing.JTextField noAccTxtField;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JPanel numPad;
    private javax.swing.JPanel penarikan;
    private javax.swing.JPasswordField pinField;
    private javax.swing.JButton rightChooseBtn1;
    private javax.swing.JButton rightChooseBtn2;
    private javax.swing.JButton rightChooseBtn3;
    private javax.swing.JButton rightChooseBtn4;
    private javax.swing.JPanel screen;
    private javax.swing.JLabel titleLoginLabel;
    // End of variables declaration//GEN-END:variables
}
