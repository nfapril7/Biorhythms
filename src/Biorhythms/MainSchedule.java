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
public class MainSchedule {

    public static void main(String[] args) {
        // handling jika inputan jmlshift, tgl, bln, thn bukan integer, maka muncul joptionpane bahwa inputan salah 

        System.out.println("PEKERJA 1");
        ValiDate tanggal = new ValiDate();
//        do {
        tanggal.makeShift();
//        } while (tanggal.isValidate == false);
        do {
            tanggal.validate();
        } while (tanggal.isValidate == false);
        Biorhythms s1 = new Biorhythms(tanggal.getJmlShift());
        tanggal.Hitung(tanggal.getShift(), s1);
        Pekerja p1 = new Pekerja(tanggal.getJmlShift());

        System.out.println("PEKERJA 2");
        ValiDate tanggal2 = new ValiDate();
        tanggal2.setJmlShift(tanggal.getJmlShift());
        tanggal2.setTglshift(tanggal.getTglshift());
        do {
            tanggal2.validate();
        } while (tanggal2.isValidate == false);
        Biorhythms s2 = new Biorhythms(tanggal2.getJmlShift());
        tanggal2.Hitung(tanggal2.getShift(), s2);
        Pekerja p2 = new Pekerja(tanggal.getJmlShift());
        p2.perbandingan(s1.total, s2.total, tanggal.getJmlShift(), tanggal);
    }
}
