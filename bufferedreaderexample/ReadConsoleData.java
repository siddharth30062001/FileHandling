package bufferedreaderexample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Reading data from console by InputStreamReader and BufferedReader

public class ReadConsoleData {
    public static void main(String[] args)throws Exception {
        
        InputStreamReader isr=new InputStreamReader(System.in);

        BufferedReader br=new BufferedReader(isr);

        System.out.println("Enter your name: ");
        String name=br.readLine();

        System.out.println("Welcome "+name);
    }
    
}
