package micpro;
import java.awt.event.WindowAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import javax.swing.border.Border; /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashok
 */
public class InventoryDashboard extends javax.swing.JFrame {
JFrame fr;
    /**
     * Creates new form InventoryDashboard
     */
     public InventoryDashboard(JFrame ft) {
        fr=ft;
        	getContentPane().setBackground(new java.awt.Color(245,245,245));
                setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/666.png")));
		setTitle("Manage Inventory");
       	 	setLocation(450, 160);
initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mInventoryDashboardAddVendor = new javax.swing.JButton();
        mInventoryDashboardPurchaseOrder = new javax.swing.JButton();
        mInventoryDashboardAddStock = new javax.swing.JButton();
        mInventoryDashboardViewInventory = new javax.swing.JButton();
        mInventoryDashboardViewOrder = new javax.swing.JButton();
        mInventoryDashboardDeleteStock = new javax.swing.JButton();

      //  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
  addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
               dispose();
               fr.setEnabled(true);
         }        
      });      
        setResizable(false);
        jPanel1.setBackground(new java.awt.Color(13, 71, 161));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Inventory");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/66.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mInventoryDashboardAddVendor.setBackground(new java.awt.Color(241, 239, 241));
        mInventoryDashboardAddVendor.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/00.png"))); // NOI18N
        mInventoryDashboardAddVendor.setToolTipText("New Vendor Regestration");
        mInventoryDashboardAddVendor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mInventoryDashboardAddVendor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mInventoryDashboardAddVendorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mInventoryDashboardAddVendorMouseExited(evt);
            }
        });
        mInventoryDashboardAddVendor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInventoryDashboardAddVendorActionPerformed(evt);
            }
        });

        mInventoryDashboardPurchaseOrder.setBackground(new java.awt.Color(241, 239, 241));
        mInventoryDashboardPurchaseOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/22.png"))); // NOI18N
        mInventoryDashboardPurchaseOrder.setToolTipText("purchase order");
        mInventoryDashboardPurchaseOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mInventoryDashboardPurchaseOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mInventoryDashboardPurchaseOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mInventoryDashboardPurchaseOrderMouseExited(evt);
            }
        });
        mInventoryDashboardPurchaseOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInventoryDashboardPurchaseOrderActionPerformed(evt);
            }
        });

        mInventoryDashboardAddStock.setBackground(new java.awt.Color(241, 239, 241));
        mInventoryDashboardAddStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/33.png"))); // NOI18N
        mInventoryDashboardAddStock.setToolTipText("add stock");
        mInventoryDashboardAddStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mInventoryDashboardAddStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mInventoryDashboardAddStockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mInventoryDashboardAddStockMouseExited(evt);
            }
        });
        mInventoryDashboardAddStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInventoryDashboardAddStockActionPerformed(evt);
            }
        });

        mInventoryDashboardViewInventory.setBackground(new java.awt.Color(241, 239, 241));
        mInventoryDashboardViewInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/55.png"))); // NOI18N
        mInventoryDashboardViewInventory.setToolTipText("view inventory");
        mInventoryDashboardViewInventory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mInventoryDashboardViewInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mInventoryDashboardViewInventoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mInventoryDashboardViewInventoryMouseExited(evt);
            }
        });
        mInventoryDashboardViewInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInventoryDashboardViewInventoryActionPerformed(evt);
            }
        });

        mInventoryDashboardViewOrder.setBackground(new java.awt.Color(241, 239, 241));
        mInventoryDashboardViewOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/44.png"))); // NOI18N
        mInventoryDashboardViewOrder.setToolTipText("view order");
        mInventoryDashboardViewOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mInventoryDashboardViewOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mInventoryDashboardViewOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mInventoryDashboardViewOrderMouseExited(evt);
            }
        });
        mInventoryDashboardViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInventoryDashboardViewOrderActionPerformed(evt);
            }
        });

        mInventoryDashboardDeleteStock.setBackground(new java.awt.Color(241, 239, 241));
        mInventoryDashboardDeleteStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/di.png"))); // NOI18N
        mInventoryDashboardDeleteStock.setToolTipText("delete stock");
        mInventoryDashboardDeleteStock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mInventoryDashboardDeleteStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mInventoryDashboardDeleteStockMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mInventoryDashboardDeleteStockMouseExited(evt);
            }
        });
        mInventoryDashboardDeleteStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mInventoryDashboardDeleteStockActionPerformed(evt);
            }
        });
  mInventoryDashboardAddVendor.setFocusable(false);
        mInventoryDashboardPurchaseOrder.setFocusable(false);
        mInventoryDashboardAddStock.setFocusable(false);
        mInventoryDashboardViewInventory.setFocusable(false);
        mInventoryDashboardViewOrder.setFocusable(false);
        mInventoryDashboardDeleteStock.setFocusable(false);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mInventoryDashboardAddVendor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mInventoryDashboardViewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mInventoryDashboardViewInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mInventoryDashboardDeleteStock, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mInventoryDashboardPurchaseOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(mInventoryDashboardAddStock, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mInventoryDashboardAddVendor, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mInventoryDashboardPurchaseOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mInventoryDashboardAddStock, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mInventoryDashboardViewInventory, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mInventoryDashboardViewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mInventoryDashboardDeleteStock, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void mInventoryDashboardAddVendorActionPerformed(java.awt.event.ActionEvent evt) {                                                             
      new AddVendor(0,fr).setVisible(true);// TODO add your handling code here:
dispose();  // TODO add your handling code here:
    }                                                            

    private void mInventoryDashboardPurchaseOrderActionPerformed(java.awt.event.ActionEvent evt) {                                                                 
        new PurchaseOrder(fr).setVisible(true);// TODO add your handling code here:
dispose(); // TODO add your handling code here:
    }                                                                

    private void mInventoryDashboardAddStockActionPerformed(java.awt.event.ActionEvent evt) {                                                            
    new AddStock1(fr).setVisible(true);// TODO add your handling code here:
dispose();    // TODO add your handling code here:
    }                                                           

    private void mInventoryDashboardViewInventoryActionPerformed(java.awt.event.ActionEvent evt) {                                                                 
       new ViewInventory(fr).setVisible(true);// TODO add your handling code here:
dispose();  // TODO add your handling code here:
    }                                                                

    private void mInventoryDashboardViewOrderActionPerformed(java.awt.event.ActionEvent evt) {                                                             
      new ViewOrder1(fr).setVisible(true);// TODO add your handling code here:
dispose(); // TODO add your handling code here:
    }                                                            

    private void mInventoryDashboardDeleteStockActionPerformed(java.awt.event.ActionEvent evt) {                                                               
      new DeleteItem(fr).setVisible(true);// TODO add your handling code here:
dispose();  // TODO add your handling code here:
    }                                                              

    private void mInventoryDashboardAddVendorMouseEntered(java.awt.event.MouseEvent evt) {                                                          
         mInventoryDashboardAddVendor.setBackground(new java.awt.Color(160,160,160));// TODO add your handling code here:
    }                                                         

    private void mInventoryDashboardAddVendorMouseExited(java.awt.event.MouseEvent evt) {                                                         
        mInventoryDashboardAddVendor.setBackground(new java.awt.Color(241, 239, 241));// TODO add your handling code here:
    }                                                        

    private void mInventoryDashboardPurchaseOrderMouseEntered(java.awt.event.MouseEvent evt) {                                                              
       mInventoryDashboardPurchaseOrder.setBackground(new java.awt.Color(160,160,160)); // TODO add your handling code here:
    }                                                             

    private void mInventoryDashboardPurchaseOrderMouseExited(java.awt.event.MouseEvent evt) {                                                             
        mInventoryDashboardPurchaseOrder.setBackground(new java.awt.Color(241, 239, 241));// TODO add your handling code here:
    }                                                            

    private void mInventoryDashboardAddStockMouseEntered(java.awt.event.MouseEvent evt) {                                                         
       mInventoryDashboardAddStock.setBackground(new java.awt.Color(160,160,160));  // TODO add your handling code here:
    }                                                        

    private void mInventoryDashboardAddStockMouseExited(java.awt.event.MouseEvent evt) {                                                        
       mInventoryDashboardAddStock.setBackground(new java.awt.Color(241, 239, 241)); // TODO add your handling code here:
    }                                                       

    private void mInventoryDashboardViewOrderMouseEntered(java.awt.event.MouseEvent evt) {                                                          
        mInventoryDashboardViewOrder.setBackground(new java.awt.Color(160,160,160)); // TODO add your handling code here:
    }                                                         

    private void mInventoryDashboardViewOrderMouseExited(java.awt.event.MouseEvent evt) {                                                         
       mInventoryDashboardViewOrder.setBackground(new java.awt.Color(241, 239, 241)); // TODO add your handling code here:
    }                                                        

    private void mInventoryDashboardViewInventoryMouseEntered(java.awt.event.MouseEvent evt) {                                                              
       mInventoryDashboardViewInventory.setBackground(new java.awt.Color(160,160,160));  // TODO add your handling code here:
    }                                                             

    private void mInventoryDashboardViewInventoryMouseExited(java.awt.event.MouseEvent evt) {                                                             
        mInventoryDashboardViewInventory.setBackground(new java.awt.Color(241, 239, 241));// TODO add your handling code here:
    }                                                            

    private void mInventoryDashboardDeleteStockMouseEntered(java.awt.event.MouseEvent evt) {                                                            
        mInventoryDashboardDeleteStock.setBackground(new java.awt.Color(160,160,160)); // TODO add your handling code here:
    }                                                           

    private void mInventoryDashboardDeleteStockMouseExited(java.awt.event.MouseEvent evt) {                                                           
      mInventoryDashboardDeleteStock.setBackground(new java.awt.Color(241, 239, 241));  // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(InventoryDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryDashboard(new JFrame()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mInventoryDashboardAddStock;
    private javax.swing.JButton mInventoryDashboardAddVendor;
    private javax.swing.JButton mInventoryDashboardDeleteStock;
    private javax.swing.JButton mInventoryDashboardPurchaseOrder;
    private javax.swing.JButton mInventoryDashboardViewInventory;
    private javax.swing.JButton mInventoryDashboardViewOrder;
    // End of variables declaration                   
}
