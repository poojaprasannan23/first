package first;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by expert on 8/13/18.
 */
public class MArrayListFile {
    public static void main(String[] args) throws IOException {
        ArrayList<ArrayListFile> li=new ArrayList<>();
        BufferedReader br=new BufferedReader(new FileReader("a.txt"));
        String str;
        while((str=br.readLine())!=null){
            String x[]=str.split(",");
            li.add(new ArrayListFile(Integer.parseInt(x[0]),x[1],Integer.parseInt(x[2])));

        }
        for(ArrayListFile al:li){
            System.out.println("Id: "+al.id+" Name: "+al.name+" Marks: "+al.marks);

        }

    }
}
