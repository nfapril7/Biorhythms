/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biorhythms;

import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aprilnf, ryanpradnya
 */
public class ValiDateTest {

    public ValiDateTest() {
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
     * Test of makeAppendShift method, of class ValiDate.
     */
    @Test
    public void testMakeAppendShift() {
        System.out.println("makeAppendShift");
        SimpleDateFormat d = new SimpleDateFormat("dd/mm/yyyy");
        ValiDate instance = new ValiDate();
        Date expResult = null;
        Date result = instance.makeAppendShift(10, 2, 1998);
        assertEquals("10/02/1998", d.format(result));

    }

    /**
     * Test of MakeShift method, of class ValiDate.
     */
    @Test
    public void testMakeShift() {
        System.out.println("MakeShift");
        ValiDate instance = new ValiDate();
        instance.MakeShift(20, 15, 2018, 5);

    }

    /**
     * Test of validate method, of class ValiDate.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        int tgl = 20;
        int bln = 12;
        int thn = 2018;
        ValiDate instance = new ValiDate();
        instance.validate(tgl, bln, thn);

    }

    /**
     * Test of check method, of class ValiDate.
     */
    @Test
    public void testCheck() {
        System.out.println("check");
        ValiDate instance = new ValiDate();
        //instance.check();
//        instance.check();

    }

    /**
     * Test of makeCal method, of class ValiDate.
     */
//    @Test
//    public void testMakeCal() {
//        System.out.println("makeCal");
//        ValiDate instance = new ValiDate();
//        instance.makeCal();//
//    }

    /**
     * Test of makeAppendforBirth method, of class ValiDate.
     */
    @Test
    public void testMakeAppendforBirth() {
        SimpleDateFormat d = new SimpleDateFormat("dd/mm/yyyy");
        System.out.println("makeAppendforBirth");
        ValiDate instance = new ValiDate();
        Date result = instance.makeAppendforBirth(10, 12, 1998);
        assertEquals("10/12/1998", d.format(result));

    }

    /**
     * Test of checkLebih method, of class ValiDate.
     */
    @Test
    public void testCheckLebih() throws ParseException {
        System.out.println("checkLebih");
        SimpleDateFormat df = new SimpleDateFormat();
        ValiDate instance = new ValiDate();
        instance.setTgl(22);
        instance.setBln(2);
        instance.setThn(1995);
        String tgl = "10/10/2018";
        try {
            instance.setTglshift(df.parse(tgl));
            instance.checkLebih();
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
        assertTrue(instance.isValidate);
    }

    /**
     * Test of Hitung method, of class ValiDate.
     */
    @Test
    public void testHitung() {
        System.out.println("Hitung");
        Date[] shift = null;
        Biorhythms sym = null;
        ValiDate instance = new ValiDate();
        instance.Hitung(shift, sym);

    }

    /**
     * Test of validasiKarakter method, of class ValiDate.
     */
//    @Test
//    public void testValidasiKarakter() {
//        System.out.println("validasiKarakter");
//        KeyEvent evt = null;
//        ValiDate instance = new ValiDate();
//        instance.validasiKarakter(evt);
//        assertFalse(instance.isValidate);
//
//    }

    /**
     * Test of validasiJumlah method, of class ValiDate.
     */
    @Test
    public void testValidasiJumlah() {
        System.out.println("validasiJumlah");
        KeyEvent evt = null;
        JTextField jTField = new JTextField();
        int batas_atas = 0;
        ValiDate instance = new ValiDate();
        instance.validasiJumlah(evt, jTField, batas_atas);

    }

}
