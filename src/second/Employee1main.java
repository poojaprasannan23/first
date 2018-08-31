package second;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by expert on 7/10/18.
 */
public class Employee1main {
    public static void main(String[] args) {
        ArrayList<Employee1>obj=new ArrayList<>();
        Employee1 employee1=new Employee1("pooja",100000,"cse");
        Employee1 employee2=new Employee1("anu",10000,"ece");
        ArrayList<Employee1>al=new ArrayList<>();
        al.add(employee1);
        al.add(employee2);
      for(Employee1 obj6:al){
//            System.out.println(obj6.empname+" "+obj6.salary+" "+obj6.dept+" ");
        }
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            Employee1 obj6=(Employee1)itr.next();
            if(obj6.empname.equals("anu"));{
                al.remove(obj6);
            }
            System.out.println(obj6.dept+" "+obj6.salary+" "+obj6.empname+" ");

        }
    }
}
