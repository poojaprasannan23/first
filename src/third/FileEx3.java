package third;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by expert on 7/18/18.
 */
public class FileEx3 {
    public static void main(String[] args)throws IOException {
        FileWriter fout=new FileWriter("second.txt");
        fout.write("hello world");
        fout.close();
        FileReader fin=new FileReader("second.txt");
        //System.out.println((char)fin.read());
        int ch=0;
       /* while((ch=fin.read())!=-1){
            System.out.println((char)ch);
        }*/
        FileWriter fw2=new FileWriter("third.txt");

        while((ch=fin.read())!=-1) {
            fw2.write((char)ch);
        }
        fw2.close();
        FileReader fr2=new FileReader("third.txt");



    }
}
