package second;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;


/**
 * Created by expert on 7/9/18.
 */
public class Sample4 {
    public static void main(String args[]){
        String x="hello";
        char[]ch=x.toCharArray();
        for(char o:ch){
            System.out.println(o);
        }
        String s="hii,hello,how, r, u";
        String[]a=s.split(",");
//        for(String obj:a){
//            System.out.println(obj);
            Object[]objects={1,"hai",10.0f};
//            for(Object objj:objects){
//                System.out.println(objj);
        int[]a1={9,4,5,1};
        Arrays.sort(a1);
        System.out.println("elements is at"+Arrays.binarySearch(a1,4));
        for(int x1:a1){
            System.out.println(x1);

            }
            StringTokenizer s1= new StringTokenizer(s,",");
        while(s1.hasMoreTokens()){
            System.out.println(s1.nextToken());
        }

        }
    }


