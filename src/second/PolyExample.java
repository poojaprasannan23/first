package second;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by expert on 7/3/18.
 */
public class PolyExample {
    //method overloading-compile time polymorphism
    public void display(){
        System.out.println("display function");

    }
    public void display(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        PolyExample e=new PolyExample();
        e.display();
        e.display("Hello World");
    }




}
