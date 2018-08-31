package second;

/**
 * Created by expert on 6/27/18.
 */
public class Department {
    int did;
    String depatname;
    public Department(int d,String name){
        did=d;
        depatname=name;
    }
    public void details(){

        System.out.println("Department id="+did+"deptname="+depatname);
    }

}
