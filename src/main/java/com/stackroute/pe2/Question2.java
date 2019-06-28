package com.stackroute.pe2;

//Check a number is power of 4 or not
public class Question2 {
    public String checkPower(int number){

        int power=1;

        while(number>power)
        {
            power=power*4;
        }
        if(number==power)
        {
            return "Yes";
        }else{
            return "No";
        }
    }

}
