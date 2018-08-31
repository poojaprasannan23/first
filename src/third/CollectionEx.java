package third;
import java.util.Deque;
import java.util.Queue;
import java.util.ArrayDeque;

/**
 * Created by expert on 7/19/18.
 */
public class CollectionEx {
    public static void main(String[] args) {
        ArrayDeque<String>obj=new ArrayDeque<String>();
        obj.addFirst("anu");
        obj.addLast("alen");
        obj.add("anju");
        obj.add("amy");
        obj.add("ammu");
        System.out.println(obj);
        System.out.println("head"+obj.peek());//returns the first element
        System.out.println("removed first"+obj.pollFirst());//remove and return
        //first element and returns null if empty
        System.out.println("removed last"+obj.pollLast());//remove and return
        //last element returns null if empty
        System.out.println("after removal"+obj);
        System.out.println(obj.remove());//remove first
        System.out.println(obj.removeFirst());//remove and return
        //first element
        System.out.println(obj.removeLast());//remove and return
        //last element
        System.out.println(obj);


    }
}
