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
     * Test of makeAppendShift method false, of class ValiDate.
     */
    @Test
    public void testMakeAppendShiftFalse() {
        System.out.println("makeAppendShift false");
        SimpleDateFormat d = new SimpleDateFormat("dd/mm/yyyy");
        ValiDate instance = new ValiDate();
        Date expResult = null;
        Date result = instance.makeAppendShift(10, 88, 1998);
        assertNotEquals("10/02/1998", d.format(result));

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
        assertTrue(instance.validate(tgl, bln, thn));

    }
    
    /**
     * Test of validate method false, of class ValiDate.
     */
    @Test
    public void testValidateFalse() {
        System.out.println("validate false");
        int tgl = 40;
        int bln = 12;
        int thn = 2018;
        ValiDate instance = new ValiDate();
        assertFalse(instance.validate(tgl, bln, thn));

    }


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
     * Test of makeAppendforBirth method, of class ValiDate.
     */
    @Test
    public void testMakeAppendforBirthFalse() {
        SimpleDateFormat d = new SimpleDateFormat("dd/mm/yyyy");
        System.out.println("makeAppendforBirth false");
        ValiDate instance = new ValiDate();
        Date result = instance.makeAppendforBirth(51, 89, 1998);
        assertNotEquals("10/12/1998", d.format(result));

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
            assertTrue(instance.checkLebih());
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    /**
     * Test of checkLebih method false, of class ValiDate.
     */
    @Test
    public void testCheckLebihFalse() throws ParseException {
        System.out.println("checkLebih");
        SimpleDateFormat df = new SimpleDateFormat();
        ValiDate instance = new ValiDate();
        instance.setTgl(22);
        instance.setBln(12);
        instance.setThn(2018);
        String tgl = "10/10/2018";
        try {
            instance.setTglshift(df.parse(tgl));
            assertFalse(instance.checkLebih());
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    
    /**
     * Test of MakeShift method, of class ValiDate.
     */
    @Test
    public void testMakeShift() {
        System.out.println("MakeShift");
        int tglAwal = 20;
        int blnAwal = 12;
        int thnAwal = 2018;
        int jmlShift = 5;
        ValiDate instance = new ValiDate();
        boolean expResult = true;
        boolean result = instance.MakeShift(tglAwal, blnAwal, thnAwal, jmlShift);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of MakeShift method false, of class ValiDate.
     */
    @Test
    public void testMakeShiftFalse() {
        System.out.println("MakeShift false");
        int tglAwal = 20;
        int blnAwal = 12;
        int thnAwal = 2018;
        int jmlShift = 1;
        ValiDate instance = new ValiDate();
        boolean expResult = false;
        boolean result = instance.MakeShift(tglAwal, blnAwal, thnAwal, jmlShift);
        assertEquals(expResult, result);
    }

    /**
     * Test of check method, of class ValiDate.
     */
    @Test
    public void testCheck() {
        System.out.println("check");
        int tgl = 19;
        int bln = 3;
        int thn = 1996;
        ValiDate instance = new ValiDate();
        instance.setJumlahHari(31);
        boolean expResult = true;
        boolean result = instance.check(tgl, bln, thn);
        assertEquals(expResult, result);
    
    }

    /**
     * Test of check method false, of class ValiDate.
     */
    @Test
    public void testCheckFalse() {
        System.out.println("check false");
        int tgl = 99;
        int bln = 3;
        int thn = 1996;
        ValiDate instance = new ValiDate();
        instance.setJumlahHari(31);
        boolean expResult = false;
        boolean result = instance.check(tgl, bln, thn);
        assertEquals(expResult, result);
    
    }
    
}
