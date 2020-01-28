/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.seltest.test;

import com.itexps.seltest.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author itexps
 */
public class CalculatorTest {
    Calculator c;
    //constructor
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("**** Executing setUpClass method  ****");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("**** Executing tearDownClass method  ****");
    }
    
    @Before
    public void setUp() {
        System.out.println("**** Executing setUp method  ****");
        c=new Calculator();
    }
    
    @After
    public void tearDown() {
        System.out.println("**** Executing tearDown method  ****");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void add() {
         System.out.println("*** Executing add() method ***");
         double result=c.add(100.5,200.5);
         assertEquals(301.0, result,0.0);
     }
     
     @Test
     public void addMore() {
         System.out.println("*** Executing addMore() method ***");
         double result=c.add(20000,21000);
         assertEquals(41000.0, result,0.0);
     }
     
     @Test
     public void substract(){
         System.out.println("*** Executing subtract() method ***");
         double result=c.subtract(300,100);
         assertEquals(200.0, result,0.0);
     }
}
