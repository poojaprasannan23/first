package second;
import java.util.*;

/**
 * Created by expert on 7/2/18.
 */
public class Sample {
    public void dispaly(int x[]){
        System.out.println("Before sorting");
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);}


        for(int i=0;i<=x.length-1;i++){
            for(int j=i+1;j<=x.length-1;j++){
                if(x[i]>x[j]){
                    int temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }

        }
        System.out.println("After sorting");
        for(int i=0;i<=x.length-1;i++){
            System.out.println(x[i]);
        }

    }
    public static void main(String[] args) {
        Sample s=new Sample();
//        int a[]=new int[3];
//        int b[]={1,2,3};
//        int []c=new int[4];
//        c[0]=1;
//        c[1]=2;
//        c[2]=4;
//        c[3]=3;
        int[] d=new int[]{5,30,10,20};
        int x[][]={{1,2,3},{9,10,11}};
          //for()
        int row=x.length;//number of rows
        int col=x[0].length;//number of column

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                for(int k=j+1;k<col;k++){
                    if(x[i][j]>x[i][k]){
                        int temp=x[i][j];
                        x[i][j]=x[i][k];
                        x[i][k]=temp;
                }

                }
               // System.out.println(x[i][j] +" ");
            }
           // System.out.println(" ");
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println(x[i][j] +" ");


            }
            System.out.println(" ");
        }
       // int y[][]=new int[3][3];
       s.dispaly(d);
//        int length=a.length;
//        System.out.println(length);
//        for(int i=0;i<=c.length-1;i++){
//            System.out.println(c[i]+"");
//        }
//        char ch[]={'a','b','c'};
//        String[] str={"one","two","three"};
//        for(int i=0;i<=ch.length-1;i++) {
//            System.out.println(ch[i] + "");
//        }
//            for(int i=0;i<=str.length-1;i++) {
//                System.out.println(str[i] + "");
//
//        }
//        //for each loop
//        for(String obj:str){
//            System.out.println(obj+"");
//        }
        // from console
//        int a[]=new int[5];
//        Scanner s=new Scanner(System.in);
//        for(int i=0;i<=a.length-1;i++) {
//            a[i] = s.nextInt();
//        }
//        for(int i=0;i<=a.length-1;i++)
//        {
//            System.out.println(a[i]+"");
//        }
    }
}
