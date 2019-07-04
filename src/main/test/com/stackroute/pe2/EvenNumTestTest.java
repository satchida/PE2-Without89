package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {


    //Instanciating the class
    EvenNumTest ob;

    @Before
    public void setUp() throws Exception {
        ob = new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    //Test Cases when the user eneters even numbers
    @Test
    public void evenTest1(){
        boolean result=ob.isEven(12);
        assertEquals(true,result);
    }
    @Test
    public void evenTest2(){
        boolean result=ob.isEven(16352);
        assertEquals(true,result);
    }
    @Test
    public void evenTest3(){
        boolean result=ob.isEven(19872);
        assertEquals(true,result);
    }

    //Test cases when the user eneters odd numbers
    @Test
    public void oddTest1(){
        boolean result=ob.isEven(1987);
        assertEquals(false,result);
    }
    @Test
    public void oddTest2(){
        boolean result=ob.isEven(19687);
        assertEquals(false,result);
    }
    @Test
    public void oddTest3(){
        boolean result=ob.isEven(17);
        assertEquals(false,result);
    }
}