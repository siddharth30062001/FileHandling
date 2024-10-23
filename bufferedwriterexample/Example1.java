package bufferedwriterexample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Example1 {

    public static void main(String[] args) {
        
        try{
        FileWriter fw=new FileWriter("D:BW.txt");
        BufferedWriter bw=new BufferedWriter(fw);

        bw.write("I am using BufferedWriter Class to improve the performance");
        bw.close();
        System.out.println("content written sucessfully");
    }
    catch(IOException ex){

        System.out.println("Some error occured");
        ex.printStackTrace();
    }
    
}
}
