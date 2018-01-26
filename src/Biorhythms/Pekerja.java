/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biorhythms;

/**
 *
 * @author april nf
 */
public class Pekerja {

    double fisik[], emosional[], intelektual[], total[];

    public Pekerja(int jumlah) {
        fisik = new double[jumlah];
        emosional = new double[jumlah];
        intelektual = new double[jumlah];
        total = new double[jumlah];
    }

    public void setFisik(double[] fisik) {
        this.fisik = fisik;
    }

    public double[] getFisik() {
        return fisik;
    }

    public void setEmosional(double[] emosional) {
        this.emosional = emosional;
    }

    public double[] getEmosional() {
        return emosional;
    }

    public void setIntelektual(double[] intelektual) {
        this.intelektual = intelektual;
    }

    public double[] getIntelektual() {
        return intelektual;
    }

    public void setTotal(double[] total) {
        this.total = total;
    }

    public double[] getTotal() {
        return total;
    }

    public String perbandingan(double a[], double b[], int jumlahshift, ValiDate v) {
        String pilih = "Pekerja 2";
        for (int i = 0; i < jumlahshift; i++) {
            if (a[i] > b[i]) {
                pilih = "Pekerja 1";
            }
                  System.out.println(v.Shift[i]+" : "+pilih);
        }
        return pilih;
    }

}
