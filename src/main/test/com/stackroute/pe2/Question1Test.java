package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.*;

public class Question1Test {

    //Class object is instantiated
    Question1 ob;
    @Before
    public void setUp() throws Exception {
        ob=new Question1();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    //Test Cases for not pallindrome string entered by user
    @Test
    public void notPallindrometest1() {
       String result = ob.reversePallindrome("Satchida");
       assertEquals("adihctaS Not Pallindrome", result);
        }
    @Test
    public void notPallindrometest2() {
        String result = ob.reversePallindrome("sabya");
        assertEquals("aybas Not Pallindrome", result);
    }
    @Test
    public void notPallindrometest3(){
            String result=ob.reversePallindrome("biku");
            assertEquals("ukib Not Pallindrome",result);
        }


    //Test cases for pallindrome Strings
    @Test
    public void pallindrometest1() {
        String result = ob.reversePallindrome("madam");
        assertEquals("madam Pallindrome", result);
    }

    @Test
    public void pallindrometest2(){
         String result=ob.reversePallindrome("ma1#1am");
        assertEquals("ma1#1am Pallindrome",result);
    }

    }