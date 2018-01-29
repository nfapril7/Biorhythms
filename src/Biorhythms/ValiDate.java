/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biorhythms;

import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author april nf, ryan Kelas Validate untuk memvalidasi inputan tanggal
 */
public class ValiDate {

    /**
     * Deklarasi variabel
     */
    private int jmlShift, tgl, bln, thn, jumlahHari, tglAwal, blnAwal, thnAwal;
    private Date Tgllahir, Tglshift;
    boolean isValidate = true;
    protected Date Shift[];
    Scanner in;
    SimpleDateFormat df;

    /**
     * Konstruktor
     */
    public ValiDate() {
        in = new Scanner(System.in);
        df = new SimpleDateFormat("dd/MM/yyyy");
    }

    /**
     *
     * @param tgl : inputan tanggal lahir pekerja yang akan digunakan untuk
     * men-set variabel tgl
     */
    public void setTgl(int tgl) {
        this.tgl = tgl;
    }

    /**
     *
     * @param bln : inputan bulan lahir pekerja yang akan digunakan untuk
     * men-set variabel bln
     */
    public void setBln(int bln) {
        this.bln = bln;
    }

    /**
     *
     * @param thn : inputan tahun lahir pekerja yang akan digunakan untuk
     * men-set variabel thn
     */
    public void setThn(int thn) {
        this.thn = thn;
    }

    /**
     *
     * @return Mengembalikan nilai variabel tgl lahir pekerja
     */
    public int getTgl() {
        return tgl;
    }

    /**
     *
     * @return Mengembalikan nilai variabel bln lahir pekerja
     */
    public int getBln() {
        return bln;
    }

    /**
     *
     * @return Mengembalikan nilai variabel thn lahir pekerja
     */
    public int getThn() {
        return thn;
    }

    /**
     *
     * @param tglAwal : inputan tanggal awal shift yang akan digunakan untuk
     * men-set variabel tglAwal
     */
    public void setTglAwal(int tglAwal) {
        this.tglAwal = tglAwal;
    }

    /**
     *
     * @return Mengembalikan nilai variabel tglAwal (tanggal awal shift)
     */
    public int getTglAwal() {
        return tglAwal;
    }

    /**
     *
     * @param blnAwal : inputan bulan awal shift yang akan digunakan untuk
     * men-set variabel blnAwal
     */
    public void setBlnAwal(int blnAwal) {
        this.blnAwal = blnAwal;
    }

    /**
     *
     * @return Mengembalikan nilai variabel blnAwal (bulan awal shift)
     */
    public int getBlnAwal() {
        return blnAwal;
    }

    /**
     *
     * @param thnAwal : inputan tahun awal shift yang akan digunakan untuk
     * men-set variabel thnAwal
     */
    public void setThnAwal(int thnAwal) {
        this.thnAwal = thnAwal;
    }

    /**
     *
     * @return Mengembalikan nilai variabel thnAwal (tahun awal shift)
     */
    public int getThnAwal() {
        return thnAwal;
    }

    /**
     *
     * @param jumlahHari : Men-set variabel jumlah hari berdasarkan bulan yang
     * diinputkaan yang nantinya akan digunakan untuk validasi agar inputan
     * tanggal user tidak melebihi/kurang dari jumlah hari dalam bulan
     */
    public void setJumlahHari(int jumlahHari) {
        this.jumlahHari = jumlahHari;
    }

    /**
     *
     * @param Shift : Men-set variabel shift dengan tipe data Date dari inputan
     * tanggal, bulan, tahun yang diinputkan
     */
    public void setShift(Date[] Shift) {
        System.out.println("yyyyy");
        this.Shift = Shift;
    }

    /**
     *
     * @return Mengembalikan nilai variabel Shift
     */
    public Date[] getShift() {
        System.out.println("ooo");
        return Shift;
    }

    /**
     *
     * @param jmlShift : inputan berapa banyak jumlah shift dalam hari (inputan
     * harus 5 sampai 10 hari)
     */
    public void setJmlShift(int jmlShift) {
        this.jmlShift = jmlShift;
    }

    /**
     *
     * @return Mengembalikan nilai variabel jmlShift (jumlah hari shift)
     */
    public int getJmlShift() {
        return jmlShift;
    }

    /**
     *
     * @param Tgllahir : Men-set variabel Tgllahir dari inputan user tgl, bln,
     * thn lahir yang telah diubah ke dalam format dd/mm/yyyy
     */
    public void setTgllahir(Date Tgllahir) {
        this.Tgllahir = Tgllahir;
    }

