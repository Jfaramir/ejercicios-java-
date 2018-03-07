/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author xp
 */
public class EjerciciosJavaTest {
    
    public EjerciciosJavaTest() {
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
     * Test of calendario method, of class EjerciciosJava.
     */
    @Test
    public void testCalendario() {
        System.out.println("calendario");
        int n = 0;
        EjerciciosJava instance = new EjerciciosJava();
        instance.calendario(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anagrama method, of class EjerciciosJava.
     */
    @Test
    public void testAnagrama() {
        System.out.println("anagrama");
        String p1 = "";
        String p2 = "";
        EjerciciosJava instance = new EjerciciosJava();
        boolean expResult = false;
        boolean result = instance.anagrama(p1, p2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of acronimo method, of class EjerciciosJava.
     */
    @Test
    public void testAcronimo() {
        System.out.println("acronimo");
        String palabra = "";
        EjerciciosJava instance = new EjerciciosJava();
        String expResult = "";
        String result = instance.acronimo(palabra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ejemplosString method, of class EjerciciosJava.
     */
    @Test
    public void testEjemplosString() {
        System.out.println("ejemplosString");
        String frase = "";
        EjerciciosJava instance = new EjerciciosJava();
        boolean expResult = false;
        boolean result = instance.ejemplosString(frase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isograma method, of class EjerciciosJava.
     */
    @Test
    public void testIsograma() {
        System.out.println("isograma");
        EjerciciosJava instance = new EjerciciosJava();
        boolean expResult = false;
        boolean result = instance.isograma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class EjerciciosJava.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EjerciciosJava.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
