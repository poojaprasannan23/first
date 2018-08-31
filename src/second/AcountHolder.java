package second;

/**
 * Created by expert on 7/10/18.
 */
public class AcountHolder extends Bank {
    int accno;
    String name;
    float amount;

    public AcountHolder(String name, int ifsc, String branchname, int accno, String name1, float amount) {
        super(name, ifsc, branchname);
        this.accno = accno;
        this.name = name1;
        this.amount = amount;
    }
    public static void display(AcountHolder[] accarray){
        for(AcountHolder obj:accarray){
            System.out.println("Bankname:"+obj.name+"IFSC:"+obj.ifsc+"Branch:"+obj.branchname+"AcountHolder:"+obj.name+"accno:"+obj.accno+"Amount:"+obj.amount);
        }
    }
    public static void display(int accno,AcountHolder[]accarray){
        for(AcountHolder obj:accarray){
            if(obj.accno==accno){
                System.out.println("Accno:"+obj.accno+"Name:"+obj.name+"Amount:"+obj.amount);
            }
        }
    }

    public static void deposit(int accno, float amount, AcountHolder[] accarray) {
        for (AcountHolder obj : accarray) {
            if (obj.accno == accno) {
                obj.amount += amount;
                System.out.println("Accno:" + obj.accno + " Blance:" + obj.amount);
            }

        }
    }

    public static void retrieve(int accno, int amount, AcountHolder[] accarray) {
        for (AcountHolder obj : accarray) {
            if (obj.accno == accno) {
                obj.amount -= amount;
                System.out.println("Accno:" + obj.accno + "Balance:" + obj.amount);
            }
        }
    }

    public static void main(String[] args) {
        AcountHolder a = new AcountHolder("SBI", 111, "tpb", 1000, "anu", 5000f);
        AcountHolder a1 = new AcountHolder("SYN", 222, "kannur", 2000, "minnu", 70000);
        AcountHolder a2 = new AcountHolder("PNB", 333, "goa", 3000, "pinky", 8000);
        AcountHolder accarray[] = {a, a1, a2};
        display(accarray);
        display(2000, accarray);
        deposit(1000,700,accarray);
        retrieve(2000, 200, accarray);
    }
}