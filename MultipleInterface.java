interface Two{
    void raju();
    void ram();
}
interface Three{
    void munna();
    void ashraf();
}
class Four implements Two,Three{
   public void raju(){
        System.out.println("raju");
    }
    public void ram(){
        System.out.println("Ram");
    }
    public void munna(){
        System.out.println("Munna");
    }
    public void ashraf(){
        System.out.println("Ashraf");
    }
}
public class MultipleInterface {
    public static void main(String[] args) {
        Four f=new Four();
        f.raju();
        f.ram();
        f.munna();
        f.ashraf();
        
    }
}
