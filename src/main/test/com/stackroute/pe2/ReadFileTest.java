package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ReadFileTest {

    //Class is instantiated and object is created
    ReadFile ob;

    @Before
    public void setUp() throws Exception {
        ob=new ReadFile();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

//Test case for the file stored in same directory
    @Test
    public void readFileFromDirectory() throws IOException {
        String result=ob.readFile("/home/satchida/Desktop/File1");
        assertEquals("ABCDEFGOIAISFDUSIJDXFSYUIXIGISXHSHKXSHKHS\nTHE LENGTH IS 42",result);


    }
}