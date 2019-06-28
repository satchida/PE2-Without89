package com.stackroute.pe2;

import java.math.BigDecimal;

public class Factorial {
    public String longFactorial(){

        String output="";
        BigDecimal big=new BigDecimal(1);
        System.out.println("List of Factorial under long value is");
        for (int i=1; ;i++)
        {
            if(big.compareTo(new BigDecimal(Long.MAX_VALUE)) < 0 &&  (big.multiply(new BigDecimal(i+1))).compareTo(new BigDecimal(Long.MAX_VALUE))<0)
            {
                big=big.multiply(new BigDecimal(i));
                System.out.println(i);
                output=output+i;
                output=output+"\n";

            }
            else{
                break;
            }
        }
        return  output;

    }
    public String intFactorial(){

        String output="";
        BigDecimal big=new BigDecimal(1);
        System.out.println("List of Factorial under int value is");
        for (int i=1; ;i++)
        {
            if(big.compareTo(new BigDecimal(Integer.MAX_VALUE)) < 0 &&  (big.multiply(new BigDecimal(i+1))).compareTo(new BigDecimal(Integer.MAX_VALUE))<0)
            {
                big=big.multiply(new BigDecimal(i));
                System.out.println(i);
                output=output+i;
                output=output+"\n";

            }
            else{
                break;
            }
        }
        return  output;

    }
}
