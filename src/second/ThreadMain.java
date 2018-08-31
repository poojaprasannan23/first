package second;
class Thread1 extends Thread{
    Sample8 s;
    Thread1(Sample8 s){
        this.s=s;
    }
    @Override
    public void run() {
        s.display(50);
    }
}
class Thread2 extends Thread{
    Sample8 s;
    Thread2(Sample8 s){
        this.s=s;
    }

    @Override
    public void run() {
        s.display(100);
    }
}



public class ThreadMain {
    public static void main(String[] args) {
        Sample8 s = new Sample8();
        Thread1 t = new Thread1(s);
        Thread2 t1 = new Thread2(s);
        t.start();
        t1.start();
        Sample8 s1=new Sample8();
        Thread1 t2=new Thread1(s1);
        Thread2 t3=new Thread2(s1);
        t2.start();
        t3.start();
    }
}
