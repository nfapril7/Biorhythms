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
public class Pekerja extends Biorhythms{

    public Pekerja(int jmlhari) {
        super(jmlhari);
    }

    public String[] perbandingan(double a[], double b[], int jumlahshift, ValiDate v) {
        String pilih[] = new String [jumlahshift];
        for (int i = 0; i < jumlahshift; i++) {
            if (a[i] > b[i]) {
                pilih[i] = "Pekerja 1";
            }else{
                pilih[i] = "Pekerja 2";
            }
                  System.out.println(v.Shift[i]+" : "+pilih[i]+ " -- "+a[i]+" - "+b[i]);
        }
        return pilih;
    }

}
