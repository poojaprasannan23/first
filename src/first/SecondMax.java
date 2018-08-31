package first;

import java.util.ArrayList;

/**
 * Created by expert on 8/14/18.
 */
public class SecondMax {
    public static void main(String[] args) {
        int max=0;
        int smax=0;
        int a[]={10,74,30,46,20,36,78,45};
        max=a[0];
        for(int i=0;i<a.length;i++) {
            if (a[i]>max) {
                smax=max;
                max = a[i];

            }

        }
        System.out.println(max);
        System.out.println(smax);


//array division

        int l=a.length/2;
        System.out.println(l);

        ArrayList <Integer> al=new ArrayList();
        System.out.println("First Array");
        for(int i=0;i<(a.length)/2;i++){
            al.add(a[i]);
        }
        for(Integer i1:al){
            System.out.println(i1);
        }



        ArrayList <Integer>al2=new ArrayList<>();
        System.out.println("Second Array");
        for(int i=(a.length)/2;i<a.length;i++){
            al2.add(a[i]);
        }
        for(Integer i2:al2){
            System.out.println(i2);
        }


    }
}
