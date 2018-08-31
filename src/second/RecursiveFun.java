package second;

/**
 * Created by expert on 7/26/18.
 */
public class RecursiveFun {
    public static int getFibonacci(int n){
        if(n==1) {
            return 1;
        }
        if(n==2){
            return 1;
        }
        return getFibonacci(n-1)+getFibonacci(n-2);


    }
    public static void main(String[] args) {

        System.out.println(getFibonacci(5));

    }
}
