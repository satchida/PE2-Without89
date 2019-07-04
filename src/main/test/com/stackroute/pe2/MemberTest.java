package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {

    //Instantiating the object of the class

    MemberVariable ob;

    @Before
    public void setUp() throws Exception {
        ob=new MemberVariable();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    //Checking the test cases where the age of the memebers is 18 to 60 in earning group
    @Test
    public void test1() {
        String result = ob.details("Paku",22,2300.6);
        assertEquals("Members Name: Paku\nMembers Age: 22\nMembers Salary: 2300.6", result);
    }
    @Test
    public void test2() {
        String result = ob.details("Alex",45,267300.6);
        assertEquals("Members Name: Alex\nMembers Age: 45\nMembers Salary: 267300.6", result);
    }

    //Checking the test case where the person is too old and getting pension
    @Test
    public void test3() {
        String result = ob.details("William",65,67300.6);
        assertEquals("You are now retired.\nGetting your Pension", result);
    }


    //Test cases where the person is too young to earn
    @Test
    public void test4() {
        String result = ob.details("Willy",15,600.6);
        assertEquals("You are too young to Earn", result);
    }

}