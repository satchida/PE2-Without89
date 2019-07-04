package com.stackroute.pe2;

import java.math.BigDecimal;

public class Factorial {
    public String longFactorial(){//When the factorials to be stored in long datatype

        String output="";//Initialising the output string
        BigDecimal big=new BigDecimal(1);//Instantiating the BigDecimal Class
        System.out.println("List of Factorial under long value is");
        for (int i=1; ;i++)//Infinite loop started run untill the long variable can store
        {
            //Checking whether it lies or not between the long margin or not
            if(big.compareTo(new BigDecimal(Long.MAX_VALUE)) < 0 &&  (big.multiply(new BigDecimal(i+1))).compareTo(new BigDecimal(Long.MAX_VALUE))<0)
            {
                big=big.multiply(new BigDecimal(i));
                System.out.println(i);
                output=output+i;
                output=output+"\n";

            }
            else{//When it will exceed it will break
                break;
            }
        }
        return  output;

    }
    public String intFactorial(){//When the factorials to be stored in Integer variables

        String output="";//Initialising the output string
        BigDecimal big=new BigDecimal(1);//Instantiatin the BigDecimal class
        System.out.println("List of Factorial under int value is");
        for (int i=1; ;i++)
        {
            //Checking whether the Integer variable can store the factorial or not
            if(big.compareTo(new BigDecimal(Integer.MAX_VALUE)) < 0 &&  (big.multiply(new BigDecimal(i+1))).compareTo(new BigDecimal(Integer.MAX_VALUE))<0)
            {
                big=big.multiply(new BigDecimal(i));
                System.out.println(i);
                output=output+i;
                output=output+"\n";

            }
            else{//It wil break when the integer variable can not store the factorial
                break;
            }
        }
        return  output;

    }
}
