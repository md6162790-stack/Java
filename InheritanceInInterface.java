interface Has{
    void ha();
    void have();
}
interface Have extends Has{
    void it();
    void as();
}
class They implements Has,Have{
    public void ha(){
        System.out.println("Has");
    }
    public void have(){
        System.out.println("Have");
    }
    public void it(){
        System.out.println("It");
    }
    public void as(){
        System.out.println("As");
    }
}
public class InheritanceInInterface {
    public static void main(String[] args) {
        They t=new They();
        t.ha();
        t.have();
        t.it();
        t.as();
        
    }
}
