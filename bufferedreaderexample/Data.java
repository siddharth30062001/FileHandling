package bufferedreaderexample;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Data {

    public static void main(String[] args)throws Exception {
        
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);

        String data = "";

        while(!data.equals("stop")){
            System.out.println("enter the data: ");
            String s= bufferedReader.readLine();
            System.out.println("data: "+s);
        }

        inputStreamReader.close();
        bufferedReader.close();
    }
    
}
