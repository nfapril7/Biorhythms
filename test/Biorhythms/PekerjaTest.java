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
 * @author userx
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
     * Test of perbandingan method, of class Pekerja.
     */
    @Test
    public void testPerbandingan() {
        System.out.println("perbandingan");
        double[] BiorithmsPekerja1 = null;
        double[] BiorithmsPekerja2 = null;
        int jumlahshift = 0;
        ValiDate v = null;
        JTable jTable1 = null;
        Pekerja instance = null;
        String[] expResult = null;
        String[] result = instance.perbandingan(BiorithmsPekerja1, BiorithmsPekerja2, jumlahshift, v, jTable1);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
