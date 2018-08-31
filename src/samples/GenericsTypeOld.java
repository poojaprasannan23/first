package samples;

/**
 * Created by expert on 8/31/18.
 */
public class GenericsTypeOld  <T>{
    private T t;
    public T get(){ return t;}
    public void set(T t){this.t=t;}

    public static void main(String[] args) {
        GenericsTypeOld<String>type=new GenericsTypeOld<>();
        type.set("Ann");
        String str=type.get();
    }
}
