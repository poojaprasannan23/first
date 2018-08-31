package third.collection;

import java.util.LinkedList;

/**
 * Created by expert on 7/12/18.
 */
public class Book {
    public Book(String name, float price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    String name;
    float price;
    String author;

    public static void main(String[] args) {
        Book b1=new Book("abcd",250,"sam");
        Book b2=new Book("efgh",100,"anu");
        LinkedList<Book>linked =new LinkedList();
        linked.add(b1);
        linked.add(b2);


        for(Book obj:linked){
            if(linked.contains(b1)){
                b1.price+=50;
            }
            System.out.println("Name: "+obj.name+"Price :"+obj.price+"Author :"+obj.author);
        }



    }
}
