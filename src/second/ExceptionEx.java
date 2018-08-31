package second;

/**
 * Created by expert on 7/9/18.
 */
public class ExceptionEx {
//    public static void add (int x,int y){
//        int z=x+y;
//        if(z>50){
//            throw new ArithmeticException("not valid");
//        }
//    }
    public static void first(){
        second();

    }
    public static void second(){
        third();

    }
    public static void third(){
        throw new ArithmeticException("exception");
    }

    public static void main(String[] args) {
        try{
            first();
            //add(40,30);
        }
        catch(Exception e){
            System.out.println("exception caught");

        }
    }
}
