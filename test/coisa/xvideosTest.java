/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coisa;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20161064010029
 */
public class xvideosTest {
    
    public xvideosTest() {
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
     * Test of getCategoria method, of class xvideos.
     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        xvideos instance = new xvideos();
        String expResult = null;
        String result = instance.getCategoria();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCategoria method, of class xvideos.
     */
    @Test
    public void testSetCategoria() {
        System.out.println("setCategoria");
        String categoria = null;
        xvideos instance = new xvideos();
        instance.setCategoria(categoria);
    }

    /**
     * Test of getQualidade method, of class xvideos.
     */
    @Test
    public void testGetQualidade() {
        System.out.println("getQualidade");
        xvideos instance = new xvideos();
        String expResult = null;
        String result = instance.getQualidade();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQualidade method, of class xvideos.
     */
    @Test
    public void testSetQualidade() {
        System.out.println("setQualidade");
        String qualidade = null;
        xvideos instance = new xvideos();
        instance.setQualidade(qualidade);
    }
    
}
