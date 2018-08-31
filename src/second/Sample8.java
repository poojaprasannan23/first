package second;

/**
 * Created by expert on 7/23/18.
 */
public class Sample8 {
  static synchronized public void display(int x){
      // synchronized (this) {
           for (int i = 0; i < 3; i++)
               System.out.println(i * x);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           //}
               System.out.println("rest of the code" + Thread.currentThread().getName());
       }
    }
}
