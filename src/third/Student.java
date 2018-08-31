package third;
import org.jetbrains.annotations.NotNull;

import java.util.TreeSet;


/**
 * Created by expert on 7/12/18.
 */
public class Student implements Comparable<Student> {


    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    int rollno;
    String name;
    int age;

    public static void main(String[] args) {

        TreeSet<Student> obj = new TreeSet<Student>();
        obj.add(new Student(1, "pooja", 21));
        obj.add(new Student(2, "shibi", 22));
        obj.add(new Student(3, "jasu", 20));
        for (Student o : obj) {
            System.out.println(o.rollno);


        }

    }

    @Override
    public int compareTo(@NotNull Student o) {
       if (rollno>o.rollno)
       {
           return 1 ;
       }
        else if(rollno<o.rollno)
       {
           return -1;
       }
       else {
           return 0;
       }
    }
}


