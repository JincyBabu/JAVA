/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Student
 */
public class calculator extends javax.swing.JFrame {
int num1=0,num2=0,flag=0;
    /**
     * Creates new form calculator
     */
    public calculator() {
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

        textField1 = new java.awt.TextField();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();
        button6 = new java.awt.Button();
        button7 = new java.awt.Button();
        button8 = new java.awt.Button();
        button9 = new java.awt.Button();
        button10 = new java.awt.Button();
        button11 = new java.awt.Button();
        button12 = new java.awt.Button();
        button13 = new java.awt.Button();
        button14 = new java.awt.Button();
        button15 = new java.awt.Button();
        button16 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField1MouseClicked(evt);
            }
        });
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });

        button1.setLabel("7");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setLabel("8");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setLabel("9");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setLabel("+");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setLabel("4");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setLabel("5");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button7.setLabel("6");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setLabel("1");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button9.setLabel("2");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        button10.setLabel("3");
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });

        button11.setLabel("-");
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });

        button12.setLabel("*");
        button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button12ActionPerformed(evt);
            }
        });

        button13.setLabel("/");
        button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button13ActionPerformed(evt);
            }
        });

        button14.setLabel("0");
        button14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button14ActionPerformed(evt);
            }
        });

        button15.setLabel("=");
        button15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button15ActionPerformed(evt);
            }
        });

        button16.setLabel("C");
        button16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(textField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
textField1.setText(textField1.getText() + "7");
// TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
textField1.setText(textField1.getText() + "8");
        // TODO add your handling code here:
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
textField1.setText(textField1.getText() + "9");
        // TODO add your handling code here:
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // +
        flag=1;
        num1=Integer.parseInt(textField1.getText());
        textField1.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_button4ActionPerformed

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
textField1.setText(textField1.getText() + "1");        // TODO add your handling code here:
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
textField1.setText(textField1.getText() + "2");        // TODO add your handling code here:
    }//GEN-LAST:event_button9ActionPerformed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
textField1.setText(textField1.getText() + "3");        // TODO add your handling code here:
    }//GEN-LAST:event_button10ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
textField1.setText(textField1.getText() + "4");        // TODO add your handling code here:
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
textField1.setText(textField1.getText() + "5");        // TODO add your handling code here:
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
textField1.setText(textField1.getText() + "6");        // TODO add your handling code here:
    }//GEN-LAST:event_button7ActionPerformed

    private void button14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button14ActionPerformed
textField1.setText(textField1.getText() + "0");        // TODO add your handling code here:
    }//GEN-LAST:event_button14ActionPerformed

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
        // -
        flag=2;
        num1=Integer.parseInt(textField1.getText());
        textField1.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_button11ActionPerformed

    private void button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button12ActionPerformed
        // *
        flag=3;
        num1=Integer.parseInt(textField1.getText());
        textField1.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_button12ActionPerformed

    private void button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button13ActionPerformed
        // /
        flag=4;
        num1=Integer.parseInt(textField1.getText());
        textField1.setText("");       // TODO add your handling code here:
    }//GEN-LAST:event_button13ActionPerformed

    private void button16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button16ActionPerformed
textField1.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_button16ActionPerformed

    private void textField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField1MouseClicked
    textField1.setText("Mouse Clicked");        // TODO add your handling code here:
    }//GEN-LAST:event_textField1MouseClicked

    private void button15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button15ActionPerformed
        // =
        int sum,sub,mul,div;
        num2=Integer.parseInt(textField1.getText());
        if(flag == 1)
        {
            sum=num1+num2;
            textField1.setText(""+sum);
        }
        else if(flag == 2 )
        {
            sub=num1-num2;
            textField1.setText(""+sub);
        }
        else if(flag == 3)
        {
            mul=num1*num2;
            textField1.setText(""+mul);
        }
        else if(flag == 4)
        {
            div=num1/num2;
            textField1.setText(""+div);
        }
        else
        {
            textField1.setText("");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_button15ActionPerformed

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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button10;
    private java.awt.Button button11;
    private java.awt.Button button12;
    private java.awt.Button button13;
    private java.awt.Button button14;
    private java.awt.Button button15;
    private java.awt.Button button16;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Button button6;
    private java.awt.Button button7;
    private java.awt.Button button8;
    private java.awt.Button button9;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}