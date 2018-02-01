/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biorhythms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author april nf, ryanpradnya
 *
 * Kelas Pekerja merupakan turunan dari kelas Biorythms Setiap pekerja mempunyai
 * nilai Bioryhtms yang berbeda-beda
 */
public class Pekerja extends Biorhythms {

    public Pekerja(int jmlhari) {
        super(jmlhari);
    }

    @Override
    public double[] getEmosional(int[] hari) {
        return super.getEmosional(hari); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double[] getFisik(int[] hari) {
        return super.getFisik(hari); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double[] getIntelektual(int[] hari) {
        return super.getIntelektual(hari); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double[] getTotal() {
        return super.getTotal(); //To change body of generated methods, choose Tools | Templates.
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
        String pilih[] = new String[jumlahshift];
//        jTable1 = new JTable(model);         
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < jumlahshift; i++) {
            if (BiorithmsPekerja1[i] > BiorithmsPekerja2[i]) {
                pilih[i] = "Pekerja 1";
            } else {
                pilih[i] = "Pekerja 2";
            }
            list.add(new Object[]{v.Shift[i], pilih[i]});
        }

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Tanggal", "Nama"});
        for (Object obj : list) {
            model.addRow((Object[]) obj);
        }
        jTable1.setModel(model);
        return pilih;       
    }
    
        /**
     * Membuat table untuk menampilkan nilai Biothythms
     * @param b1 memerlukan inputan objek b1 dari class Biorhythms untuk pekerja
     * 1
     * @param b2 memerlukan inputan objek b2 dari class Biorhythms untuk pekerja
     * 2
     * @param jTable1 memerlukan inputan parameter berupa objek dari Jtable
     * untuk menampilkan nilai Biorhythms pekerja 1
     * @param jTable2 memerlukan inputan parameter berupa objek dari Jtable
     * untuk menampilkan nilai Biorhythms pekerja 2
     * @param jumlahshift memerlukan inputan parameter jumlah hari shift
     * @param v memerlukan inputan parameter berupa objek dari class ValiDate
     * untuk memanggil nilai variabel shift[]
     */
    public void table(Biorhythms p1, Biorhythms p2, javax.swing.JTable jTable1, javax.swing.JTable jTable2, int jumlahshift, ValiDate v) {
        List<Object> list = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();
        for (int i = 0; i < jumlahshift; i++) {
            list.add(new Object[]{v.Shift[i], p1.fisik[i], p1.emosional[i], p1.intelektual[i], p1.total[i]});
            list2.add(new Object[]{v.Shift[i], p2.fisik[i], p2.emosional[i], p2.intelektual[i], p2.total[i]});
        }
        DefaultTableModel model = new DefaultTableModel();
        DefaultTableModel model2 = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Tanggal", "Fisik", "Emosional", "Intelektual", "Total"});
        model2.setColumnIdentifiers(new Object[]{"Tanggal", "Fisik", "Emosional", "Intelektual", "Total"});
        for (Object obj : list) {
            model.addRow((Object[]) obj);
        }
        jTable1.setModel(model);

        for (Object obj : list2) {
            model2.addRow((Object[]) obj);
        }
        jTable2.setModel(model2);
    }

}
