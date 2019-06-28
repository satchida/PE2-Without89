package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeTest {

    Grade grade;

    @Before
    public void setUp() throws Exception {
        grade = new  Grade();
    }

    @After
    public void tearDown() throws Exception {
        grade=null;
    }

    int[] arr={1,2,3,4};

    @Test
    public void calculate(){
        String result=grade.studentGrade(arr);
        assertEquals("Minimum is 1\nMaximum is 4\nAverage is 2.5",result);
    }
    int[] arr1={15,253,82,926,9253};

    @Test
    public void calculatetest1(){
        String result=grade.studentGrade(arr1);
        assertEquals("Minimum is 15\nMaximum is 9253\nAverage is 2105.8",result);
    }
    int[] arr2={25,25,25,25,25};

    @Test
    public void calculatetest2(){
        String result=grade.studentGrade(arr2);
        assertEquals("Minimum is 25\nMaximum is 25\nAverage is 25.0",result);
    }
}