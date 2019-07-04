package com.stackroute.pe2;

//Check a number is power of 4 or not
public class Question2 {

    //This method takes the input as a integer type number and returns the string whether it is yes or no
    public String checkPower(int number){

        int power=1;//Initializing the power as 1


        //Checkink the loop until the number is greater than the power
        while(number>power)
        {
            power=power*4;
        }

        //Checking whether the number is a power or not
        if(number==power)
        {
            return "Yes";
        }else{
            return "No";
        }
    }

}
