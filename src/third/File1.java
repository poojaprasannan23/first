package third;
import java.io.*;
import java.util.*;




/**
 * Created by expert on 7/19/18.
 */
public class File1 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("second.txt"));
        ArrayList<String> al =new ArrayList<String>();
        String line = br.readLine();
        String a[] = line.split(" ");
        for (String obj : a) {
            al.add(obj);
        }
      for(String obj1:al) {
          System.out.println(obj1);
      }
        }
    }


