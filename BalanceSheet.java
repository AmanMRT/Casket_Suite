/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package micpro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.AbstractTableModel;
import java.awt.event.*;
import javax.swing.JFrame;
import java.sql.*;
import javax.swing.table.*;
/**
 *
 * @author Dell
 */
public class BalanceSheet extends javax.swing.JFrame {

    /**
     * Creates new form BalanceSheet
     */
    public BalanceSheet() {
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
        jScrollPane4 = new javax.swing.JScrollPane();
        mBalanceSheetTable2 = new javax.swing.JTable();
        mBalanceSheetGross = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mBalanceSheetTable2Total = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mBalanceSheetTable1Total = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        mBalanceSheetTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Balance Sheet");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Balance Sheet", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 255))); // NOI18N

        mBalanceSheetTable2.setRowHeight(26);
        Connection con=dao.createconnection();
        mBalanceSheetTable2.setBackground(new java.awt.Color(245, 245, 245));
        TableCellRenderer rendererFromHeader2 = mBalanceSheetTable2.getTableHeader().getDefaultRenderer();
        JLabel headerLabel2 = (JLabel) rendererFromHeader2;
        headerLabel2.setHorizontalAlignment(JLabel.CENTER);
        mBalanceSheetTable2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        mBalanceSheetTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Assests", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        int pur=0;
        int pur1=0;
        int pur2=0;
        int pur3=0;
        try{
            String sq="select * from vouchers where voucher=?";
            PreparedStatement st = con.prepareStatement(sq);
            st.setString(1,"Purchase");
            ResultSet r=st.executeQuery();
            while(r.next())
            {
                pur=pur+r.getInt(5);
            }
        }
        catch(Exception e){}
        try{
            String sq1="select * from vouchers where voucher=?";
            PreparedStatement st1 = con.prepareStatement(sq1);
            st1.setString(1,"Sales");
            ResultSet r1=st1.executeQuery();
            while(r1.next())
            {
                pur1=pur1+r1.getInt(6);
            }

        }
        catch(Exception e){}
        try{
            String sq2="select * from vouchers where voucher=?";
            PreparedStatement st2 = con.prepareStatement(sq2);
            st2.setString(1,"Payment");
            ResultSet r2=st2.executeQuery();
            while(r2.next())
            {
                pur2=pur2+r2.getInt(5);
            }
        }
        catch(Exception e){}
        try{
            String sq3="select * from vouchers where voucher=?";
            PreparedStatement st3 = con.prepareStatement(sq3);
            st3.setString(1,"Receipt");
            ResultSet r3=st3.executeQuery();
            while(r3.next())
            {
                pur3=pur3+r3.getInt(6);
            }
            int pl=(pur3-pur2);
            //int pl=(pur1-pur)+(pur3-pur2);
            mBalanceSheetTable2Total.setText(Integer.toString(pl));
            DefaultTableModel model=(DefaultTableModel)mBalanceSheetTable2.getModel();
            model.addRow(new Object[]{"Profit & Loss A/c",pl});
            //   mBalanceSheetGross.setText(Integer.toString(Integer.parseInt(mBalanceSheetTable1Total.getText())-pl));
        }
        catch(Exception e){}
        jScrollPane4.setViewportView(mBalanceSheetTable2);

        mBalanceSheetGross.setEditable(false);
        mBalanceSheetGross.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBalanceSheetGrossActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("Total");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("Total");

        mBalanceSheetTable2Total.setEditable(false);
        mBalanceSheetTable2Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBalanceSheetTable2TotalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Gross");

        mBalanceSheetTable1Total.setEditable(false);
        mBalanceSheetTable1Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBalanceSheetTable1TotalActionPerformed(evt);
            }
        });

        mBalanceSheetTable3.setRowHeight(26);//Connection con=dao.createconnection();
        mBalanceSheetTable3.setBackground(new java.awt.Color(245, 245, 245));
        TableCellRenderer rendererFromHeader = mBalanceSheetTable3.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        mBalanceSheetTable3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        mBalanceSheetTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Liability", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        int pu=0;
        int pu1=0;
        try{
            String sq="select * from vouchers where voucher=?";
            PreparedStatement st = con.prepareStatement(sq);
            st.setString(1,"Payment");

            ResultSet r=st.executeQuery();
            while(r.next())
            {
                String led=r.getString(4);
                String sq0="select * from Ledger_Create where Name=?";
                PreparedStatement st0 = con.prepareStatement(sq0);
                st0.setString(1,led);
                ResultSet r0=st0.executeQuery();
                r0.next();
                String under=r0.getString(4);
                if(under.equals("Current Liability"))
                {
                    pu=pu+r.getInt(5);
                }
                else if(under.equals("Loans Liability"))
                {
                    pu1=pu1+r.getInt(5);
                }

            }
            DefaultTableModel model=(DefaultTableModel)mBalanceSheetTable3.getModel();
            model.addRow(new Object[]{"Loans Liability",pu1});
            model.addRow(new Object[]{"Current Liability",pu});
            mBalanceSheetTable1Total.setText(Integer.toString(pu+pu1));
            mBalanceSheetGross.setText(Integer.toString(Integer.parseInt(mBalanceSheetTable2Total.getText())-(pu+pu1)));

        }
        catch(Exception e){System.out.print(e);
            pu=0;
            pu1=0;
            DefaultTableModel model=(DefaultTableModel)mBalanceSheetTable3.getModel();
            model.addRow(new Object[]{"Loans Liability",pu1});
            model.addRow(new Object[]{"Current Liability",pu});
            mBalanceSheetTable1Total.setText(Integer.toString(pu+pu1));
            mBalanceSheetGross.setText(Integer.toString(Integer.parseInt(mBalanceSheetTable2Total.getText())-(pu+pu1)));
        }
        jScrollPane5.setViewportView(mBalanceSheetTable3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(mBalanceSheetGross, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(mBalanceSheetTable1Total, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 11, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mBalanceSheetTable2Total, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mBalanceSheetTable2Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(mBalanceSheetTable1Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mBalanceSheetGross, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void mBalanceSheetGrossActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void mBalanceSheetTable2TotalActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void mBalanceSheetTable1TotalActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
new Dashboard().setVisible(true); 
      dispose();        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(BalanceSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BalanceSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BalanceSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BalanceSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BalanceSheet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField mBalanceSheetGross;
    private javax.swing.JTextField mBalanceSheetTable1Total;
    private javax.swing.JTable mBalanceSheetTable2;
    private javax.swing.JTextField mBalanceSheetTable2Total;
    private javax.swing.JTable mBalanceSheetTable3;
    // End of variables declaration                   
}

