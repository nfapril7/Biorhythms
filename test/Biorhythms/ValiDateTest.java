/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biorhythms;

import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author userx
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
        ValiDate instance = new ValiDate();
        Date expResult = null;
        Date result = instance.makeAppendShift(10, 2, 1998);
        assertEquals("10/2/1998", result);
        
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
        int tgl = 0;
        int bln = 0;
        int thn = 0;
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
        instance.check();
        
    }

    /**
     * Test of makeCal method, of class ValiDate.
     */
    @Test
    public void testMakeCal() {
        System.out.println("makeCal");
        ValiDate instance = new ValiDate();
        instance.makeCal();
        
    }

    /**
     * Test of makeAppendforBirth method, of class ValiDate.
     */
    @Test
    public void testMakeAppendforBirth() {
        System.out.println("makeAppendforBirth");
        ValiDate instance = new ValiDate();
        Date result = instance.makeAppendforBirth(10, 12, 1998);
        assertEquals("10/12/1998", result);
        
    }

    /**
     * Test of checkLebih method, of class ValiDate.
     */
    @Test
    public void testCheckLebih() {
        System.out.println("checkLebih");
        ValiDate instance = new ValiDate();
        instance.checkLebih();
        
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
    @Test
    public void testValidasiKarakter() {
        System.out.println("validasiKarakter");
        KeyEvent evt = null;
        ValiDate instance = new ValiDate();
        instance.validasiKarakter(evt);
        
    }

    /**
     * Test of validasiJumlah method, of class ValiDate.
     */
    @Test
    public void testValidasiJumlah() {
        System.out.println("validasiJumlah");
        KeyEvent evt = null;
        JTextField jTField = null;
        int batas_atas = 0;
        int batas_bawah = 0;
        ValiDate instance = new ValiDate();
        instance.validasiJumlah(evt, jTField, batas_atas, batas_bawah);
        
    }
    
}
