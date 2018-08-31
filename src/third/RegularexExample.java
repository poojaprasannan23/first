package third;
import java.util.regex.Pattern;

/**
 * Created by expert on 7/19/18.
 */
public class RegularexExample {
    public static void main(String[] args) {
        boolean b = Pattern.matches("..b", "abb");
        System.out.println(Pattern.matches("[abc]","a"));
        System.out.println(Pattern.matches("^abc","z"));//not a,b,c
        System.out.println(Pattern.matches("a-zA-Z","A"));
        System.out.println(Pattern.matches("[a-z]","a"));
        System.out.println(Pattern.matches("[a-d[m-p]]","e"));
        System.out.println(b);

    }
}
