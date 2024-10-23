package filereader;

import java.io.FileReader;

public class Example1 {

    public static void main(String[] args)throws Exception {
        
        FileReader fr=new FileReader("D:FWDemo.txt");
        int i;
        while((i=fr.read())!=-1){
            System.out.print((char)i);
        }
        fr.close();
    }
    
}
