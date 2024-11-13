package com;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {
        
        File f=new File("D:BridgeExample.txt");
        if(f.delete()){
            System.out.println(f.getName()+" file deleted sucessfully");
        }
        else{
            System.out.println("File not Deleted");
        }
    }
    
}
