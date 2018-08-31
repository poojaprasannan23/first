package second;

/**
 * Created by expert on 7/6/18.
 */
public class InterfaceEx implements SampleInterface {
    final int i=10;
    static final int k;
    static final int z=10;


    static{
        k=10;
    }
    @Override
    public void add(int x, int y) {
        System.out.println( x+y);
    }

    @Override
    public void display() {
        System.out.println("Hello");

    }

    public static void main(String[] args) {
        InterfaceEx obj=new InterfaceEx();
        obj.add(2,3);
        obj.display();

       // obj.i=1;interface final static by default
       // obj.i=11;we cannot do this
    }
}
