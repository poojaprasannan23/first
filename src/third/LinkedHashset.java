package third;

import java.util.LinkedHashSet;

/**
 * Created by expert on 7/12/18.
 */
public class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<String> set=new LinkedHashSet();
                set.add("anu");
        set.add("manu");
        set.add("rony");
                for(String obj:set){
                    System.out.println(obj);
                }
    }
}
