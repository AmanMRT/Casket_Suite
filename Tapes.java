/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package micpro;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class Tapes extends javax.swing.JFrame {
JFrame fr;
    /**
     * Creates new form NewJFrame
     */
    int no;
    public Tapes(int number,JFrame ft) {
        fr=ft;
no=number;        
initComponents();
        getContentPane().setBackground(new java.awt.Color(245,245,245));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mTapesTextFieldTotalThickness = new javax.swing.JTextField();
        mTapesTextFieldElongationAtBreak = new javax.swing.JTextField();
        mTapesTextFieldQuantity = new javax.swing.JTextField();
        mTapesButtonAdd = new javax.swing.JButton();
        mTapesButtonCancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        mTapesComboBoxBacking = new javax.swing.JComboBox();
        mTapesComboBoxUnit3 = new javax.swing.JComboBox();
        mTapesComboBoxType = new javax.swing.JComboBox();
        mTapesComboBoxUnit1 = new javax.swing.JComboBox();
        mTapesComboBoxUnit2 = new javax.swing.JComboBox();
        mTapesComboBoxColor = new javax.swing.JComboBox();
        mTapesButtonReset = new javax.swing.JButton();
 addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
               dispose();
                fr.setEnabled(true);
         }        
      });    
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Purchase Order Tapes");
        setBounds(new java.awt.Rectangle(475, 271, 417, 227));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()), "Tapes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel1.setText("Backing Material");

        jLabel2.setText("Type");

        jLabel3.setText("Total Thickness");

        jLabel4.setText("Length");
        
        
        mTapesTextFieldElongationAtBreak.addKeyListener(new KeyAdapter() 
        {
            public void keyTyped(KeyEvent e)
            {
                char c=e.getKeyChar();
                if((c<'0') || (c>'9')&& (c!=KeyEvent.VK_BACK_SPACE))        /////////////////////////doubts
                {
                    e.consume();//ignore event
                }
                else if(mTapesTextFieldElongationAtBreak.getText().length()>=6)
                {
                   e.consume();
                }
                
            }
        });

        jLabel5.setText("Quantity");

        
        mTapesTextFieldQuantity.addKeyListener(new KeyAdapter() 
        {
            public void keyTyped(KeyEvent e)
            {
                char c=e.getKeyChar();
                if((c<'0') || (c>'9')&& (c!=KeyEvent.VK_BACK_SPACE))
                {
                    e.consume();//ignore event
                }
                else if(mTapesTextFieldQuantity.getText().length()>=6)
                {
                   e.consume();
                }
            }
        });
        
        
        mTapesTextFieldTotalThickness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTapesTextFieldTotalThicknessActionPerformed(evt);
            }
        });

        mTapesTextFieldTotalThickness.addKeyListener(new KeyAdapter() 
        {
            public void keyTyped(KeyEvent e)
            {
                char c=e.getKeyChar();
                if((c<'0') || (c>'9')&& (c!=KeyEvent.VK_BACK_SPACE))
                {
                    e.consume();//ignore event
                }
                else if(mTapesTextFieldTotalThickness.getText().length()>=6)
                {
                   e.consume();
                }
                
            }
        });
        
        
        mTapesTextFieldElongationAtBreak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTapesTextFieldElongationAtBreakActionPerformed(evt);
            }
        });

        mTapesButtonAdd.setText("Add");
        mTapesButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTapesButtonAddActionPerformed(evt);
            }
        });

        mTapesButtonCancel.setText("Cancel");
        mTapesButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTapesButtonCancelActionPerformed(evt);
            }
        });

        jLabel6.setText("Color");

        mTapesComboBoxBacking.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select","PVC", "PET", "PP", "PE" }));

        mTapesComboBoxUnit3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kg", "Unit ", "Box" }));

        mTapesComboBoxType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select","Box Sealing", "Double Sided", "Gaffer", "Gorilla" }));

        mTapesComboBoxUnit1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "mm", "cm", "inch" }));

        mTapesComboBoxUnit2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "m", "cm", "inch" }));
        mTapesComboBoxUnit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTapesComboBoxUnit2ActionPerformed(evt);
            }
        });

        mTapesComboBoxColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Select", "White", "Black", "Brown", "Red", "Green" }));

        mTapesButtonReset.setText("Reset");
        mTapesButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTapesButtonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addComponent(mTapesComboBoxBacking, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(mTapesTextFieldTotalThickness, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mTapesComboBoxUnit1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(mTapesComboBoxColor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(mTapesButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mTapesComboBoxType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(mTapesButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mTapesButtonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(mTapesTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mTapesComboBoxUnit3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(mTapesTextFieldElongationAtBreak, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mTapesComboBoxUnit2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mTapesComboBoxBacking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mTapesComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mTapesTextFieldTotalThickness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mTapesTextFieldElongationAtBreak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mTapesComboBoxUnit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mTapesComboBoxUnit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mTapesTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mTapesComboBoxUnit3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mTapesComboBoxColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mTapesButtonAdd)
                    .addComponent(mTapesButtonCancel)
                    .addComponent(mTapesButtonReset))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void mTapesTextFieldTotalThicknessActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        // TODO add your handling code here:
    }                                                             

    private void mTapesButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
        dispose();
         fr.setEnabled(true);
    }                                                  

    private void mTapesTextFieldElongationAtBreakActionPerformed(java.awt.event.ActionEvent evt) {                                                                 
        // TODO add your handling code here:
    }                                                                

    private void mTapesButtonResetActionPerformed(java.awt.event.ActionEvent evt) {                                                  
    mTapesComboBoxBacking.setSelectedIndex(0);
    mTapesComboBoxType.setSelectedIndex(0);
    mTapesTextFieldTotalThickness.setText("");
   mTapesTextFieldElongationAtBreak.setText("");
   mTapesComboBoxColor.setSelectedIndex(0);
    mTapesComboBoxUnit1.setSelectedIndex(0);
    mTapesComboBoxUnit2.setSelectedIndex(0);
    mTapesComboBoxUnit3.setSelectedIndex(0);
    mTapesTextFieldQuantity.setText("");
        
// TODO add your handling code here:
    }                                                 

    private void mTapesButtonAddActionPerformed(java.awt.event.ActionEvent evt) {                                                
       
      if((mTapesComboBoxBacking.getSelectedItem().toString().equals("Select")))
        {
            JOptionPane.showMessageDialog(new JFrame(),"Select Backing Material");
        }
      else if((mTapesComboBoxType.getSelectedItem().toString().equals("Select"))) 
        {
            JOptionPane.showMessageDialog(new JFrame(),"Select Box Type");
        }
     else if((mTapesTextFieldTotalThickness.getText().trim().equals(""))) 
        {
            JOptionPane.showMessageDialog(new JFrame(),"Fill Thickness");
        }
     else if((mTapesTextFieldElongationAtBreak.getText().trim().equals("")))
        {
            JOptionPane.showMessageDialog(new JFrame(),"Fill Length");
        }        
     else if((mTapesComboBoxColor.getSelectedItem().toString().equals("Select"))) 
        {
            JOptionPane.showMessageDialog(new JFrame(),"Select Color");
        }
    else if((mTapesTextFieldQuantity.getText().trim().equals(""))) 
        {
            JOptionPane.showMessageDialog(new JFrame(),"Fill Quantity");
        }
     
//     else if((mDyeComboBoxUnit.getSelectedItem().toString().equals("Select")))
//        {
//            JOptionPane.showMessageDialog(new JFrame(),"Select Unit");
//        }
     else{
        
        
   String a=(String)mTapesComboBoxBacking.getSelectedItem();
   String b=(String)mTapesComboBoxType.getSelectedItem();
   String c= mTapesTextFieldTotalThickness.getText();
   String d= mTapesTextFieldElongationAtBreak.getText();
   String e= (String)mTapesComboBoxColor.getSelectedItem();
   String f=mTapesTextFieldQuantity.getText();
   String g=(String)mTapesComboBoxUnit1.getSelectedItem();
   String h=(String)mTapesComboBoxUnit2.getSelectedItem();
   String i=(String)mTapesComboBoxUnit3.getSelectedItem();
   String desc=a+", "+b+", "+c+" "+g+", "+d+" "+h+", "+e;

    mTapesComboBoxBacking.setSelectedIndex(0);
    mTapesComboBoxType.setSelectedIndex(0);
    mTapesTextFieldTotalThickness.setText("");
   mTapesTextFieldElongationAtBreak.setText("");
   mTapesComboBoxColor.setSelectedIndex(0);
    mTapesComboBoxUnit1.setSelectedIndex(0);
    mTapesComboBoxUnit2.setSelectedIndex(0);
    mTapesComboBoxUnit3.setSelectedIndex(0);
    mTapesTextFieldQuantity.setText("");
  

if(no==1)
{
PurchaseOrder.abc("Tapes",desc,f+" "+i);// TODO add your handling code here:
}
else if(no==2)
{
AddStock1.abc("Tapes",desc,f+" "+i);// TODO add your handling code here:
}
else
{
}

Object[] options = {"ADD MORE","DONE"};
int n = JOptionPane.showOptionDialog(null,
            "Item Added Successfully",
            "Message",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.DEFAULT_OPTION,
            null,
            options,
            options[1]); 

if(n==0){  
    fr.setEnabled(true);

}else if(n==1){
dispose();
fr.setEnabled(true);

}else{
    System.out.println("no option chossen");
} 
//JOptionPane.showMessageDialog(new javax.swing.JFrame(),"Item added successfully");
     }
    }                                               

    private void mTapesComboBoxUnit2ActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Tapes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tapes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tapes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tapes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tapes(0,new JFrame()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mTapesButtonAdd;
    private javax.swing.JButton mTapesButtonCancel;
    private javax.swing.JButton mTapesButtonReset;
    private javax.swing.JComboBox mTapesComboBoxBacking;
    private javax.swing.JComboBox mTapesComboBoxColor;
    private javax.swing.JComboBox mTapesComboBoxType;
    private javax.swing.JComboBox mTapesComboBoxUnit1;
    private javax.swing.JComboBox mTapesComboBoxUnit2;
    private javax.swing.JComboBox mTapesComboBoxUnit3;
    private javax.swing.JTextField mTapesTextFieldElongationAtBreak;
    private javax.swing.JTextField mTapesTextFieldQuantity;
    private javax.swing.JTextField mTapesTextFieldTotalThickness;
    // End of variables declaration                   
}

