package second;

/**
 * Created by expert on 7/23/18.
 */
public class ThreadImple implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<5;i++){
       System.out.println("current thread"+Thread.currentThread().getName());
            System.out.println("Thread in execution");
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            }
   }

    public static void main(String[] args) {
        ThreadImple obj=new ThreadImple();
        Thread t=new Thread(obj);
        t.setName("mythread1");
        t.start();
        Thread t1=new Thread(obj);
        t.setName("mythread2");
        t1.start();
        System.out.println("main thread");
    }
}
