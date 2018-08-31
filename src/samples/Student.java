package samples;

/**
 * Created by expert on 8/31/18.
 */
public class Student {
    public <T extends Number>void print(T Mark1,T Mark2){
        double result=Mark1.doubleValue()+Mark2.doubleValue();
        System.out.println("sum="+result);
    }

    public static void main(String[] args) {
        Student m=new Student();
        m.print(10,20);
        m.print(10.0f,30.0f);
        m.print(30.00d,40.09f);
    }
}
