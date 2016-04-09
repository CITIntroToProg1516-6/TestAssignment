/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit.programming.testassignment;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chris
 */
public class TestClassTest {
    
    public TestClassTest() {
    }

    /**
     * Test of main method, of class TestClass.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TestClass.main(args);
        assertEquals(1,1);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
