package second;
import static java.lang.Math.*;
import java.util.*;
/**
 * Created by expert on 7/26/18.
 */
public class MathEx {
    public static void main(String[] args) {
        System.out.println(abs(-10));
        System.out.println(acos(-1));
        System.out.println(asin(1));
        System.out.println(max(12,10));

        System.out.println(Math.abs(10));
        System.out.println(pow(2,3));
        Random random=new Random();
        int i=random.nextInt(20);
        System.out.println(i);
    }
}
