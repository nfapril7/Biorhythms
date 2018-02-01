/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biorhythms;

import javax.swing.JTable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author april nf, ryanpradnya
 */
public class PekerjaTest {

    public PekerjaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test untuk method Perbandingan ketika kondisi atau inputan benar dari
     * class Pekerja.
     */
    @Test
    public void testPerbandingan() { 
        System.out.println("perbandingan");
        ValiDate validate1 = new ValiDate();
        ValiDate validate2 = new ValiDate();
        validate1.MakeShift(29, 12, 2020, 5);
        validate1.validate(2, 2, 1995);
        validate2.validate(3, 3, 1991);
        //validate2.MakeShift(29, 10, 2020, 5);
        validate2.setJmlShift(validate1.getJmlShift());
        validate2.setTglshift(validate1.getTglshift());
        Biorhythms b1 = new Pekerja(validate1.getJmlShift());
        validate1.makeCal();
        validate2.makeCal();
        validate1.Hitung(validate1.getShift(), b1);
        Pekerja p1 = new Pekerja(validate1.getJmlShift());
        Biorhythms b2 = new Pekerja(validate2.getJmlShift());
        validate2.Hitung(validate2.getShift(), b2);
        Pekerja p2 = new Pekerja(validate2.getJmlShift());
        JTable jTable1 = new JTable();
        String[] expResult = {"Pekerja 1", "Pekerja 1", "Pekerja 1", "Pekerja 1", "Pekerja 1"};
        String[] result = p2.perbandingan(b1.total, b2.total, validate1.getJmlShift(), validate1, jTable1);
        assertArrayEquals(expResult, result);

    }

    /**
     * Test untuk method Perbandingan ketika kondisi atau inputan salah dari
     * class Pekerja.
     */
    @Test
    public void testPerbandinganFalse() {
        System.out.println("perbandingan false");
        ValiDate validate1 = new ValiDate();
        ValiDate validate2 = new ValiDate();
        validate1.MakeShift(29, 12, 2020, 5);
        validate1.validate(2, 2, 1995);
        validate2.validate(3, 3, 1991);
        //validate2.MakeShift(29, 10, 2020, 5);
        validate2.setJmlShift(validate1.getJmlShift());
        validate2.setTglshift(validate1.getTglshift());
        Biorhythms b1 = new Pekerja(validate1.getJmlShift());
        validate1.makeCal();
        validate2.makeCal();
        validate1.Hitung(validate1.getShift(), b1);
        Pekerja p1 = new Pekerja(validate1.getJmlShift());
        Biorhythms b2 = new Pekerja(validate2.getJmlShift());
        validate2.Hitung(validate2.getShift(), b2);
        Pekerja p2 = new Pekerja(validate2.getJmlShift());
        JTable jTable1 = new JTable();
        String[] expResult = {"Pekerja 2", "Pekerja 2", "Pekerja 2", "Pekerja 2", "Pekerja 2"};
        String[] result = p2.perbandingan(b1.total, b2.total, validate1.getJmlShift(), validate1, jTable1);
        assertNotEquals(expResult, result);
    }

}
