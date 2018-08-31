package second;
import java.io.IOException;

/**
 * Created by expert on 7/9/18.
 */
public class Sample3 {
    public static void check()throws IOException,ClassNotFoundException{
        throw new IOException();
    }
    public static void callcheck()throws IOException,ClassNotFoundException{
        check();
    }

    public static void main(String[] args) {
        try{
            callcheck();
        }
        catch(Exception e){
            //e.printStackTrace();
            System.out.println("checked exception");
        }
    }
}
