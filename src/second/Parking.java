package second;
import java.util.ArrayList;
/**
 * Created by expert on 7/11/18.
 */
public class Parking {
    int type;
    String slotnum;
    int time;

    public Parking(int type, String slotnum, int time) {
        this.type = type;
        this.slotnum = slotnum;
        this.time = time;
    }
    public static void display(ArrayList<Parking>p){
        for(Parking obj:p){
            System.out.println(obj.slotnum);
        }
    }
    public  static void addVechicle(ArrayList<Parking>p,Parking obj){
        if(p.size()<3){
            p.add(obj);
            //System.out.println(p);
           // display(p);
        }
        else{
            System.out.println("all slots are occupied");
        }
    }
    public static void removevechicle(ArrayList<Parking>parking2,String slotnum ){
        for(Parking obj:parking2){
            if(obj.slotnum==slotnum){
                int amount=obj.time*50;
                System.out.println("Amount to be paid:Rs"+amount);
                        parking2.remove(obj);
                break;
            }
        }
        for(Parking obj:parking2)

        if(obj.slotnum==slotnum){
            parking2.remove(obj);
            System.out.println(" ");
            break;
        }
    }

}
