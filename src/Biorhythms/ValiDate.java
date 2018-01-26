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
import java.util.concurrent.TimeUnit;

/**
 *
 * @author april nf
 */
public class ValiDate {

    private int jmlShift, tgl, bln, thn, jumlahHari, tglAwal, blnAwal, thnAwal;
    private Date Tgllahir, Tglshift;
    private boolean isValidate = true;
    protected Date Shift[];

    public ValiDate(int jmlShift, int tglAwal, int blnAwal, int thnAwal) {
        Shift = new Date[jmlShift];
        setJmlShift(jmlShift);
        setTglAwal(tglAwal);
        setBlnAwal(blnAwal);
        setThnAwal(thnAwal);
        System.out.println(thnAwal);
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

    public void validate() {
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
            makeCal();
        } catch (CustomException ex) {
            System.out.println(ex.getMessage());
        }
    }

    void makeCal() {
        StringBuilder builder = new StringBuilder();
        builder.append(getTglAwal());
        builder.append("/");
        builder.append(getBlnAwal());
        builder.append("/");
        builder.append(getThnAwal());
        String shift = builder.toString();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        try {
            setTglshift(df.parse(shift));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
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

    void checkLebih() {
        StringBuilder builder = new StringBuilder();
        builder.append(getTgl());
        builder.append("/");
        builder.append(getBln());
        builder.append("/");
        builder.append(getThn());
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
    
    public void checkHandling(){
        
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
