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
     * Test untuk method getEmosional ketika kondisi atau inputan benar dari
     * Biorhythms.
     */
    @Test
    public void testGetEmosional() {
        System.out.println("getEmosional");
        int[] hari = {20};
        Biorhythms instance = new Biorhythms(1);
        double[] expResult = {-0.9749279121818236};
        double[] result = instance.getEmosional(hari);
        assertArrayEquals(expResult, result, 0.0);

    }

    /**
     * Test untuk method getEmosional ketika kondisi atau inputan salah dari
     * Biorhythms.
     */
    @Test
    public void testGetEmosionalFalse() {
        System.out.println("getEmosional false");
        int[] hari = {20};
        Biorhythms instance = new Biorhythms(1);
        double[] expResult = {-0.730835964278124};
        double[] result = instance.getEmosional(hari);
        assertNotEquals(expResult, result);

    }

    /**
     * Test untuk method getFisik ketika kondisi atau inputan benar dari
     * Biorhythms.
     */
    @Test
    public void testGetFisik() {
        System.out.println("getFisik");
        int[] hari = {20};
        Biorhythms instance = new Biorhythms(1);
        double[] expResult = {-0.730835964278124};
        double[] result = instance.getFisik(hari);
        assertArrayEquals(expResult, result, 0.0);

    }

    /**
     * Test untuk method getFisik ketika kondisi atau inputan salah dari
     * Biorhythms.
     */
    @Test
    public void testGetFisikFalse() {
        System.out.println("getFisik false");
        int[] hari = {20};
        Biorhythms instance = new Biorhythms(1);
        double[] expResult = {-0.730835964278124};
        double[] result = instance.getFisik(hari);
        assertNotEquals(expResult, result);

    }

    /**
     * Test untuk method getIntelektual ketika kondisi atau inputan benar dari
     * Biorhythms.
     */
    @Test
    public void testGetIntelektual() {
        System.out.println("getIntelektual");
        int[] hari = {20};
        Biorhythms instance = new Biorhythms(1);
        double[] expResult = {-0.730835964278124};
        double[] result = instance.getIntelektual(hari);
        assertArrayEquals(expResult, result, 0.0);

    }

    /**
     * Test untuk method getIntelektual ketika kondisi atau inputan salah dari
     * Biorhythms.
     */
    @Test
    public void testGetIntelektualFalse() {
        System.out.println("getIntelektual false");
        int[] hari = {20};
        Biorhythms instance = new Biorhythms(1);
        double[] expResult = {-0.9749279121818236};
        double[] result = instance.getIntelektual(hari);
        assertNotEquals(expResult, result);

    }

    /**
     * Test untuk method getTotal ketika kondisi atau inputan benar dari
     * Biorhythms.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Biorhythms instance = new Biorhythms(1);
        double[] expResult = {-2.436599840738072};
        instance.fisik[0] = -0.730835964278124;
        instance.emosional[0] = -0.9749279121818236;
        instance.intelektual[0] = -0.730835964278124;
        double[] result = instance.getTotal();
        assertArrayEquals(expResult, result, 0.0);

    }

    /**
     * Test untuk method getTotal ketika kondisi atau inputan salah dari
     * Biorhythms.
     */
    @Test
    public void testGetTotalFalse() {
        System.out.println("getTotal false");
        Biorhythms instance = new Biorhythms(1);
        double[] expResult = {0.436599840738072};
        instance.fisik[0] = -0.730835964278124;
        instance.emosional[0] = -0.9749279121818236;
        instance.intelektual[0] = -0.730835964278124;
        double[] result = instance.getTotal();
        assertNotEquals(expResult, result);

    }

}
