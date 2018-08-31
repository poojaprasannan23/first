package third;
import java.io.*;


/**
 * Created by expert on 7/18/18.
 */
public class File {
    public static void main(String[] args) throws IOException {
        FileWriter fout=new FileWriter("second.txt");
        fout.write("hello world");
        fout.close();
        FileReader fin=new FileReader("second.txt");
        //System.out.println((char)fin.read());
        int ch=0;
        while((ch=fin.read())!=-1){
            System.out.println((char)ch);
        }

    }
}
