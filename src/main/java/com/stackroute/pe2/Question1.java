package com.stackroute.pe2;

public class Question1 {
    public String reversePallindrome(String string){

        String reverse="";

        for(int i=string.length()-1;i>=0;i--)
        {
            reverse=reverse+string.charAt(i);
        }
        if(string.equals(reverse))
        {
            reverse=reverse+" Pallindrome";
        }
        else
        {
            reverse=reverse+" Not Pallindrome";
        }
        return reverse;
    }
}
