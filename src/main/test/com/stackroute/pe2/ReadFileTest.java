package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ReadFileTest {
    ReadFile ob;

    @Before
    public void setUp() throws Exception {
        ob=new ReadFile();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void readFileFromDirectory() throws IOException {
        String result=ob.readFile("/home/satchida/Desktop/File1");
        assertEquals("ABCDEFG\nTHE LENGTH IS 8",result);


    }
}