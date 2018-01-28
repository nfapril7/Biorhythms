/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biorhythms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author april nf
 */
public class ValiDate {

    private int jmlShift, tgl, bln, thn, jumlahHari, tglAwal, blnAwal, thnAwal;
    private Date Tgllahir, Tglshift;
    boolean isValidate = true;
    protected Date Shift[];
    Scanner in;
    SimpleDateFormat df;

    public ValiDate() {
        in = new Scanner(System.in);
        df = new SimpleDateFormat("dd/MM/yyyy");
    }

    public void setTgl(int tgl) {
        this.tgl = tgl;
    }

    public void setBln(int bln) {
        this.bln = bln;
    }

    public void setThn(int thn) {
        this.thn = thn;
    }

    public int getTgl() {
        return tgl;
    }

    public int getBln() {
        return bln;
    }

    public int getThn() {
        return thn;
    }

    public void setTglAwal(int tglAwal) {
        this.tglAwal = tglAwal;
    }

    public int getTglAwal() {
        return tglAwal;
    }

    public void setBlnAwal(int blnAwal) {
        this.blnAwal = blnAwal;
    }

    public int getBlnAwal() {
        return blnAwal;
    }

    public void setThnAwal(int thnAwal) {
        this.thnAwal = thnAwal;
    }

    public int getThnAwal() {
        return thnAwal;
    }

    public void setJumlahHari(int jumlahHari) {
        this.jumlahHari = jumlahHari;
    }

    public int getJumlahHari() {
        return jumlahHari;
    }

    public void setShift(Date[] Shift) {
        this.Shift = Shift;
    }

    public Date[] getShift() {
        return Shift;
    }

    public void setJmlShift(int jmlShift) {
        this.jmlShift = jmlShift;
    }

    public int getJmlShift() {
        return jmlShift;
    }

    public Date getTgllahir() {
        return Tgllahir;
    }

    public Date getTglshift() {
        return Tglshift;
    }

    public void setTgllahir(Date Tgllahir) {
        this.Tgllahir = Tgllahir;
    }

    public void setTglshift(Date Tglshift) {
        this.Tglshift = Tglshift;
    }

    Date  makeAppend(int tgl, int bln, int thn) {
        StringBuilder builder = new StringBuilder();
        builder.append(tgl);
        builder.append("/");
        builder.append(bln);
        builder.append("/");
        builder.append(thn);
        String tempShift = builder.toString();
        try {
            setTglshift(df.parse(tempShift));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
        return Tglshift;
    }

    void makeShift() {
        System.out.println("Masukan jumlah shift: ");
        jmlShift = in.nextInt();
        setJmlShift(jmlShift);
        System.out.println("Masukan tanggal awal shift");
        tglAwal = in.nextInt();
        System.out.println("Masukan bulsn awal shift");
        blnAwal = in.nextInt();
        System.out.println("Masukan tahun awal shift");
        thnAwal = in.nextInt();
        try {
            if (jmlShift < 5 || jmlShift > 10) {
                isValidate = false;
                throw new CustomException("Jumlah shift antara 5 sampai 10 hari");
            } else {
                Shift = new Date[jmlShift];
                setJmlShift(jmlShift);
                setTglAwal(tglAwal);
                setBlnAwal(blnAwal);
                setThnAwal(thnAwal);
                makeAppend(getTglAwal(), getBlnAwal(), getThnAwal());
                isValidate = true;
            }
        } catch (CustomException ex) {
            System.out.println(ex.getMessage());
        }
    }

    void makeBirthDate() {
        System.out.println("Masukan tanggal lahir pekerja: ");
        setTgl(in.nextInt());
        System.out.println("Masukan bulan lahir pekerja: ");
        setBln(in.nextInt());
        System.out.println("Masukan tahun lahir pekerja: ");
        setThn(in.nextInt());
    }

    public void validate() {
        makeBirthDate();
        switch (bln) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                setJumlahHari(31);
                check();
                break;
            case 2:
                int jumlah = thn % 4 == 0 ? 29 : 28;
                setJumlahHari(jumlah);
                check();
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                setJumlahHari(30);
                check();
                break;
            default:
                System.out.println("Data tanggal yang Anda masukan salah" + getTgl() + " - " + getBln() + " - " + getThn());
                isValidate = false;
        }
    }

    void check() {
        try {
            assert (getTgl() <= jumlahHari || getTgl() > 0);
            if (getTgl() > jumlahHari || getTgl() < 0) {
                isValidate = false;
                throw new CustomException("Input data tanggal salah");
            }
            isValidate = true;
            makeCal();
        } catch (CustomException ex) {
            System.out.println(ex.getMessage());
        }
    }

    void makeCal() {
        checkLebih();
        Calendar cal = Calendar.getInstance();
        Date[] temp = new Date[getJmlShift()];
        for (int i = 0; i < getJmlShift(); i++) {
            cal.setTime(Tglshift);
            cal.add(Calendar.DAY_OF_MONTH, i);
            System.out.println(df.format(cal.getTime()));
            temp[i] = (cal.getTime());
            setShift(temp);
        }
    }

    Date makeAppendforBirth(int tgl, int bln, int thn) {
        StringBuilder builder = new StringBuilder();
        builder.append(tgl);
        builder.append("/");
        builder.append(bln);
        builder.append("/");
        builder.append(thn);
        String lahir = builder.toString();
        try {
            setTgllahir(df.parse(lahir));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
        return Tgllahir;
    }

    void checkLebih() {
        makeAppendforBirth(getTgl(), getBln(), getThn());
        try {
            if (getTgllahir().after(getTglshift()) || getTgllahir().equals(getTglshift())) {
                isValidate = false;
                throw new CustomException("Tanggal lahir tidak diperbolehkan melebihi tanggal shift");
            }
            isValidate = true;
        } catch (CustomException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void Hitung(Date shift[], Biorhythms sym) {
        if (isValidate == true) {
            int hari[] = new int[getJmlShift()];
            for (int i = 0; i < hari.length; i++) {
                hari[i] = (int) TimeUnit.MILLISECONDS.toDays((shift[i].getTime() - getTgllahir().getTime()));
                sym.getFisik(hari);
                sym.getEmosional(hari);
                sym.getIntelektual(hari);
                sym.totalSym();
            }
        }
    }
}
