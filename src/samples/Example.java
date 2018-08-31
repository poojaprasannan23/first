package samples;


//       int a=10;
//       int b=30;
//       a=a+b;
//       b=a-b;
//        a=a-b;
//        System.out.println("after swap a="+a+"\n"+"after swap b="+b);

//        int i=2;
//        int k=i++;//increment operator
//        int z=++i;
//        int y=10;
//        int j=--y;//decrement operator


/**
 * Created by expert on 6/28/18.
 */
public class Example {
    public static void main(String[] args) {

//        System.out.println(k);
//        System.out.println(z);
//        System.out.println(j);
        //relation operators
        int a=30;
        int b=20;
        int c=30;
        if((a!=b)&&(a==c)) {

            System.out.println("both conditions are true");
        }
        else if((a!=b)||(a==c)){
            System.out.println("one of the condition is true");
        }


        else{
            System.out.println("not true");
        }

    }
}
