/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biorhythms;

import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author april nf , ryanpradnya
 */
public class FormSchedule extends javax.swing.JFrame {

    ValiDate v = new ValiDate();
    ValiDate v2;

    /**
     * Creates new form FormSchedule
     */
    public FormSchedule() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TFtgl1 = new javax.swing.JTextField();
        TFbln1 = new javax.swing.JTextField();
        TFthn1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TFtgl2 = new javax.swing.JTextField();
        TFbln2 = new javax.swing.JTextField();
        TFthn2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TFtglShift = new javax.swing.JTextField();
        TFblnShift = new javax.swing.JTextField();
        TFthnShift = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TFjmlHari = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbDetail1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTbDetail2 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTFlahir1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTFlahir2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("SimSun-ExtB", 0, 18)); // NOI18N
        jLabel7.setText("PENJADWALAN SHIFT KARYAWAN DENGAN BIORHYTMS");

        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel1KeyReleased(evt);
            }
        });

        jLabel1.setText("Tanggal Lahir Pekerja 1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setEnabled(false);
        jScrollPane2.setViewportView(jTable1);

        TFtgl1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFtgl1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFtgl1KeyTyped(evt);
            }
        });

        TFbln1.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                TFbln1AncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        TFbln1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFbln1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFbln1KeyTyped(evt);
            }
        });

        TFthn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFthn1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFthn1KeyTyped(evt);
            }
        });

        jLabel2.setText("Tanggal Lahir Pekerja 2");

        TFtgl2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFtgl2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFtgl2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFtgl2KeyTyped(evt);
            }
        });

        TFbln2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFbln2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFbln2KeyTyped(evt);
            }
        });

        TFthn2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFthn2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFthn2KeyTyped(evt);
            }
        });

        jLabel3.setText("Tanggal Awal Shift");

        TFtglShift.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFtglShiftKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFtglShiftKeyTyped(evt);
            }
        });

        TFblnShift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFblnShiftActionPerformed(evt);
            }
        });
        TFblnShift.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFblnShiftKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFblnShiftKeyTyped(evt);
            }
        });

        TFthnShift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFthnShiftActionPerformed(evt);
            }
        });
        TFthnShift.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFthnShiftKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFthnShiftKeyTyped(evt);
            }
        });

        jLabel4.setText("Jumlah Hari");

        TFjmlHari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFjmlHariActionPerformed(evt);
            }
        });
        TFjmlHari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TFjmlHariKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFjmlHariKeyTyped(evt);
            }
        });

        jLabel6.setText("hari");

        jButton1.setText("SCHEDULE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TFtgl2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFtgl1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFtglShift, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFjmlHari, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TFbln1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TFbln2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TFthn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TFthn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TFblnShift, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TFthnShift, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFtgl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFbln1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFthn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFtgl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFbln2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFthn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFtglShift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFblnShift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFthnShift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFjmlHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        jTabbedPane1.addTab("Jadwal", jPanel1);

        jTbDetail1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTbDetail1.setEnabled(false);
        jScrollPane1.setViewportView(jTbDetail1);

        jTbDetail2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTbDetail2.setEnabled(false);
        jScrollPane3.setViewportView(jTbDetail2);

        jLabel8.setText("PEKERJA 1");

        jLabel9.setText("PEKERJA 2");

        jLabel10.setText("Tanggal lahir:");

        jTFlahir1.setEditable(false);

        jLabel12.setText("Tanggal lahir:");

        jTFlahir2.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTFlahir1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTFlahir2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 124, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel8)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTFlahir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTFlahir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jTabbedPane1.addTab("Detail", jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Grafik", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel7)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            v.MakeShift(Integer.parseInt(TFtglShift.getText()), Integer.parseInt(TFblnShift.getText()),
                    Integer.parseInt(TFthnShift.getText()), Integer.parseInt(TFjmlHari.getText()));
            v.validate(Integer.parseInt(TFtglShift.getText()), Integer.parseInt(TFblnShift.getText()), Integer.parseInt(TFthnShift.getText()));
            if (v.isValidate) {
                v.validate(Integer.parseInt(TFtgl1.getText()), Integer.parseInt(TFbln1.getText()), Integer.parseInt(TFthn1.getText()));
                Biorhythms b1 = new Biorhythms(v.getJmlShift());
                if (v.isValidate) {
                    v2 = new ValiDate();
                    v2.setJmlShift(v.getJmlShift());
                    v2.setTglshift(v.getTglshift());
                    v2.validate(Integer.parseInt(TFtgl2.getText()), Integer.parseInt(TFbln2.getText()), Integer.parseInt(TFthn2.getText()));
                    Biorhythms b2 = new Biorhythms(v2.getJmlShift());
                    if (v2.isValidate) {
                        v.makeCal();
                        v2.makeCal();
                        if (v.isValidate && v2.isValidate) {
                            v.Hitung(v.getShift(), b1);
                            Pekerja p1 = new Pekerja(v.getJmlShift());
                            v2.Hitung(v2.getShift(), b2);
                            Pekerja p2 = new Pekerja(v2.getJmlShift());
                            p2.perbandingan(p1.getTotal(), p2.getTotal(), v.getJmlShift(), v, jTable1);
                            b2.table(b1, b2, jTbDetail1, jTbDetail2, v.getJmlShift(), v);
                            jTFlahir1.setText(String.valueOf(v.getTgllahir()));
                            jTFlahir2.setText(String.valueOf(v2.getTgllahir()));
                        } else {
                            setNull();
                        }
                    } else {
                        setNull();
                    }
                } else {
                    setNull();
                }
            } else {
                setNull();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Data tidak boleh null",
                    "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TFtgl1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFtgl1KeyTyped
        v.validasiKarakter(evt);
        v.validasiJumlah(evt, TFtgl1, 1);

    }//GEN-LAST:event_TFtgl1KeyTyped

    private void TFbln1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFbln1KeyTyped
        v.validasiKarakter(evt);
        v.validasiJumlah(evt, TFbln1, 1);
    }//GEN-LAST:event_TFbln1KeyTyped

    private void TFthn1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFthn1KeyTyped
        v.validasiKarakter(evt);
        v.validasiJumlah(evt, TFthn1, 3);
    }//GEN-LAST:event_TFthn1KeyTyped

    private void TFtgl2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFtgl2KeyTyped
        v.validasiKarakter(evt);
        v.validasiJumlah(evt, TFtgl2, 1);
    }//GEN-LAST:event_TFtgl2KeyTyped

    private void TFbln2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFbln2KeyTyped
        v.validasiKarakter(evt);
        v.validasiJumlah(evt, TFbln2, 1);
    }//GEN-LAST:event_TFbln2KeyTyped

    private void TFthn2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFthn2KeyTyped
        v.validasiKarakter(evt);
        v.validasiJumlah(evt, TFthn2, 3);
    }//GEN-LAST:event_TFthn2KeyTyped

    private void TFtglShiftKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFtglShiftKeyTyped
        v.validasiKarakter(evt);
        v.validasiJumlah(evt, TFtglShift, 1);
    }//GEN-LAST:event_TFtglShiftKeyTyped

    private void TFblnShiftKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFblnShiftKeyTyped
        v.validasiKarakter(evt);
        v.validasiJumlah(evt, TFblnShift, 1);
    }//GEN-LAST:event_TFblnShiftKeyTyped

    private void TFthnShiftKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFthnShiftKeyTyped
        v.validasiKarakter(evt);
        v.validasiJumlah(evt, TFthnShift, 3);
    }//GEN-LAST:event_TFthnShiftKeyTyped

    private void TFjmlHariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFjmlHariKeyTyped
        v.validasiKarakter(evt);
        v.validasiJumlah(evt, TFjmlHari, 1);
    }//GEN-LAST:event_TFjmlHariKeyTyped

    private void TFjmlHariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFjmlHariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFjmlHariActionPerformed

    private void TFjmlHariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFjmlHariKeyReleased
        // TODO add your handling code here:
        v.validasiBatas(evt, TFjmlHari, 10, 5);
    }//GEN-LAST:event_TFjmlHariKeyReleased

    private void TFtgl1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFtgl1KeyReleased

        if (TFtgl1.getText().isEmpty()) {
            jButton1.disable();
        }
    }//GEN-LAST:event_TFtgl1KeyReleased

    private void TFbln1AncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_TFbln1AncestorMoved

    }//GEN-LAST:event_TFbln1AncestorMoved

    private void TFthn1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFthn1KeyReleased

        if (TFthn1.getText().isEmpty()) {
            jButton1.disable();
        }
    }//GEN-LAST:event_TFthn1KeyReleased

    private void TFbln1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFbln1KeyReleased

        v.validasiBatas(evt, TFbln1, 12, 1);
    }//GEN-LAST:event_TFbln1KeyReleased

    private void TFtgl2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFtgl2KeyReleased

    }//GEN-LAST:event_TFtgl2KeyReleased

    private void TFbln2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFbln2KeyReleased

        v.validasiBatas(evt, TFbln2, 12, 1);
    }//GEN-LAST:event_TFbln2KeyReleased

    private void TFtglShiftKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFtglShiftKeyReleased

    }//GEN-LAST:event_TFtglShiftKeyReleased

    private void TFblnShiftKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFblnShiftKeyReleased

        v.validasiBatas(evt, TFblnShift, 12, 1);
    }//GEN-LAST:event_TFblnShiftKeyReleased

    private void TFthn2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFthn2KeyReleased

    }//GEN-LAST:event_TFthn2KeyReleased

    private void TFthnShiftKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFthnShiftKeyReleased

    }//GEN-LAST:event_TFthnShiftKeyReleased

    private void TFblnShiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFblnShiftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFblnShiftActionPerformed

    private void TFthnShiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFthnShiftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFthnShiftActionPerformed

    private void jPanel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyReleased

    private void TFtgl2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFtgl2KeyPressed
        // TODO add your handling code here:
        if (TFtgl2.getText().isEmpty()) {
            jButton1.disable();
        }
    }//GEN-LAST:event_TFtgl2KeyPressed

    public void setNull() {
        JOptionPane.showMessageDialog(null, new CustomException("Validasi gagal"),
                "Warning", JOptionPane.INFORMATION_MESSAGE);
        TFtgl1.setText("");
        TFbln1.setText("");
        TFthn1.setText("");
        TFtglShift.setText("");
        TFblnShift.setText("");
        TFthnShift.setText("");
        TFtgl2.setText("");
        TFbln2.setText("");
        TFthn2.setText("");
        TFjmlHari.setText("");
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
            java.util.logging.Logger.getLogger(FormSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new FormSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFbln1;
    private javax.swing.JTextField TFbln2;
    private javax.swing.JTextField TFblnShift;
    private javax.swing.JTextField TFjmlHari;
    private javax.swing.JTextField TFtgl1;
    private javax.swing.JTextField TFtgl2;
    private javax.swing.JTextField TFtglShift;
    private javax.swing.JTextField TFthn1;
    private javax.swing.JTextField TFthn2;
    private javax.swing.JTextField TFthnShift;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTFlahir1;
    private javax.swing.JTextField jTFlahir2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTbDetail1;
    private javax.swing.JTable jTbDetail2;
    // End of variables declaration//GEN-END:variables
}
