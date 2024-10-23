package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {

    public static void main(String[] args) {
        
        try{
            FileWriter fw=new FileWriter("D:BridgeExample.txt");

            fw.write("These is my first File!!! I am learning File Handling");
            fw.close();

            System.out.println("content is written sucessfully!!");
        
        }
        catch(IOException er){
            System.out.println("some error occurs");
            er.printStackTrace();
        }
    }
    
}
