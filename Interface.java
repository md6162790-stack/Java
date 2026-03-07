interface Myinterface{
    void ravi();
    void ramu();
}
class One implements Myinterface{
    
    public void ravi(){
        System.out.println("Ravi");      
    }
    public void ramu(){
        System.out.println("Ramu");
    }
}
public class Interface {
    public static void main(String[] args) {
        One o=new One();
        o.ravi();
        o.ramu();
        
    }
}
