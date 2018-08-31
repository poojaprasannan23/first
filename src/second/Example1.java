package second;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * Created by expert on 7/10/18.
 */
public class Example1 {
    public static void main(String[] args) {
        //generic declaration
        ArrayList<String>al=new ArrayList();
        ArrayList<Integer>al1=new ArrayList<>();
//        List<String>al1=new ArrayList<>();
//        ArrayList<String>al2=new ArrayList<String>();
        al.add("anu");
        al.add("anju");
        al.add("abi");
        al.add("null");
        for(String obj:al) {
            System.out.println(obj);
            al1.add(12);
            al1.add(13);
            al1.add(14);
        }
            for(Integer obj1:al1){
                System.out.println(obj1);
            }
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        ArrayList<String>al2=new ArrayList<>();
        al2.add("apple");
        al2.add("orange");
        al2.add("mango");
        al.addAll(1,al2);
        al.remove("anu");
        al.remove(3);
        for(String obj:al){
            System.out.println(obj);
        }

        }
    }

