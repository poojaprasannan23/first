package second;

/**
 * Created by expert on 7/6/18.
 */
public class Sample2 {
    public static void main(String[] args) {
        String s=null;
        try {
            s.length();
            int y=2/0;


        }
        catch(ArithmeticException e){
            System.out.println("exception caught");
        }

        catch(NullPointerException e){
            System.out.println("null pointer exception");
        }
        System.out.println("rest of the code");
    }
}
