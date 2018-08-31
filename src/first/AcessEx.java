package first;

/**
 * Created by expert on 7/5/18.
 */
public class AcessEx {
    public AcessEx(){

    }
    protected int a;
    private int c;
    int b;
    private String name;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    private float salary;
    public void setName(String name){
        this.name=name;

    }
    public String getName(){
        return name;
    }
    private void dispaly(){

    }

    public static void main(String[] args) {
        AcessEx q=new AcessEx();
        q.a=1;
        q.b=2;
        q.dispaly();

    }
}
