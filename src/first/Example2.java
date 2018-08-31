package first;
import java.util.*;

/**
 * Created by expert on 6/28/18.
 */
public class Example2 {
    public void check(int year)
    {
        if(year%4==0)
            System.out.println("it is a leap year");

        else
            System.out.println("not a leap year");

    }
   public static void main(String[] args) {
        int a=10,b=10,c=3;
        //nested if
       if (a==b){
           if (c<a){
               System.out.println("nested if");
           }
           else{
               System.out.println("nested else");
           }
//           else if{
//               System.out.println("else case");
//           }
       }
       {
           Example2 e=new Example2();
           Scanner s=new Scanner(System.in);
           System.out.println("enter the year");
           int a1=s.nextInt();
           e.check(a1);

       }
   }
}
