package bufferedwriterexample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingData {

    public static void main(String[] args) {
        
        try{

        FileWriter fileWriter=new FileWriter("D:BW.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

        bufferedWriter.write("I am using BufferedWriter Class to improve the performance");
        bufferedWriter.close();
        System.out.println("content written sucessfully");
    }
    catch(IOException ex){

        System.out.println("Some error occured");
        ex.printStackTrace();
    }
    
}
}
