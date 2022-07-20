package com.company.zclassdemo;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BasicJavaCodingStandard{


    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Desktop\\publish_events\\evening2.txt");

        FileReader fileReader = new FileReader(file);
        int i;
        while ((i = fileReader.read())!=-1){
            System.out.print((char) i);
        }
        

    }
}
