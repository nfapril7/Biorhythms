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
 * @author april nf
 */
public class Biorhythms {

   protected double fisik[], emosional[], intelektual[], total[];

    /**
     * @param args the command line arguments
     */
    public Biorhythms(int jmlhari) {
        fisik = new double[jmlhari];
        emosional = new double[jmlhari];
        intelektual = new double[jmlhari];
        total = new double[jmlhari];
    }

    public double[] getEmosional(int hari[]) {
        for (int i = 0; i < emosional.length; i++) {
            emosional[i] = Math.sin((2 * Math.PI * hari[i]) / 28);
            System.out.println("emosional " + emosional[i]);
        }
        return emosional;
    }

    public double[] getFisik(int hari[]) {
        for (int i = 0; i < fisik.length; i++) {
            fisik[i] = Math.sin((2 * Math.PI * hari[i]) / 23);
            System.out.println("fisik " + fisik[i]);
        }
        return fisik;
    }

    public double[] getIntelektual(int hari[]) {
        for (int i = 0; i < intelektual.length; i++) {
            intelektual[i] = Math.sin((2 * Math.PI * hari[i]) / 23);
            System.out.println("intelektual " + intelektual[i]);
        }
        return intelektual;
    }

    public double [] getTotal() {
        System.out.println("");
        for (int i = 0; i < total.length; i++) {
            total[i] = fisik[i] + intelektual[i] + emosional[i];
            System.out.println(i+ "Total " + total[i]);
        }
        return total;
    }
    
    public void table(Biorhythms a, Biorhythms b, javax.swing.JTable jTable1, int jumlahshift, ValiDate v){
            List<Object> list = new ArrayList<>();
        for (int i = 0; i < jumlahshift; i++) {
            list.add(new Object[]{v.Shift[i], pilih[i]});
        }

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Tanggal", "Nama"});
        for (Object obj : list) {
            model.addRow((Object[]) obj);
        }
        jTable1.setModel(model);
    }

}
