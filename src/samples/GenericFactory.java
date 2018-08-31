package samples;

/**
 * Created by expert on 8/30/18.
 */
public class GenericFactory<T> {

    Class<T> c;
    public GenericFactory(Class<T> c) {
        this.c = c;
    }

    public Class<T> getObjectType() {
        return c;
    }

    public T getObject() throws IllegalAccessException, InstantiationException {
        try {
            return (T) getObjectType().newInstance();
        }
        catch (InstantiationException e) {
            e.printStackTrace();
        }
        catch (IllegalAccessException e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args)throws InstantiationException,IllegalAccessException {
        ProductGeneric p=new GenericFactory<Soap>(Soap.class).getObject();
        System.out.println(p.getName());

        p=new GenericFactory<Oil>(Oil.class).getObject();
        System.out.println(p.getName());

    }
}

