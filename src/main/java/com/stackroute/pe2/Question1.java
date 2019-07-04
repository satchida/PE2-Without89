package com.stackroute.pe2;

public class Question1 {
    public String reversePallindrome(String string){

        String reverse="";//Output string or reversed string initialized


        //In a loop character by character from the end of the enetered string is appended to reverse strin
        for(int i=string.length()-1;i>=0;i--)
        {
            reverse=reverse+string.charAt(i);//Appending character by character
        }

        //Checking whether the reversed string is equal or not
        if(string.equals(reverse))
        {
            reverse=reverse+" Pallindrome";
        }
        //If not efual with reversed string then it is not pallindrome
        else
        {
            reverse=reverse+" Not Pallindrome";
        }
        return reverse;
    }
}
