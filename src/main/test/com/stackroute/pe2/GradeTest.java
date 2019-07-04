package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeTest {
    //The class is instantiated
    Grade grade;

    @Before
    public void setUp() throws Exception {
        grade = new  Grade();
    }

    @After
    public void tearDown() throws Exception {
        grade=null;
    }

    //Test cases for arrays with different elements
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

    //Test cases for array containing all similar elements
    int[] arr2={25,25,25,25,25};

    @Test
    public void calculateEqualNumbers(){
        String result=grade.studentGrade(arr2);
        assertEquals("Minimum is 25\nMaximum is 25\nAverage is 25.0",result);
    }
    int[] arr3={ };


    //Test case for Empty array
    @Test
    public void calculateEmptyArray(){
        String result=grade.studentGrade(arr3);
        assertEquals("Empty Array!Nothing to Calculate",result);
    }
}
