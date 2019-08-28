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
public class CarroTest {
    
    public CarroTest() {
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
     * Test of getMarca method, of class Carro.
     */
    @Test
    public void testGetMarca() {
        System.out.println("getMarca");
        Carro instance = new Carro();
        String expResult = null;
        String result = instance.getMarca();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMarca method, of class Carro.
     */
    @Test
    public void testSetMarca() {
        System.out.println("setMarca");
        String marca = null;
        Carro instance = new Carro();
        instance.setMarca(marca);
    }

    /**
     * Test of getModelo method, of class Carro.
     */
    @Test
    public void testGetModelo() {
        System.out.println("getModelo");
        Carro instance = new Carro();
        String expResult = null;
        String result = instance.getModelo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setModelo method, of class Carro.
     */
    @Test
    public void testSetModelo() {
        System.out.println("setModelo");
        String modelo = null;
        Carro instance = new Carro();
        instance.setModelo(modelo);
    }

    /**
     * Test of getPlaca method, of class Carro.
     */
    @Test
    public void testGetPlaca() {
        System.out.println("getPlaca");
        Carro instance = new Carro();
        String expResult = null;
        String result = instance.getPlaca();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlaca method, of class Carro.
     */
    @Test
    public void testSetPlaca() {
        System.out.println("setPlaca");
        String placa = null;
        Carro instance = new Carro();
        instance.setPlaca(placa);
    }
    
}
