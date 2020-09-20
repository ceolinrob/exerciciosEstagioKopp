/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClasseExercicioTest {
    
    public ClasseExercicioTest() {
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
     * Test of funcao method, of class ClasseExercicio.
     */
    @Test
    public void testFuncao() {
        assertEquals(611.00, ClasseExercicio.funcao(Arrays.asList(88.00, 130.00, 54.90, 293.30, 44.80)), 0.0);
    }
    
}