    /**
     *
     * @return Mengembalikan nilai variabel Tgllahir dengan tipe data Date dari
     * inputan user pada varibael tgl, blln, thn lahir
     */
    public Date getTgllahir() {
        return Tgllahir;
    }

    /**
     *
     * @param Tglshift : Men-set variabel Tglshift dari inputan user tgl, bln,
     * thn shift yang telah diubah ke dalam format dd/mm/yyyy
     */
    public void setTglshift(Date Tglshift) {
        this.Tglshift = Tglshift;
    }

    /**
     *
     * @return Mengembalikan nilai variabel Tglshift dengan tipe data Date dari
     * inputan user tgl, bln, thn untuk jadwal shift dimulai
     */
    public Date getTglshift() {
        return Tglshift;
    }
    /**
     * Method makeAppendShift untuk membentuk Date Shift Pertama menggabungkan
     * inputan parameter tgl, bln, thn menggunakan fungsi Append Mengubah
     * inputan user tgl, bln, thn yang bertipe data integer ke dalam tipe data
     * Date
     *
     * @param tgl : inputan parameter tgl lahir
     * @param bln : inputan parameter bln lahir
     * @param thn : inputan parameter thn lahir
     * @return : Mengembalikan nilai variabel Tglshift
     */
    Date makeAppendShift(int tgl, int bln, int thn) {
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

    /**
     * Method HandlingBatasan berfungsi untuk menhandling jika inputan user pada
     * jumlah shift melebihi/kurang dari persyaratan (jumlah hari shift harus 5
     * sampai 10 hari);
     *
     * @param tglAwal : membutuhkan inputan parameter tgl shift
     * @param blnAwal : membutuhkan inputan parameter bulan shift
     * @param thnAwal : membutuhkan inputan parameter tahun shift
     */
    void MakeShift(int tglAwal, int blnAwal, int thnAwal, int jmlShift) {
        try {
            if (jmlShift < 5 || jmlShift > 10) {
                isValidate = false;
                JOptionPane.showMessageDialog(null, "Jumlah shift antara 5 sampai 10 hari",
                        "Warning", JOptionPane.INFORMATION_MESSAGE);
                throw new CustomException("Jumlah shift antara 5 sampai 10 hari");                
            } else {
                Shift = new Date[getJmlShift()];
                setJmlShift(jmlShift);
                setTglAwal(tglAwal);
                setBlnAwal(blnAwal);
                setThnAwal(thnAwal);
                makeAppendShift(getTglAwal(), getBlnAwal(), getThnAwal());
                isValidate = true;
            }
        } catch (CustomException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Method makeBirthDate untuk merequest inputan user pada varibel: tgl ,
     * bln, tahun lahir pekerja
     */

    /**
     * Method validate untuk memvalidasi inputan tgl, bln, tahun
     */
    public void validate(int tgl, int bln, int thn) {
        setTgl(tgl);
        setBln(bln);
        setThn(thn);
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

    /**
     * Method check untuk menghandling jika inputan tgl dalam bulan
     * melebihi/kurang dari jumlah hari dalam suatu bulan
     */
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

    /**
     * Method makeCal untuk membuat tanggal shift sejumlah jumlah hari shift
     *
     */
    void makeCal() {
        System.out.println("ya");
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

    /**
     * Method makeAppendforBirth untuk menggabungkan tgl, bln, thn lahir pekerja
     * kemudian diubah ke dalam format dd/mm/yyyy
     *
     * @param tgl
     * @param bln
     * @param thn
     * @return
     */
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

    /**
     * Method cehckLebih untuk menhandling jika date lahir melebihi date shift
     * misalnya, tgl shift : 1-1-2018, tgl lahir : 1-2-2018 maka jika inputan
     * seperti tersebut, akan memanggil class CustomException
     */
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

    /**
     * Method Hitung untuk memanggil kelas Biorhythm jika tanggal shift dan
     * lahir sudah tervalidasi maka dapat dilakukan perhitungan dengan rumus
     * Biorhythms
     *
     * @param shift
     * @param sym
     */
    public void Hitung(Date shift[], Biorhythms sym) {
        if (isValidate == true) {
            int hari[] = new int[getJmlShift()];
            for (int i = 0; i < hari.length; i++) {
                hari[i] = (int) TimeUnit.MILLISECONDS.toDays((shift[i].getTime() - getTgllahir().getTime()));
                sym.getFisik(hari);
                sym.getEmosional(hari);
                sym.getIntelektual(hari);
                sym.getTotal();
            }
        }
    }
    /**
     * 
     * @param evt variabel untuk menset objek dari keyevent
     * method validasiKarakter digunakan untuk validasi agar tidak bisa menginputkan selain integer
     */
    public void validasiKarakter(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }
}
