package third;
import java.io.*;

/**
 * Created by expert on 7/18/18.
 */
public class FileE {
    public static void main(String[] args)throws IOException {
        System.out.println("input a line");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String line=reader.readLine();
        //reader
        System.out.println(line);

    }
}
