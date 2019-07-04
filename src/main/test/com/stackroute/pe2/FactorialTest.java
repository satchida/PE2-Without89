package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    Factorial fact;

    @Before
    public void setUp() throws Exception {
        fact=new Factorial();
    }

    @After
    public void tearDown() throws Exception {
        fact=null;
    }

    //Test case will check for up to which the long variable can hold the factorial
    @Test
    public void longfactorial(){
        String result=fact.longFactorial();
        assertEquals("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n",result);
    }

    //Test Case will check upto which the Integer variable can hold the factorial
    @Test
    public void intfactorial(){
        String result=fact.intFactorial();
        assertEquals("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n",result);
    }
}