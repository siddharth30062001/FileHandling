package bufferedreaderexample;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Example3 {

    public static void main(String[] args)throws Exception {
        
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        String data="";

        while(!data.equals("stop")){
            System.out.println("enter the data: ");
            String s=br.readLine();
            System.out.println("data: "+s);
        }
        isr.close();
        br.close();
    }
    
}
