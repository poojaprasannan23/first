package third;
import java.util.HashSet;

/**
 * Created by expert on 7/12/18.
 */
public class Example1 {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("sam");
        set.add("roy");
        set.add("ram");
        set.add("roy");
        set.add(null);

        for(String obj:set){
            System.out.println(obj);
        }
    }
}
