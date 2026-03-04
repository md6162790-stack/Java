class P{
    P(){
        System.out.println("constructor");
    }
    P(int a){
        System.out.println("Constructor 2:"+a);
    }
}
class C extends P{
    C(){
        super(12);
        System.out.println("Derived constructor");
    }
}
public class InheritanceConstruters {
    public static void main(String[] args) {
       // C c=new C();
       P p=new P(1);
        
        
    }
}
