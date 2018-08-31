package second;

import com.sun.xml.internal.bind.v2.util.ByteArrayOutputStreamEx;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by expert on 8/30/18.
 */
public class Bytearraystream {
    public static void main(String[] args)throws IOException {
        String s="helloworld";
        byte[]b =s.getBytes();
        FileOutputStream fout=new FileOutputStream("Bytearraystream.txt");
        ByteArrayOutputStream baos=new ByteArrayOutputStreamEx();
        baos.write(b);
        baos.writeTo(fout);
        FileOutputStream fout1=new FileOutputStream("Bytearray.txt");
        ByteArrayOutputStream baos1=new ByteArrayOutputStreamEx();
        baos1.write(b);
        baos1.writeTo(fout1);

    }
}
