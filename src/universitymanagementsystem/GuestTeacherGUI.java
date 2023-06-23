/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package universitymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author R K Gaur
 */
public class GuestTeacherGUI extends javax.swing.JFrame {

    /**
     * Creates new form SuperAdminGUI
     */
    private List<String> dpart;
    public GuestTeacherGUI() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        loadDeptFromDatabase();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane10 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        gt_id = new javax.swing.JTextField();
        gt_name = new javax.swing.JTextField();
        gt_mobile = new javax.swing.JTextField();
        gt_address = new javax.swing.JTextField();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        d_name3 = new javax.swing.JComboBox();
        jPanel8 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        student_id = new javax.swing.JTextField();
        student_name = new javax.swing.JTextField();
        student_mobile = new javax.swing.JTextField();
        student_address = new javax.swing.JTextField();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        d_name5 = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jTabbedPane10.setBackground(new java.awt.Color(204, 255, 204));

        jPanel18.setBackground(new java.awt.Color(204, 255, 204));

        jLabel34.setText("Guest Teacher ID");

        jLabel35.setText("Guest Teacher Name");

        jLabel36.setText("Guest Teacher Mobile ");

        jLabel37.setText("Guest Teacher Address");

        gt_mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gt_mobileActionPerformed(evt);
            }
        });

        gt_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gt_addressActionPerformed(evt);
            }
        });

        jButton33.setText("VIEW");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setText("ADD");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setText("DELETE");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setText("UPDATE");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(jTable9);

        jLabel17.setText("Department ");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(d_name3, 0, 175, Short.MAX_VALUE)
                        .addGap(339, 339, 339))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gt_address, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(gt_mobile)
                            .addComponent(gt_name)
                            .addComponent(gt_id))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton33)
                            .addComponent(jButton34)
                            .addComponent(jButton35)
                            .addComponent(jButton36))
                        .addGap(135, 135, 135))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(gt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(gt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton33)))
                .addGap(12, 12, 12)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(gt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35))
                .addGap(12, 12, 12)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(gt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton36))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(d_name3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 855, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane10.addTab("Guest Teacher Panel", jPanel6);

        jPanel20.setBackground(new java.awt.Color(204, 255, 204));

        jLabel42.setText("Student ID");

        jLabel43.setText("Student Name");

        jLabel44.setText("Student Mobile ");

        jLabel45.setText("Student Address");

        student_mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_mobileActionPerformed(evt);
            }
        });

        student_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_addressActionPerformed(evt);
            }
        });

        jButton41.setText("VIEW");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setText("ADD");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setText("DELETE");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.setText("UPDATE");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(jTable11);

        jLabel21.setText("Department ");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(student_address, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(student_mobile)
                    .addComponent(student_name)
                    .addComponent(student_id)
                    .addComponent(d_name5, 0, 175, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton41)
                    .addComponent(jButton42)
                    .addComponent(jButton43)
                    .addComponent(jButton44))
                .addGap(135, 135, 135))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(student_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(student_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton41)))
                .addGap(12, 12, 12)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(student_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton43))
                .addGap(12, 12, 12)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(student_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d_name5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 855, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane10.addTab("Student Panel", jPanel8);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane10)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane10)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("GUEST TEACHER DASHBOARD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:

        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/universityDB;create=true","root","root");
            String str = "Update student Set student_name= '"+student_name.getText()+"',student_mobile = '"+student_mobile.getText()+"',student_address = '"+student_address.getText()+"',dept_name = '"+d_name5.getSelectedItem()+"' where student_id = '"+student_id.getText()+"' ";
            Statement st = con.createStatement();
            st.execute(str);
            student_id.setText("");
            student_name.setText("");
            student_mobile.setText("");
            student_address.setText("");
            JOptionPane.showMessageDialog(this, "Update successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:

        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/universityDB;create=true","root","root");
            String str = "delete from student where student_id = '"+student_id.getText()+"'";
            Statement st = con.createStatement();
            st.execute(str);
            JOptionPane.showMessageDialog(this,"Delete Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/universityDB;create=true","root","root");
            Statement st=con.createStatement();
             String mobileNumber = student_mobile.getText();
            if (mobileNumber.length() != 10) {
                student_mobile.setText("");
                JOptionPane.showMessageDialog(null, "Please enter a 10-digit mobile number.");

                return; // Exit the method if the validation fail  
        }
            int i = st.executeUpdate("insert into student values('"+student_id.getText()+"','"+student_name.getText()+"','"+student_mobile.getText()+"','"+student_address.getText()+"','"+d_name5.getSelectedItem()+"')");
            student_id.setText("");
            student_name.setText("");
            student_mobile.setText("");
            student_address.setText("");
            JOptionPane.showMessageDialog(null,"Data Stored Successfully");
        } catch (Exception e) {
            System.out.println("Exception : "+e.toString());
        }
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/universityDB;create=true","root","root");
            String str = "select * from student";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(str);
            jTable11.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_jButton41ActionPerformed

    private void student_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_addressActionPerformed

    private void student_mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_mobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_student_mobileActionPerformed

    private void gt_mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gt_mobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gt_mobileActionPerformed

    private void gt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gt_addressActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/universityDB;create=true","root","root");
            String str = "select * from guestteacher";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(str);
            jTable9.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/universityDB;create=true","root","root");
            Statement st=con.createStatement();
            String mobileNumber = gt_mobile.getText();
            if (mobileNumber.length() != 10) {
                gt_mobile.setText("");
                JOptionPane.showMessageDialog(null, "Please enter a 10-digit mobile number.");

                return; // Exit the method if the validation fail
            }
            int i = st.executeUpdate("insert into guestteacher values('"+gt_id.getText()+"','"+gt_name.getText()+"','"+gt_mobile.getText()+"','"+gt_address.getText()+"','"+d_name3.getSelectedItem()+"')");
            gt_id.setText("");
            gt_name.setText("");
            gt_mobile.setText("");
            gt_address.setText("");
            JOptionPane.showMessageDialog(null,"Data Stored Successfully");

        } catch (Exception e) {
            System.out.println("Exception : "+e.toString());
        }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/universityDB;create=true","root","root");
            String str = "delete from guestteacher where gt_id = '"+gt_id.getText()+"'";
            Statement st = con.createStatement();
            st.execute(str);
            JOptionPane.showMessageDialog(this,"Delete Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
   try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/universityDB;create=true","root","root");
            String str = "Update guestteacher Set gt_name= '"+gt_name.getText()+"',gt_mobile = '"+gt_mobile.getText()+"',gt_address = '"+gt_address.getText()+"' ,dept_name = '"+d_name3.getSelectedItem()+"' where gt_id = '"+gt_id.getText()+"' ";
            Statement st = con.createStatement();
            st.execute(str);
            gt_id.setText("");
            gt_name.setText("");
            gt_mobile.setText("");
            gt_address.setText("");
            JOptionPane.showMessageDialog(this, "Update successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_jButton36ActionPerformed

        private void loadDeptFromDatabase() {
    // Replace with your own database connection details
    String url = "jdbc:derby://localhost:1527/universityDB;create=true";
    String username = "root";
    String password = "root";

    try {
        // Establish a database connection
        Connection connection = DriverManager.getConnection(url,username,password);

        // Create a statement
        Statement statement = connection.createStatement();

        // Execute a query to retrieve role data from the database
        String query = "SELECT dept_name FROM dept";
        ResultSet resultSet = statement.executeQuery(query);

        // Populate the roles list and combo box
        dpart = new ArrayList<>();
        while (resultSet.next()) {
            String dp = resultSet.getString("dept_name");
            dpart.add(dp);
        }

        // Add dept to the combo box
        for (String dp : dpart) {

            d_name3.addItem(dp);
            d_name5.addItem(dp);
        }
        // Close the database resources
        resultSet.close();
        statement.close();
        connection.close();

    } catch (SQLException e) {
        e.printStackTrace();
        // Handle any errors that occur during database connection or query execution
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
            java.util.logging.Logger.getLogger(GuestTeacherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuestTeacherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuestTeacherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuestTeacherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuestTeacherGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox d_name3;
    private javax.swing.JComboBox d_name5;
    private javax.swing.JTextField gt_address;
    private javax.swing.JTextField gt_id;
    private javax.swing.JTextField gt_mobile;
    private javax.swing.JTextField gt_name;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField student_address;
    private javax.swing.JTextField student_id;
    private javax.swing.JTextField student_mobile;
    private javax.swing.JTextField student_name;
    // End of variables declaration//GEN-END:variables
}
