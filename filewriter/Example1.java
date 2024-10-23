package filewriter;

import java.io.FileWriter;

public class Example1 {

    public static void main(String[] args) {


        try{
        FileWriter fw=new FileWriter("D:FWDemo.txt");
        fw.write("I am using FileWriter class");
        fw.close();
        System.out.println("code execute sucessfully");
        }
        catch(Exception ex){
            System.out.println("error occured");
            ex.printStackTrace();
        }
    }
    
}
