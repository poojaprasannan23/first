package second;

/**
 * Created by expert on 7/4/18.
 */
public class Faculty  extends Depart{
    int facid;
    String name;

    public Faculty(int deptid, String depatname, int facid, String name) {
        super(deptid, depatname);
        this.facid = facid;
        this.name = name;
    }
    public void printDetails(){
        System.out.println("Dept id="+super.Deptid+" "+super.Depatname+" "+facid+" "+name);
    }

    public static void main(String[] args) {
        Faculty f=new Faculty(101,"CSE",1,"rose");
        f.printDetails();
    }
}
