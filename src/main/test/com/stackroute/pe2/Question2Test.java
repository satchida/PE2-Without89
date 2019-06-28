package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Question2Test {

    Question2 ob;

    @Before
    public void setUp() throws Exception {
        ob=new Question2();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }
    @Test
    public void powertest1() {
        String result = ob.checkPower(16);
        assertEquals("Yes", result);
    }
    @Test
    public void powertest2() {
        String result = ob.checkPower(1);
        assertEquals("Yes", result);
    }
    @Test
    public void powertest3() {
        String result = ob.checkPower(256);
        assertEquals("Yes", result);
    }
    @Test
    public void notPowertest1() {
        String result = ob.checkPower(19);
        assertEquals("No", result);
    }
    @Test
    public void notPowertest2() {
        String result = ob.checkPower(645);
        assertEquals("No", result);
    }
    @Test
    public void notPowertest3() {
        String result = ob.checkPower(27635);
        assertEquals("No", result);
    }
}