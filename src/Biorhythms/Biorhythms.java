/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biorhythms;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author april nf, ryanpradnya
 */
public class Biorhythms {

    protected double fisik[]; 
    protected double emosional[]; 
    protected double intelektual[]; 
    protected double total[];

    /**
     * @param args Konstruktor untuk membuat objek array variabel fisik,
     * emosional, intelektual dan total serta meinisialisasi nilai variable
     * jumlah hari shift
     */
    public Biorhythms(int jmlhari) {
        fisik = new double[jmlhari];
        emosional = new double[jmlhari];
        intelektual = new double[jmlhari];
        total = new double[jmlhari];
    }

    /**
     * Menjalankan fungsi Biorhythms untuk nilai emosional dengan rumus sin((2 * phi * hari) / 28)
     * @param hari jumlah selisih hari antara tanggal lahir pekerja dengan
     * tanggal shift
     * @return mengembalikan nilai biorhythms emosional
     */
    public double[] getEmosional(int hari[]) {
        for (int i = 0; i < emosional.length; i++) {
            emosional[i] = Math.sin((2 * Math.PI * hari[i]) / 28);
            System.out.println("emosional " + emosional[i]);
        }
        return emosional;
    }

    /**
     * Menjalankan fungsi Biorhythms untuk nilai fisik dengan rumus sin((2 * phi * hari) / 23)
     * @param hari jumlah selisih hari antara tanggal lahir pekerja dengan
     * tanggal shift
     * @return mengembalikan nilai biorhythms fisik
     */
    public double[] getFisik(int hari[]) {
        for (int i = 0; i < fisik.length; i++) {
            fisik[i] = Math.sin((2 * Math.PI * hari[i]) / 23);
            System.out.println("fisik " + fisik[i]);
        }
        return fisik;
    }

    /**
     * Menjalankan fungsi Biorhythms untuk nilai intelektual dengan rumus sin((2 * phi * hari) / 33)
     * @param hari jumlah selisih hari antara tanggal lahir pekerja dengan
     * tanggal shift
     * @return mengembalikan nilai biorhythms intelektual
     */
    public double[] getIntelektual(int hari[]) {
        for (int i = 0; i < intelektual.length; i++) {
            intelektual[i] = Math.sin((2 * Math.PI * hari[i]) / 33);
            System.out.println("intelektual " + intelektual[i]);
        }
        return intelektual;
    }

    /**
     * Menambahkan nilai Biorhythms dari nilai emosional, fisik dan intelektual
     * @return mengembalikan nilai total dari nilai fisik, emosional, dan
     * intelektual
     */
    public double[] getTotal() {
        System.out.println("");
        for (int i = 0; i < total.length; i++) {
            total[i] = fisik[i] + intelektual[i] + emosional[i];
            System.out.println(i + "Total " + total[i]);
        }
        return total;
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
    public void table(Biorhythms b1, Biorhythms b2, javax.swing.JTable jTable1, javax.swing.JTable jTable2, int jumlahshift, ValiDate v) {
        List<Object> list = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();
        for (int i = 0; i < jumlahshift; i++) {
            list.add(new Object[]{v.Shift[i], b1.fisik[i], b1.emosional[i], b1.intelektual[i], b1.total[i]});
            list2.add(new Object[]{v.Shift[i], b2.fisik[i], b2.emosional[i], b2.intelektual[i], b2.total[i]});
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
