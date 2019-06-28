package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {

    MemberVariable ob;

    @Before
    public void setUp() throws Exception {
        ob=new MemberVariable();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }
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
    @Test
    public void test3() {
        String result = ob.details("William",65,67300.6);
        assertEquals("You are now retired.\nGetting your Pension", result);
    }
    @Test
    public void test4() {
        String result = ob.details("Willy",15,600.6);
        assertEquals("You are too young to Earn", result);
    }

}