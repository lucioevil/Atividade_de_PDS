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
public class HumanoTest {
    
    public HumanoTest() {
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
     * Test of getNome method, of class Humano.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Humano instance = new Humano();
        String expResult = null;
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNome method, of class Humano.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = null;
        Humano instance = new Humano();
        instance.setNome(nome);
    }

    /**
     * Test of getSexo method, of class Humano.
     */
    @Test
    public void testGetSexo() {
        System.out.println("getSexo");
        Humano instance = new Humano();
        String expResult = null;
        String result = instance.getSexo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSexo method, of class Humano.
     */
    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        String sexo = null;
        Humano instance = new Humano();
        instance.setSexo(sexo);
    }
    
}
