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
public class Operacoes_simplesTest {
    
    public Operacoes_simplesTest() {
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
     * Test of somar method, of class Operacoes_simples.
     */
    @Test
    public void testSomar() {
        System.out.println("somar");
        double n1 = 10.0;
        double n2 = 2.0;
        double expResult = 12.0;
        double result = Operacoes_simples.somar(n1, n2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of subtrair method, of class Operacoes_simples.
     */
    @Test
    public void testSubtrair() {
        System.out.println("subtrair");
        double n1 = 10.0;
        double n2 = 2.0;
        double expResult = 8.0;
        double result = Operacoes_simples.subtrair(n1, n2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of dividir method, of class Operacoes_simples.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        double n1 = 10.0;
        double n2 = 2.0;
        double expResult = 5.0;
        double result = Operacoes_simples.dividir(n1, n2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of mult method, of class Operacoes_simples.
     */
    @Test
    public void testMult() {
        System.out.println("mult");
        double n1 = 10.0;
        double n2 = 2.0;
        double expResult = 20.0;
        double result = Operacoes_simples.mult(n1, n2);
        assertEquals(expResult, result, 0.0);
    }
    
}
