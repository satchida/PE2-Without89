package com.stackroute.pe2;

import java.util.Arrays;
import java.util.Collection;

public class Grade {
    public  String studentGrade(int arr[]){//Taking the array and returning the output String
        int l=arr.length;
        if(l>0) {//Checking whether it is an empty array or not
            String output = "";
            int min = minimum(arr, l);//Finding the minimum element
            int max = maximum(arr, l);//Finding the maximum element
            float avg = average(arr, l);//Finding the average of the array


            //Appending the output string
            output = output + "Minimum is ";
            output = output + min;
            output = output + "\n";
            output = output + "Maximum is ";
            output = output + max;
            output = output + "\n";
            output = output + "Average is ";
            output = output + avg;

            return output;
        }else{//Displays if it is an empty array
            return "Empty Array!Nothing to Calculate";
        }
    }

    //Function calculating the minimum element of the array
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

    //Function calculating the maximum element of the array
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

    //Function calculating the average of the array
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
