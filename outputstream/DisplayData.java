package outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class DisplayData {

    public static void main(String[] args) {
        
        try{
        OutputStream os=new FileOutputStream("OSDemo.txt");
        Writer fos=new OutputStreamWriter(os);
        fos.write("Hello World!!");
        fos.close();
        }
        catch(Exception ex){
            ex.getMessage();
        }
    }
    
}
