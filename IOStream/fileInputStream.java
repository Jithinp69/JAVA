package IOStream;
// package codeAlongSession;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class fileInputStream {
    public static void main(String[] args) {
        try{
        FileInputStream fi = new FileInputStream(new File("sample.txt"));
        int onebyte ;
        while((onebyte = fi.read()) != -1){
            System.out.print((char) onebyte);
        }
        fi.close();
    }catch(IOException e){
        e.printStackTrace();
    }
    }
}
