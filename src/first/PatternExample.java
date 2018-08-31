package first;

/**
 * Created by expert on 6/29/18.
 */
public class PatternExample {
    public void printPattern(int n){
        for(int i=0;i<5;i++){
            for(int j=1;j<=i;j++) {

                System.out.print(j+" ");
            }
            System.out.println(" ");
        }


    }

    public static void main(String[] args) {
        PatternExample p=new PatternExample();
        p.printPattern(5);
    }
}
