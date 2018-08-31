package second;

/**
 * Created by expert on 7/3/18.
 */
public class A {
    int a=10;
    int b=20;
    A(){
        System.out.println("Parent class constructor");

    }
    public void display(){
        System.out.println("Hello World");
    }
    public int add(int x,int y){
        System.out.println("in parent"+x+y);
        return x+y;
    }
}
