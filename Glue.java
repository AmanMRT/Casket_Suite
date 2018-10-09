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


public class Glue extends javax.swing.JFrame {
int no;
  JFrame fr;  
    public Glue(int number,JFrame ft) {
fr=ft;
no=number;
        initComponents();
         getContentPane().setBackground(new java.awt.Color(245,245,245));
    setLocation(479, 250);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mGlueButtonAdd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mGlueButtonCancel = new javax.swing.JButton();
        mGlueTextfieldQuantity = new javax.swing.JTextField();
        mgluejTextFieldGelTime = new javax.swing.JTextField();
        mGlueTextFieldMoistureContent = new javax.swing.JTextField();
        mGlueTextFieldViscocity = new javax.swing.JTextField();
        mGlueComboBoxpH = new javax.swing.JComboBox<>();
        mGlueComboBoxUnit = new javax.swing.JComboBox<>();
        mGlueComboBoxColor = new javax.swing.JComboBox<>();
        mGlueButtonReset = new javax.swing.JButton();


addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
               dispose();
                fr.setEnabled(true);
         }        
      });   
       // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Purchase Order Item");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()), "Glue", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 0, 255))); // NOI18N
        jPanel1.setDoubleBuffered(false);
        jPanel1.setOpaque(false);
          setResizable(false);


        jLabel1.setText("Viscocity (cP)");

        jLabel2.setText("Gel Time(sec)");

        jLabel3.setText("Color");

        jLabel4.setText("Quantity");

        mGlueButtonAdd.setText("Add");
        mGlueButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGlueButtonAddActionPerformed(evt);
            }
        });

        jLabel5.setText("pH");

        jLabel6.setText("Moisture Content(% Weight)");

        mGlueButtonCancel.setText("Cancel");
        mGlueButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGlueButtonCancelActionPerformed(evt);
            }
        });

        mGlueTextFieldMoistureContent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGlueTextFieldMoistureContentActionPerformed(evt);
            }
        });
        
         mGlueTextFieldMoistureContent.addKeyListener(new KeyAdapter()        
        {
            public void keyTyped(KeyEvent e)
            {
                char c=e.getKeyChar();
                if(((c<'0') || (c>'9')) && (c!=KeyEvent.VK_BACK_SPACE))
                {
                    e.consume();//ignore event
                }
                else if(mGlueTextFieldMoistureContent.getText().length()>=5)
                {
                   e.consume();
                }
               
            }
        });
         
          mGlueTextfieldQuantity.addKeyListener(new KeyAdapter()        
        {
            public void keyTyped(KeyEvent e)
            {
                char c=e.getKeyChar();
                if(((c<'0') || (c>'9')) && (c!=KeyEvent.VK_BACK_SPACE))
                {
                    e.consume();//ignore event
                }
                else if(mGlueTextfieldQuantity.getText().length()>=5)
                {
                   e.consume();
                }
               
            }
        });
          
          
        mgluejTextFieldGelTime.addKeyListener(new KeyAdapter()        
        {
            public void keyTyped(KeyEvent e)
            {
                char c=e.getKeyChar();
                if(((c<'0') || (c>'9')) && (c!=KeyEvent.VK_BACK_SPACE))
                {
                    e.consume();//ignore event
                }
                else if(mgluejTextFieldGelTime.getText().length()>=5)
                {
                   e.consume();
                }
               
            }
        });
          
          
        mGlueTextFieldViscocity.addKeyListener(new KeyAdapter()        
        {
            public void keyTyped(KeyEvent e)
            {
                char c=e.getKeyChar();
                if(((c<'0') || (c>'9')) && (c!=KeyEvent.VK_BACK_SPACE))
                {
                    e.consume();//ignore event
                }
                else if(mGlueTextFieldViscocity.getText().length()>=5)
                {
                   e.consume();
                }
               
            }
        });
          
        
        
      
        mGlueComboBoxpH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" }));

        mGlueComboBoxUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kg", "gm", "litre", "ml" }));

        mGlueComboBoxColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Select", "Antique white", "Snow white", "Ivory ", "Pearl grey", "Lemon Glow" }));

        mGlueButtonReset.setText("Reset");
        mGlueButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGlueButtonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(mGlueTextFieldViscocity)
                                    .addComponent(mGlueComboBoxpH, 0, 165, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(mGlueComboBoxColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(mGlueButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(mGlueButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8)
                                    .addComponent(mGlueButtonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                                .addComponent(jLabel2)
                                .addComponent(jLabel6)
                                .addComponent(mgluejTextFieldGelTime)
                                .addComponent(mGlueTextFieldMoistureContent)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(mGlueTextfieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mGlueComboBoxUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mgluejTextFieldGelTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mGlueTextFieldViscocity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mGlueTextfieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mGlueComboBoxUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mGlueComboBoxColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mGlueComboBoxpH)
                    .addComponent(mGlueTextFieldMoistureContent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mGlueButtonAdd)
                    .addComponent(mGlueButtonCancel)
                    .addComponent(mGlueButtonReset))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void mGlueTextFieldMoistureContentActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        // TODO add your handling code here:
    }                                                             

    private void mGlueButtonAddActionPerformed(java.awt.event.ActionEvent evt) {                                               

     if((mGlueTextFieldViscocity.getText().trim().equals(""))) 
        {
            JOptionPane.showMessageDialog(new JFrame(),"Fill Viscosity");       //////spelling theek karo aman
        }
     else if((mgluejTextFieldGelTime.getText().trim().equals(""))) 
        {
            JOptionPane.showMessageDialog(new JFrame(),"Fill Gel Time");
        }
     else if((mGlueComboBoxColor.getSelectedItem().toString().equals("Select")))
        {
            JOptionPane.showMessageDialog(new JFrame(),"Select Color");
        }
     else if((mGlueTextfieldQuantity.getText().trim().equals(""))) 
        {
            JOptionPane.showMessageDialog(new JFrame(),"Fill Quantity");
        }
      else if((mGlueComboBoxpH.getSelectedItem().toString().equals("Select"))) 
        {
            JOptionPane.showMessageDialog(new JFrame(),"Select pH Value");
        }
     else if((mGlueTextFieldMoistureContent.getText().trim().equals(""))) 
        {
            JOptionPane.showMessageDialog(new JFrame(),"Fill Moisture Content");
        }
    
//     else if((mDyeComboBoxUnit.getSelectedItem().toString().equals("Select")))
//        {
//            JOptionPane.showMessageDialog(new JFrame(),"Select Unit");
//        }
     else{

   String a=mGlueTextFieldViscocity.getText();
   String b= mgluejTextFieldGelTime.getText();
   String c= (String)mGlueComboBoxColor.getSelectedItem();
   String d= (String)mGlueComboBoxpH.getSelectedItem();
   String g= (String)mGlueComboBoxUnit.getSelectedItem();
   String e= mGlueTextFieldMoistureContent.getText();
   String f=mGlueTextfieldQuantity.getText();
   String desc=a+" cp, "+b+" sec, "+c+", "+d+", "+e+" %";

  mGlueTextFieldViscocity.setText("");
  mgluejTextFieldGelTime.setText("");
  mGlueComboBoxColor.setSelectedIndex(0);
  mGlueComboBoxUnit.setSelectedIndex(0);
  mGlueComboBoxpH.setSelectedIndex(0);
  mGlueTextFieldMoistureContent.setText("");
  mGlueTextfieldQuantity.setText("");
  

if(no==1)
{
PurchaseOrder.abc("Glue",desc,f+" "+g);// TODO add your handling code here:
}
else if(no==2)
{
AddStock1.abc("Glue",desc,f+" "+g);// TODO add your handling code here:
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

    private void mGlueButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {                                                  
         fr.setEnabled(true);
         dispose();// TODO add your handling code here:
    }                                                 

    private void mGlueButtonResetActionPerformed(java.awt.event.ActionEvent evt) {                                                 


    mGlueTextFieldViscocity.setText("");
   mgluejTextFieldGelTime.setText("");
    mGlueComboBoxColor.setSelectedIndex(0);
   mGlueComboBoxUnit.setSelectedIndex(0);
   mGlueComboBoxpH.setSelectedIndex(0);
   mGlueTextFieldMoistureContent.setText("");
  mGlueTextfieldQuantity.setText("");
        
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
            java.util.logging.Logger.getLogger(Glue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Glue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Glue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Glue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Glue(0,new JFrame()).setVisible(true);
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
    private javax.swing.JButton mGlueButtonAdd;
    private javax.swing.JButton mGlueButtonCancel;
    private javax.swing.JButton mGlueButtonReset;
    private javax.swing.JComboBox<String> mGlueComboBoxColor;
    private javax.swing.JComboBox<String> mGlueComboBoxUnit;
    private javax.swing.JComboBox<String> mGlueComboBoxpH;
    private javax.swing.JTextField mGlueTextFieldMoistureContent;
    private javax.swing.JTextField mGlueTextFieldViscocity;
    private javax.swing.JTextField mGlueTextfieldQuantity;
    private javax.swing.JTextField mgluejTextFieldGelTime;
    // End of variables declaration                   
}
