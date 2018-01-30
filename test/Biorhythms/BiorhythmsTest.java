/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biorhythms;

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
public class BiorhythmsTest {
    
    public BiorhythmsTest() {
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
     * Test of getEmosional method, of class Biorhythms.
     */
    @Test
    public void testGetEmosional() {
        System.out.println("getEmosional");
        int[] hari = null;
        Biorhythms instance = null;
        double[] expResult = null;
        double[] result = instance.getEmosional(hari);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFisik method, of class Biorhythms.
     */
    @Test
    public void testGetFisik() {
        System.out.println("getFisik");
        int[] hari = null;
        Biorhythms instance = null;
        double[] expResult = null;
        double[] result = instance.getFisik(hari);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIntelektual method, of class Biorhythms.
     */
    @Test
    public void testGetIntelektual() {
        System.out.println("getIntelektual");
        int[] hari = null;
        Biorhythms instance = null;
        double[] expResult = null;
        double[] result = instance.getIntelektual(hari);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class Biorhythms.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Biorhythms instance = null;
        double[] expResult = null;
        double[] result = instance.getTotal();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
