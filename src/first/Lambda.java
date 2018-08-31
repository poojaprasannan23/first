package first;

/**
 * Created by expert on 8/29/18.
 */
interface Drawable{
    public void draw(String name,int z);
}
public class Lambda {
    public static void main(String[] args) {
        int width=10;
        //with lambda
        Drawable d2=(x,y)->{
            System.out.println("Drawing "+width+ "name "+x+" y="+y);
        };
        d2.draw("square",2);
    }
}
