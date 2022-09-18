package IOStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        FileOutputStream fo = new FileOutputStream("sample.txt", true);
        String text = "Hello World!  This";
        byte[] b = text.getBytes();    
        fo.write(b);
        fo.close();
    }
}
