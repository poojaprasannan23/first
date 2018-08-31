package third;
import java.util.TreeSet;

/**
 * Created by expert on 7/12/18.
 */
public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("ziya");
        set.add("annu");
        set.add("mannu");
        set.add("binnu");
        for (String obj : set) {
            System.out.println(obj);
        }

    }
}
