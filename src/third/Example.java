package third;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by expert on 7/12/18.
 */
public class Example {
    public static void main(String[] args){
        LinkedList<String> linked=new LinkedList<>();
        linked.add("sam");
        linked.add("ram");
        linked.addFirst("anu");
        linked.addLast("seenu");
        linked.add(null);
        linked.removeLast();
        linked.remove(2);
        linked.removeFirst();
        linked.remove("sam");
        for(String obj:linked){
            System.out.println(obj);
        }
    }
}
