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


public class StaplePins extends javax.swing.JFrame {
JFrame fr;
    int no;
    public StaplePins(int number,JFrame ft) {
        fr=ft;
       no=number;
 initComponents();
        getContentPane().setBackground(new java.awt.Color(245,245,245));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mStaplePinsTextFieldQuantity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mStaplePinsButtonCancel = new javax.swing.JButton();
        mStaplePinsButtonAdd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mStaplePinsTextFieldStaplingCapacity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        mStaplePinsTextFieldSize = new javax.swing.JTextField();
        mStaplePinsLableSize = new javax.swing.JLabel();
        mStaplePinsComboBoxMaterial = new javax.swing.JComboBox<>();
        mStaplePinsComboBoxCrown = new javax.swing.JComboBox<>();
        mStaplePinsComboBoxgauge = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        mStaplePinsComboBoxBrand = new javax.swing.JComboBox<>();
        mStaplePinsButtonReset = new javax.swing.JButton();
        mStaplePinsComboBoxMaterial1 = new javax.swing.JComboBox<>();
        mStaplePinsComboBoxQuantity = new javax.swing.JComboBox<>();

 addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
               dispose();
               fr.setEnabled(true);
         }        
      });    


       // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Purchase Order Item");
        setBackground(new java.awt.Color(245, 245, 245));
        setBounds(new java.awt.Rectangle(472, 218, 422, 332));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Staple Pins", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 11), new java.awt.Color(0, 102, 204))); // NOI18N

        jLabel2.setText("Quantity ");
        
        mStaplePinsTextFieldQuantity.addKeyListener(new KeyAdapter() 
        {
            public void keyTyped(KeyEvent e)
            {
                char c=e.getKeyChar();
                if((c<'0') || (c>'9')&& (c!=KeyEvent.VK_BACK_SPACE))
                {
                    e.consume();//ignore event
                }
                
                else if(mStaplePinsTextFieldQuantity.getText().length()>=6)
                {
                   e.consume();
                }

                
            }
        });

        jLabel3.setText("Crown");

        jLabel4.setText("Color");

        mStaplePinsButtonCancel.setText("Cancel");
        mStaplePinsButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mStaplePinsButtonCancelActionPerformed(evt);
            }
        });

        mStaplePinsButtonAdd.setText("Add");
        mStaplePinsButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mStaplePinsButtonAddActionPerformed(evt);
            }
        });

        jLabel5.setText("Material");

        jLabel6.setText("Stapling capacity");
        
        mStaplePinsTextFieldStaplingCapacity.addKeyListener(new KeyAdapter() 
        {
            public void keyTyped(KeyEvent e)
            {
                char c=e.getKeyChar();
                if((c<'0') || (c>'9')&& (c!=KeyEvent.VK_BACK_SPACE))
                {
                    e.consume();//ignore event
                }
                else if(mStaplePinsTextFieldStaplingCapacity.getText().length()>=6)
                {
                   e.consume();
                }

            }
        });
        

        jLabel7.setText("Gauge");

        jLabel8.setText("Brand");

        mStaplePinsTextFieldSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mStaplePinsTextFieldSizeActionPerformed(evt);
            }
        });

        mStaplePinsLableSize.setText("Size");
        
        mStaplePinsTextFieldSize.addKeyListener(new KeyAdapter() 
        {
            public void keyTyped(KeyEvent e)
            {
                char c=e.getKeyChar();
                if((c<'0') || (c>'9')&& (c!=KeyEvent.VK_BACK_SPACE))
                {
                    e.consume();//ignore event
                }
                else if(mStaplePinsTextFieldSize.getText().length()>=6)
                {
                   e.consume();
                }
            }
        });

        mStaplePinsComboBoxMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","Steel", "Copper", "Iron", "Broze", "Cobalt" }));

        mStaplePinsComboBoxCrown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","1\"-1/3\"", "1\"-3/3\"", "1\"-5/3\"", "1\"-7/3\"" }));

        mStaplePinsComboBoxgauge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","16", "18", "20", "22", "24" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","Silver", "Gold", "Red", "Blue", "Black", "Green" }));

        mStaplePinsComboBoxBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select","Fasco", "Makita", "NuMax", "Kaymo" }));

        mStaplePinsButtonReset.setText("Reset");
        mStaplePinsButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mStaplePinsButtonResetActionPerformed(evt);
            }
        });

        mStaplePinsComboBoxMaterial1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mm", "cm", "inch" }));

        mStaplePinsComboBoxQuantity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Box", "Packet", "Unit" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mStaplePinsLableSize)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mStaplePinsComboBoxCrown, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(mStaplePinsTextFieldSize, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mStaplePinsComboBoxMaterial1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(mStaplePinsTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mStaplePinsComboBoxQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(30, 30, 30))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mStaplePinsButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mStaplePinsComboBoxgauge, 0, 165, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(mStaplePinsButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(mStaplePinsButtonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mStaplePinsTextFieldStaplingCapacity)
                            .addComponent(mStaplePinsComboBoxMaterial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(mStaplePinsComboBoxBrand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mStaplePinsTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mStaplePinsComboBoxQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(mStaplePinsLableSize))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mStaplePinsTextFieldSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mStaplePinsComboBoxMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mStaplePinsComboBoxMaterial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mStaplePinsTextFieldStaplingCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mStaplePinsComboBoxCrown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mStaplePinsComboBoxgauge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mStaplePinsComboBoxBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mStaplePinsButtonCancel)
                    .addComponent(mStaplePinsButtonAdd)
                    .addComponent(mStaplePinsButtonReset))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void mStaplePinsButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {                                                        
       dispose(); // TODO add your handling code here:
     fr.setEnabled(true);
    }                                                       
    
    private void mStaplePinsButtonAddActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        
        if((mStaplePinsTextFieldSize.getText().trim().equals("")))
        {
            JOptionPane.showMessageDialog(new JFrame(),"Fill Size");
        }     
     
     else if((mStaplePinsComboBoxMaterial.getSelectedItem().toString().equals("Select"))) 
        {
            JOptionPane.showMessageDialog(new JFrame(),"Select Material");
        }
     else if((mStaplePinsTextFieldQuantity.getText().trim().equals(""))) 
        {
            JOptionPane.showMessageDialog(new JFrame(),"Fill Quantity");
        }
      
        else if((mStaplePinsTextFieldStaplingCapacity.getText().trim().equals(""))) 
        {
            JOptionPane.showMessageDialog(new JFrame(),"Fill Stapling Capacity");
        }else if((mStaplePinsComboBoxCrown.getSelectedItem().toString().equals("Select")))
        {
            JOptionPane.showMessageDialog(new JFrame(),"Select Crown Value");
        }
     else if((mStaplePinsComboBoxgauge.getSelectedItem().toString().equals("Select")))
        {
            JOptionPane.showMessageDialog(new JFrame(),"Select Gauge Value");
        }
     
     else if((jComboBox4.getSelectedItem().toString().equals("Select")))
        {
            JOptionPane.showMessageDialog(new JFrame(),"Select Color");
        }
     else if((mStaplePinsComboBoxBrand.getSelectedItem().toString().equals("Select"))) 
        {
            JOptionPane.showMessageDialog(new JFrame(),"Select Brand");
        }
     else{
        
    String a= (String)mStaplePinsComboBoxBrand.getSelectedItem();
    String k= (String)mStaplePinsComboBoxQuantity.getSelectedItem();
    String b= (String)jComboBox4.getSelectedItem();
    String c= (String)mStaplePinsComboBoxCrown.getSelectedItem();
    String d= (String)mStaplePinsComboBoxgauge.getSelectedItem();
    String e= (String)mStaplePinsComboBoxMaterial.getSelectedItem();
    String f= mStaplePinsTextFieldQuantity.getText();
    String g= mStaplePinsTextFieldSize.getText();
    String h= mStaplePinsTextFieldStaplingCapacity.getText();
    String i= (String)mStaplePinsComboBoxMaterial1.getSelectedItem();
    String desc=g+" "+i+", "+e+", "+h+" pins, "+c+", "+d+" gauge, "+b+", "+a;

   mStaplePinsComboBoxBrand.setSelectedIndex(0);
   mStaplePinsComboBoxQuantity.setSelectedIndex(0);
   jComboBox4.setSelectedIndex(0);
   mStaplePinsComboBoxCrown.setSelectedIndex(0);
   mStaplePinsComboBoxgauge.setSelectedIndex(0);
   mStaplePinsComboBoxMaterial.setSelectedIndex(0);
   mStaplePinsTextFieldQuantity.setText("");
   mStaplePinsTextFieldSize.setText("");
   mStaplePinsComboBoxMaterial1.setSelectedIndex(0);
   mStaplePinsTextFieldStaplingCapacity.setText("");


if(no==1)
{
PurchaseOrder.abc("Pins",desc,f+" "+k);// TODO add your handling code here:
}
else if(no==2)
{
AddStock1.abc("Pins",desc,f+" "+k);// TODO add your handling code here:
}
else
{
}
//JOptionPane.showMessageDialog(new javax.swing.JFrame(),"Item added successfully");
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

    }
}                                                    

    private void mStaplePinsTextFieldSizeActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

   private void mStaplePinsButtonResetActionPerformed(java.awt.event.ActionEvent evt) {                                                       
   mStaplePinsComboBoxBrand.setSelectedIndex(0);
   mStaplePinsComboBoxQuantity.setSelectedIndex(0);
   jComboBox4.setSelectedIndex(0);
   mStaplePinsComboBoxCrown.setSelectedIndex(0);
   mStaplePinsComboBoxgauge.setSelectedIndex(0);
   mStaplePinsComboBoxMaterial.setSelectedIndex(0);
   mStaplePinsTextFieldQuantity.setText("");
   mStaplePinsTextFieldSize.setText("");
   mStaplePinsComboBoxMaterial1.setSelectedIndex(0);
   mStaplePinsTextFieldStaplingCapacity.setText("");

// TODO add your handling code here:
    }                                                      

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StaplePins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaplePins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaplePins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaplePins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaplePins(0,new JFrame()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
   
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mStaplePinsButtonAdd;
    private javax.swing.JButton mStaplePinsButtonCancel;
    private javax.swing.JButton mStaplePinsButtonReset;
    private javax.swing.JComboBox<String> mStaplePinsComboBoxBrand;
    private javax.swing.JComboBox<String> mStaplePinsComboBoxCrown;
    private javax.swing.JComboBox<String> mStaplePinsComboBoxMaterial;
    private javax.swing.JComboBox<String> mStaplePinsComboBoxMaterial1;
    private javax.swing.JComboBox<String> mStaplePinsComboBoxQuantity;
    private javax.swing.JComboBox<String> mStaplePinsComboBoxgauge;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel mStaplePinsLableSize;
    private javax.swing.JTextField mStaplePinsTextFieldQuantity;
    private javax.swing.JTextField mStaplePinsTextFieldSize;
    private javax.swing.JTextField mStaplePinsTextFieldStaplingCapacity;
    // End of variables declaration                   
}
