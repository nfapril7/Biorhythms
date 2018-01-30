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

    public double[] getTotal() {
        System.out.println("");
        for (int i = 0; i < total.length; i++) {
            total[i] = fisik[i] + intelektual[i] + emosional[i];
            System.out.println(i + "Total " + total[i]);
        }
        return total;
    }

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
