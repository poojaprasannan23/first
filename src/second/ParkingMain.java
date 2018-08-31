package second;

import java.util.ArrayList;

/**
 * Created by expert on 7/11/18.
 */
public class ParkingMain {
    public static void main(String[] args) {


        Parking p1 = new Parking(2, "101", 2);
        Parking p2 = new Parking(2, "102", 4);
        Parking p3 = new Parking(2, "103", 6);
        Parking p4=new Parking(2,"103",5);
        ArrayList<Parking> parking2 = new ArrayList<>();
        Parking.addVechicle(parking2,p1);
        Parking.addVechicle(parking2,p2);
        Parking.addVechicle(parking2,p3);
        Parking.addVechicle(parking2,p4);
        Parking.display(parking2);
        Parking.removevechicle(parking2,"102");
        Parking.display(parking2);


    }

}
