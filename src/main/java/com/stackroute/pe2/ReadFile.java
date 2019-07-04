
package com.stackroute.pe2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {

    //The function reads the file path as a string type variable and returns contents in upper case along with its length
    public String readFile(String filePath) throws IOException {

        //File reader class is instantiated
        FileReader fr=new FileReader(filePath);
        int i;//index fir reading the file

        String out="";//Output string initialised

        //Reading the file character by character
        while((i=fr.read())!=-1)
            out=out+((char)i);

        //Closing the file
        fr.close();

        //Finding the lenth of the file
        int length=out.length();

        //Appending the output string and returning
        out=out+"The length is "+length;
        System.out.println(out.toUpperCase());
        return out.toUpperCase();
    }



}