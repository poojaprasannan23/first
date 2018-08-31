package first;

/**
 * Created by expert on 6/27/18.
 */
public class Student {

int rollno;
String name;
Student(int a,String b){

    rollno=a;
    name=b;
}
void display()
{
    System.out.println(rollno+" "+name);
}



public static void main(String args[]){
    Student s=new Student(10,"Pooja");
    s.display();
}



}
