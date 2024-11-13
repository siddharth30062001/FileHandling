package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args){

        try{
        File fo=new File("D:BridgeExample.txt");
        Scanner sc=new Scanner(fo);
        while (sc.hasNextLine()) {

            String data=sc.nextLine();
            System.out.println(data);
            
          }
        sc.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("some error occured!!");
            ex.printStackTrace();
        }
    }
    
}
