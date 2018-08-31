package third;
import java.util.regex.Pattern;

/**
 * Created by expert on 7/20/18.
 */
public class RegexEx1 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[\\d]{6}","123456"));
        System.out.println(Pattern.matches("[@&%]","@"));
        System.out.println(Pattern.matches("[1][2][a-zA-Z0-9@#$%]*","12aBc123"));
       //System.out.println(Pattern.matches("[a-z][A-Z][0-5]{10}","aaD12345232"));
        System.out.println(Pattern.matches("[a-z0-9]+[@][a-z]+[.][c][o][m]","pooja1996@gmail.com"));
        System.out.println(Pattern.matches("[+][9][1][[0-9]+]{10}","+919446225761"));

    }
}
