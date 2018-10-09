/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package micpro;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JColorChooser;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


import java.util.List;
import javax.swing.table.*;

public class Dye extends javax.swing.JFrame {
String hex="";
int no;
JFrame fr;
    /**
     * Creates new form Dye
     */
    public Dye(int number,JFrame ft) {
        fr=ft;
no=number;
        initComponents();
        getContentPane().setBackground(new java.awt.Color(245,245,245));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mDyeTextFieldDryingSpeed = new javax.swing.JTextField();
        mDyeTextFieldGCMICode = new javax.swing.JTextField();
        mDyeTextFieldQuantity = new javax.swing.JTextField();
        mDyeButtonAdd = new javax.swing.JButton();
        mDyeButtonCancel = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        mDyeComboBoxUnit = new javax.swing.JComboBox();
        mDyeComboBoxType = new javax.swing.JComboBox<>();
        mDyeButtonReset = new javax.swing.JButton();
        mDyeButtonColor = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        mDyeComboBoxBrand = new javax.swing.JComboBox();

 addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
               dispose();
                fr.setEnabled(true);
         }        
      });          
 //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Purchase Order Item");
        setBounds(new java.awt.Rectangle(466, 246, 433, 274));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()), "Dye", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel1.setText("Type");

        jLabel2.setText("Drying Speed");

        jLabel3.setText("GCMI Code");

        jLabel4.setText("Color Shade");

        jLabel6.setText("Quantity");

        mDyeTextFieldDryingSpeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDyeTextFieldDryingSpeedActionPerformed(evt);
            }
        });
        
        
         mDyeTextFieldDryingSpeed.addKeyListener(new KeyAdapter()        
        {
            public void keyTyped(KeyEvent e)
            {
                char c=e.getKeyChar();
                 if(((c<'0') || (c>'9')) && (c!=KeyEvent.VK_BACK_SPACE))
	
          	 {
                    e.consume();//ignore event
                    }
                else if(mDyeTextFieldDryingSpeed.getText().length()>=5)
                {
                   e.consume();
                }
               
            }
        });
    
         mDyeTextFieldGCMICode.addKeyListener(new KeyAdapter()        
        {
            public void keyTyped(KeyEvent e)
            {
                char c=e.getKeyChar();
	if(((c<'0') || (c>'9')) && (c!=KeyEvent.VK_BACK_SPACE))
	{
                    e.consume();//ignore event
                   }
                else if(mDyeTextFieldGCMICode.getText().length()>=5)
                {
                   e.consume();
                }
               
            }
        });

         
          mDyeTextFieldQuantity.addKeyListener(new KeyAdapter()        
        {
            public void keyTyped(KeyEvent e)
            {
                char c=e.getKeyChar();
                if(((c<'0') || (c>'9')) && (c!=KeyEvent.VK_BACK_SPACE))
                {
                    e.consume();//ignore event
                }
                else if(mDyeTextFieldQuantity.getText().length()>=5)
                {
                   e.consume();
                }
               
            }
        });
         
        mDyeButtonAdd.setText("Add");
        mDyeButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDyeButtonAddActionPerformed(evt);
            }
        });

        mDyeButtonCancel.setText("Cancel");
        mDyeButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDyeButtonCancelActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hr", "Min", "Sec" }));
        mDyeComboBoxUnit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kg", "Litre", "Bottle", "Unit" }));
        mDyeComboBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","Acid", "Natural", "Synthetic", "Pigment", "Mordant" }));
        mDyeButtonReset.setText("Reset");
        mDyeButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDyeButtonResetActionPerformed(evt);
            }
        });

        mDyeButtonColor.setText("Select Color");
        mDyeButtonColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDyeButtonColorActionPerformed(evt);
            }
        });

        jLabel5.setText("Brand");

        mDyeComboBoxBrand.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select","Boss", "Dux", "Lixin", "Doctor" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mDyeButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(mDyeTextFieldGCMICode, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                .addComponent(mDyeComboBoxType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(mDyeTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mDyeComboBoxUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(mDyeButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mDyeButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(mDyeComboBoxBrand, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mDyeButtonColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(mDyeTextFieldDryingSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mDyeComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mDyeTextFieldDryingSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mDyeTextFieldGCMICode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mDyeButtonColor))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mDyeTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mDyeComboBoxUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mDyeComboBoxBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mDyeButtonAdd)
                    .addComponent(mDyeButtonCancel)
                    .addComponent(mDyeButtonReset))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void mDyeTextFieldDryingSpeedActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

   private void mDyeButtonResetActionPerformed(java.awt.event.ActionEvent evt) {                                                
   mDyeTextFieldDryingSpeed.setText("");
   mDyeComboBoxType.setSelectedIndex(0);
   mDyeComboBoxUnit.setSelectedIndex(0);
   mDyeComboBoxBrand.setSelectedIndex(0);
   jComboBox1.setSelectedIndex(0);
   mDyeTextFieldGCMICode.setText("");
   hex=" ";
   mDyeTextFieldQuantity.setText("");

        // TODO add your handling code here:
    }                                               

    private void mDyeButtonAddActionPerformed(java.awt.event.ActionEvent evt) {                                              
      
     if((mDyeComboBoxType.getSelectedItem().toString().equals("Select"))) 
        {
            JOptionPane.showMessageDialog(new JFrame(),"Select Box Type");
        }       
     else if((mDyeTextFieldDryingSpeed.getText().trim().equals(""))) 
        {
            JOptionPane.showMessageDialog(new JFrame(),"Fill Drying Speed");
        }
     else if((mDyeTextFieldGCMICode.getText().trim().equals(""))) 
        {
            JOptionPane.showMessageDialog(new JFrame(),"Fill GCMI Code");
        }
     
     
     else if((mDyeTextFieldQuantity.getText().trim().equals(""))) 
        {
            JOptionPane.showMessageDialog(new JFrame(),"Fill Quantity");
        }
     else if(hex.equals("")) 
        {
            JOptionPane.showMessageDialog(new JFrame(),"Please select color");
        }
     
     else if((mDyeComboBoxBrand.getSelectedItem().toString().equals("Select")))
        {
            JOptionPane.showMessageDialog(new JFrame(),"Select Brand");
        }
//     else if((mDyeComboBoxUnit.getSelectedItem().toString().equals("Select")))
//        {
//            JOptionPane.showMessageDialog(new JFrame(),"Select Unit");
//        }
     else{

String a=(String)mDyeComboBoxType.getSelectedItem();
String aa=(String)jComboBox1.getSelectedItem();
String k=(String)mDyeComboBoxUnit.getSelectedItem();
String d=(String)mDyeComboBoxBrand.getSelectedItem();
String b= mDyeTextFieldDryingSpeed.getText();
String c= mDyeTextFieldGCMICode.getText();
String f=mDyeTextFieldQuantity.getText();
String desc=a+", "+b+" "+aa+", "+c+", "+hex+", "+d;     //////////hex? and validation for GCMIcode?

mDyeTextFieldDryingSpeed.setText("");
mDyeComboBoxType.setSelectedIndex(0);
mDyeComboBoxUnit.setSelectedIndex(0);
mDyeComboBoxBrand.setSelectedIndex(0);
jComboBox1.setSelectedIndex(0);
mDyeTextFieldGCMICode.setText("");
hex=" ";
mDyeTextFieldQuantity.setText("");

if(no==1)
{  
PurchaseOrder.abc("Dye",desc,f+" "+k);// TODO add your handling code here:
}
else if(no==2)
{
AddStock1.abc("Dye",desc,f+" "+k);// TODO add your handling code here:
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

// TODO add your handling code here:
             }
    
    }                         

    private void mDyeButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {                                                 
dispose();        // TODO add your handling code here:
   fr.setEnabled(true);
    }                                                

    private void mDyeButtonColorActionPerformed(java.awt.event.ActionEvent evt) {                                                
     JColorChooser jcc = new JColorChooser();
     Color color=JColorChooser.showDialog(this,"Select a color",Color.BLUE); // TODO add your handling code here:
    if(color!=null)
    {
       hex=Integer.toHexString(color.getRGB() &0xffffff);
      hex="#"+hex;
    
    }
       // else
//         {
//		  JOptionPane.showMessageDialog(new JFrame(),"Please Select Color");    
  //        }
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
            java.util.logging.Logger.getLogger(Dye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dye(0,new JFrame()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mDyeButtonAdd;
    private javax.swing.JButton mDyeButtonCancel;
    private javax.swing.JButton mDyeButtonColor;
    private javax.swing.JButton mDyeButtonReset;
    private javax.swing.JComboBox mDyeComboBoxBrand;
    private javax.swing.JComboBox<String> mDyeComboBoxType;
    private javax.swing.JComboBox mDyeComboBoxUnit;
    private javax.swing.JTextField mDyeTextFieldDryingSpeed;
    private javax.swing.JTextField mDyeTextFieldGCMICode;
    private javax.swing.JTextField mDyeTextFieldQuantity;
    // End of variables declaration                   
}

