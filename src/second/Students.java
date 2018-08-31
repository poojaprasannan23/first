package second;

/**
 * Created by expert on 7/3/18.
 */
public class Students {
    int id;
    String name;
    public Students (int id,String name){
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {
        Students s=new Students(1,"pooja");
        Students s1=new Students(2,"anu");
        int[] a={1,2,3};
        String ss[]={"abc","fef"};
        Students sarray[]={s,s1};
        for(Students obj:sarray){
            System.out.println(obj.id+" "+obj.name+" ");
        }
    }
}
