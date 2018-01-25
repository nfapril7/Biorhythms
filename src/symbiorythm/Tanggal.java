/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package symbiorythm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author april nf
 */
public class Tanggal {

    private int jmlShift;
    private Date Tgl[], Tgllahir, Tglshift;
    private boolean isValidate = true;

    public Tanggal(int jmlShift) {
        Tgl = new Date[jmlShift];
        setJmlShift(jmlShift);
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

    public void validate(int tgl, int bln, int thn) {
        int jumlahHari;
        switch (bln) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                jumlahHari = 31;
                check(tgl, jumlahHari, bln, thn);
                break;
            case 2:
                jumlahHari = thn % 4 == 0 ? 29 : 28;
                check(tgl, jumlahHari, bln, thn);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                jumlahHari = 30;
                check(tgl, jumlahHari, bln, thn);
                break;
            default:
                System.out.println("Data tanggal yang Anda masukan salah");
                isValidate = false;
        }
    }

    void check(int tgl, int jumlahHari, int bln, int thn) {
        try {
            assert (tgl <= jumlahHari || tgl > 0);
            if (tgl > jumlahHari || tgl < 0) {
                isValidate = false;
                throw new CustomException("Input data tanggal salah");
            }
            makeCal(tgl, bln, thn);
        } catch (CustomException ex) {
            System.out.println(ex.getMessage());
        }
    }

    void makeCal(int tgl, int bln, int thn) {
        StringBuilder builder2 = new StringBuilder();
        builder2.append(31);
        builder2.append("/");
        builder2.append(12);
        builder2.append("/");
        builder2.append(2017);
        String shift = builder2.toString();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        try {
            setTglshift(df.parse(shift));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
        checkLebih(tgl, bln, thn);
        Calendar cal = Calendar.getInstance();
        for (int i = 0; i < 2; i++) {
            cal.setTime(Tglshift);
            cal.add(Calendar.DAY_OF_MONTH, i);
            System.out.println(df.format(cal.getTime()));
            Tgl[i] = (cal.getTime());
        }
        Hitung(Tgl);
    }

    void checkLebih(int tgl, int bln, int thn) {
        StringBuilder builder = new StringBuilder();
        builder.append(tgl);
        builder.append("/");
        builder.append(bln);
        builder.append("/");
        builder.append(thn);
        String lahir = builder.toString();

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        try {
            setTgllahir(df.parse(lahir));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            if (getTgllahir().after(getTglshift()) || getTgllahir().equals(getTglshift())) {
                isValidate = false;
                throw new CustomException("Tanggal lahir tidak diperbolehkan melebihi tanggal shift");
            }
        } catch (CustomException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void Hitung(Date shift[]) {
        if (isValidate == true) {
            int hari[] = new int[getJmlShift()];
            for (int i = 0; i < hari.length; i++) {
                hari[i] = (int) TimeUnit.MILLISECONDS.toDays((shift[i].getTime() - getTgllahir().getTime()));
                System.out.println(" " + hari[i]);
                Symbiorythm sym = new Symbiorythm(getJmlShift());
                sym.getFisik(hari);
                sym.getEmosional(hari);
                sym.getIntelektual(hari);
                sym.totalSym();
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tgl, bln, thn, tgl2, bln2, thn2;
        Tanggal tanggal = new Tanggal(2);
        tgl = in.nextInt();
        bln = in.nextInt();
        thn = in.nextInt();
        tanggal.validate(tgl, bln, thn);

        Tanggal tanggal2 = new Tanggal(2);
        tgl2 = in.nextInt();
        bln2 = in.nextInt();
        thn2 = in.nextInt();
        tanggal2.validate(tgl2, bln2, thn2);
    }
}
