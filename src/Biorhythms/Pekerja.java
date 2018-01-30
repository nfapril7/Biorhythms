/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biorhythms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author april nf
 *
 * Kelas Pekerja merupakan turunan dari kelas Biorythms Setiap pekerja mempunyai
 * nilai Bioryhtms yang berbeda-beda
 */
public class Pekerja extends Biorhythms {

    public Pekerja(int jmlhari) {
        super(jmlhari);
    }

    /**
     *
     * @param BiorithmsPekerja1 : Total nilai Biorythms dari pekerja 1
     * @param BiorithmsPekerja2 : Total nilai Biorythms dari pekerja 2
     * @param jumlahshift : Jumlah hari shift yang diinputkan antara 5 sampai 10
     * hari
     * @param v : Memanggil class untuk mengambil nilai tanggal shift dari objek
     * v
     * @return : Mengembalikan nilai diantara pekerja 1 atau 2 yang akan
     * terpilih pada masing-masing jadwal shift
     */
    public String[] perbandingan(double BiorithmsPekerja1[], double BiorithmsPekerja2[], int jumlahshift, ValiDate v, javax.swing.JTable jTable1) {
        System.out.println("PERBANDINGAN");
        String pilih[] = new String[jumlahshift];
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Tanggal", "Nama"});
        jTable1 = new JTable(model);
        List list = new ArrayList<>();
        for (int i = 0; i < jumlahshift; i++) {
            if (BiorithmsPekerja1[i] > BiorithmsPekerja2[i]) {
                pilih[i] = "Pekerja 1";
            } else {
                pilih[i] = "Pekerja 2";
            }
            System.out.println(v.Shift[i] + " -- " + pilih[i]);
            list.add(new Object[]{v.Shift[i], pilih[i]});
        }
        System.out.println("nana");
        for (Object obj : list) {
            model.addRow((Object[]) obj);
        }
        jTable1.setModel(model);
        return pilih;
    }

}
