package second;
import java.util.Scanner;

/**
 * Created by expert on 6/27/18.
 */
public class Employee {
    public int add(int x,int y){
        return x+y;
    }
    public static void main(String[] args) {
        Department d=new Department(1,"CSE");
        d.details();
        Scanner s1=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        System.out.println("read value from console");
        int a=s1.nextInt();
        int b=s2.nextInt();
        Employee e=new Employee();
        System.out.println(e.add(a,b));


    }
}

