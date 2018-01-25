/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author april nf
 */
public class Random2Test {

    public Random2Test() {
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
     * Test of data method, of class Random2.
     */
    @Test
    public void testData() {
        System.out.println("data");
        Random2 instance = null;
//        instance.data();
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of random method, of class Random2.
     */
   
    public void testRandom() {
        System.out.println("random");
        Random2 instance = null;
//        instance.random();
        // TODO review the generated test code and remove the default call to fail.
        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                assertNotSame(instance.b[i], instance.b[i + 1]);
            }
        }
    }

    /**
     * Test of main method, of class Random2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Random2.main(args);
        // TODO review the generated test code and remove the default call to fail.

    }

}
