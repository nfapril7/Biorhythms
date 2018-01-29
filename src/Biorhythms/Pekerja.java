/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biorhythms;

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
    public String[] perbandingan(double BiorithmsPekerja1[], double BiorithmsPekerja2[], int jumlahshift, ValiDate v) {
        System.out.println("PERBANDINGAN");
        String pilih[] = new String[jumlahshift];
        for (int i = 0; i < jumlahshift; i++) {
            if (BiorithmsPekerja1[i] > BiorithmsPekerja2[i]) {
                pilih[i] = "Pekerja 1";
            } else {
                pilih[i] = "Pekerja 2";
            }
            System.out.println(v.Shift[i] + " -- " + pilih[i]);
        }
        return pilih;
    }

}
