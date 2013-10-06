/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.anrial.test;

import net.anrial.clases.palindromo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ana
 */
public class palindromoTest {
    
    public palindromoTest() {
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

    @Test
    public void testGetPalindromo() {
        System.out.println("test: getPalindromo");
        palindromo oPalindromo = new palindromo();
        assertNotNull("objeto palindromo creado", oPalindromo);
        assertEquals("getPalindromo: devuelve un palindromo", oPalindromo.getPalindromo("otto"), "otto");
        assertTrue("getPalindromo: devuelve un palindromo", "otto".equals(oPalindromo.getPalindromo("otto")));
        if (!oPalindromo.getPalindromo("otto").equals("otto")) {
            fail("getPalindromo: palindromo no iguales");
        }
        assertSame("prueba getReference", oPalindromo, oPalindromo.getReference());
        palindromo oPalindromo2 = new palindromo();
        assertNotSame("no son el mismo objeto", oPalindromo, oPalindromo2);
    }
}
