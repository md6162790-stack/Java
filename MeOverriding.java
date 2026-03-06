class Num1{
    public void meth1(){
        System.out.println("Meth 1");
    }
    public void meth2(){
        System.out.println("Meth 2");
    }
}
class Num2 extends Num1{
    @Override
    public void meth2(){
        System.out.println("Meth2 is over writted");
    }
    public void meth3(){
        System.out.println("meth 3");
    }
}
public class MeOverriding {
    public static void main(String[] args) {
        Num1 n1=new Num1();
        n1.meth1();
        n1.meth2();
       // n1.meth3(); //error
        Num2 n2=new Num2();
        n2.meth1();
        n2.meth2();
        n2.meth3();
        
    }
}
