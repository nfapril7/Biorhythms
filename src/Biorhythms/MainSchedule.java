/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biorhythms;

import java.util.Scanner;

/**
 *
 * @author april nf
 */
public class MainSchedule {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukan jumlah shift: ");
        int jmlShift = in.nextInt();
        System.out.println("Masukan tanggal awal shift");
        int tglShift = in.nextInt();
        System.out.println("Masukan bulsn awal shift");
        int blnShift = in.nextInt();
        System.out.println("Masukan tahun awal shift");
        int thnShift = in.nextInt();
        // handling jika inputan jmlshift, tgl, bln, thn bukan integer, maka muncul joptionpane bahwa inputan salah 
        //untuk Date shift lupa belum saya tambahkan handling validate
        
        System.out.println("PEKERJA 1");
        ValiDate tanggal = new ValiDate(jmlShift, tglShift, blnShift, thnShift);
        System.out.println("Masukan tanggal lahir pekerja 1: ");
        tanggal.setTgl(in.nextInt());
        System.out.println("Masukan bulan lahir pekerja 1: ");
        tanggal.setBln(in.nextInt());
        System.out.println("Masukan tahun lahir pekerja 1: ");
        tanggal.setThn(in.nextInt());
        // handling jika inputan jmlshift, tgl, bln, thn bukan integer, maka muncul joptionpane bahwa inputan salah  
        tanggal.validate();

        Biorhythms s1 = new Biorhythms(tanggal.getJmlShift());
        tanggal.Hitung(tanggal.getShift(), s1);

        Pekerja p1 = new Pekerja(jmlShift);
        
        System.out.println("PEKERJA 2");
        ValiDate tanggal2 = new ValiDate(jmlShift, tglShift, blnShift, thnShift);
        System.out.println("Masukan tanggal lahir pekerja 2: ");
        tanggal2.setTgl(in.nextInt());
        System.out.println("Masukan bulan lahir pekerja 2: ");
        tanggal2.setBln(in.nextInt());
        System.out.println("Masukan tahun lahir pekerja 2: ");
        tanggal2.setThn(in.nextInt());
        // handling jika inputan date bukan integer, maka muncul joptionpane  
        tanggal2.validate();

        Biorhythms s2 = new Biorhythms(tanggal2.getJmlShift());
        tanggal2.Hitung(tanggal2.getShift(), s2);

        Pekerja p2 = new Pekerja(jmlShift);
        p2.perbandingan(s1.total, s2.total, jmlShift, tanggal);

    }
}
