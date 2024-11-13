package bufferedreaderexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadData {

    public static void main(String[] args)throws Exception {
        
    
            FileReader file=new FileReader("D:BW.txt");
            BufferedReader br=new BufferedReader(file);
            int i;
            while((i=br.read())!=-1){
                System.out.print((char)i);
            }
            file.close();
            br.close();
            

    }
    
}
