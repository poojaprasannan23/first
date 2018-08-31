package second;

/**
 * Created by expert on 7/3/18.
 */
public class B extends A {
    int d=1;
    int e=2;

    B(){
        super();//default constructor-invoke parent class constructor
        System.out.println("Child class constructor");
    }
    //method overriding
    public void display(){
        System.out.println("Hello");
        super.display();//to refer parent class
       // super.a();
    }
    public int add(int x,int y){
        System.out.println("in child"+x+y);
        return x+y;
    }
    public static void main(String[] args) {
        B obj=new B();
        System.out.println("Properties of parent class"+"  "+ obj.a+" "+obj.b+" ");
        System.out.println("Properties of child class"+"   "+obj.d+" "+obj.e+" ");
        obj.display();
    }
}
