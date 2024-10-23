package com;

import java.io.File;

public class FileInfo {

    public static void main(String[] args) {
        
        File fo=new File("D:BridgeExample.txt");

        if(fo.exists()){
            System.out.println("File name: "+fo.getName());

            System.out.println("File path: "+fo.getAbsolutePath());

            System.out.println("Can we read file: "+fo.canRead());

            System.out.println("Can we Write File: "+fo.canWrite());

            System.out.println("The size of file in bytes: "+fo.length());

        }
        else{
            System.out.println("File not Found");
        }
    }
    
}
