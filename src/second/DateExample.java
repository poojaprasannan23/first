package second;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.*;


/**
 * Created by expert on 7/24/18.
 */
public class DateExample {
    @Override
    protected void finalize() {
        System.out.println("before garbage collection");

    }

    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyy/MM/dd");
        System.out.println(format.format(date));
        LocalDate date1=LocalDate.now();
        System.out.println(date1);
        LocalTime time=LocalTime.now();
        System.out.println(time);
        GregorianCalendar cal=new GregorianCalendar();
        int year=cal.get(GregorianCalendar.YEAR);
        System.out.println(year);
        cal.getTime();
    }
}
