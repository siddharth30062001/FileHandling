package bufferedreaderexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Example1 {

    public static void main(String[] args)throws Exception {
        
    
            FileReader f=new FileReader("D:BW.txt");
            BufferedReader br=new BufferedReader(f);
            int i;
            while((i=br.read())!=-1){
                System.out.print((char)i);
            }
            f.close();
            br.close();
            

    }
    
}
