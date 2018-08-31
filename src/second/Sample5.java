package second;

/**
 * Created by expert on 7/24/18.
 */
public class Sample5 {
    @Override
protected void finalize() {
        System.out.println("before garbage collection");
    }

    int x;
    public static void main(String args[]){
        //System.gc();
        Sample5 s=new Sample5();
        s=null;
        Sample5 s1=new Sample5();
        s1=null;
        System.gc();
    }


    }
