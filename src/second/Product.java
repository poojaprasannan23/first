package second;

/**
 * Created by expert on 7/3/18.
 */
public class Product {
    int id;
    String name;
    int price;
    public Product(int id,String name,int price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    public static void main(String[] args) {
        Product p=new Product(1,"pen",1250);
        Product p1=new Product(2,"pencile",999);
        Product p2=new Product(3,"book",1350);
        Product parray[]={p,p1,p2};
        for(Product obj:parray){
            if(obj.price>1000) {
                System.out.println(obj.id + " " + obj.name + " " + obj.price + " ");
            }
        }

    }

}
