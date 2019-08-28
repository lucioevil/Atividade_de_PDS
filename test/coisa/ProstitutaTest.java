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
public class ProstitutaTest {
    
    public ProstitutaTest() {
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
     * Test of getPreco method, of class Prostituta.
     */
    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        Prostituta instance = new Prostituta();
        double expResult = 0.0;
        double result = instance.getPreco();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setPreco method, of class Prostituta.
     */
    @Test
    public void testSetPreco() {
        System.out.println("setPreco");
        double preco = 0.0;
        Prostituta instance = new Prostituta();
        instance.setPreco(preco);
    }

    /**
     * Test of getTelefone method, of class Prostituta.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        Prostituta instance = new Prostituta();
        String expResult = null;
        String result = instance.getTelefone();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTelefone method, of class Prostituta.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        String telefone = null;
        Prostituta instance = new Prostituta();
        instance.setTelefone(telefone);
    }
    
}
