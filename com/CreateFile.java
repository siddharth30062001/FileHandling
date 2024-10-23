package com;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args){
        
        try{
            File fo=new File("D:BridgeExample.txt");

            if(fo.createNewFile()){
                System.out.println(fo.getName()+" new file created");
            }
            else{
                System.out.println("File is not created due to some error");
            }
        }
        catch(IOException er){
            System.out.println("some error occurs");
            er.printStackTrace();
        }
    }
    
}