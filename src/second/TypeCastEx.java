package second;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by expert on 7/9/18.
 */
public class TypeCastEx {
    public static void main(String[] args) {
        byte b=10;
        int x=b;//upcasting or implicit type casting
        int z=10;
        float f=z;
        float f1=30.5f;
        int y=(int)f1;//explict type casting or down casting
        System.out.println(y);
        System.out.println(f);
        System.out.println(x);
        boolean b1=true;
        Integer i=Integer.valueOf(x);//auto boxing
        Integer i1=new  Integer(x);//autoboxing
        int u=i;//unboxing
        Boolean  obj=Boolean.valueOf(b1);
//        Float fx;
//        Double d;
//        Byte bb;
//        Long l1;
        String s="123";
        Integer intv=Integer.parseInt(s);
        System.out.println(intv);
        Float ff=Float.parseFloat(s);
        System.out.println(ff);
        String d="true";
        System.out.println(Boolean.parseBoolean(d));
    }
}
