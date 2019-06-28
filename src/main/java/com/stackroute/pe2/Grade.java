package com.stackroute.pe2;

import java.util.Arrays;
import java.util.Collection;

public class Grade {
    public  String studentGrade(int arr[]){
        int l=arr.length;
        String output="";
        int min=minimum(arr,l);
        int max=maximum(arr,l);
        float avg=average(arr,l);

        output=output+"Minimum is ";
        output=output+min;
        output=output+"\n";
        output=output+"Maximum is ";
        output=output+max;
        output=output+"\n";
        output=output+"Average is ";
        output=output+avg;

        return output;
    }
    public int minimum(int[] array,int length)
    {
        int min=array[0];
        for(int i=1;i<length;i++)
        {
            if(min>array[i])
            {
                min=array[i];
            }
        }
        return min;
    }
    public int maximum(int[] array,int length)
    {
        int max=array[0];
        for(int i=1;i<length;i++)
        {
            if(max<array[i])
            {
                max=array[i];
            }
        }
        return max;
    }
    public float average(int[] array,int length)
    {
        float avg=0;
        int sum=0;
        for(int i=0;i<length;i++)
        {
         sum=sum+array[i];
        }
        avg=(float)(sum)/(float)(length);
        return avg;
    }
}
