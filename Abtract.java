abstract class Cham{
    public Cham(){
        System.out.println("as");
    }
    public void say(){
        System.out.println("Bye");
    }
    abstract public void greet();
}
class Mahc extends Cham{
    public void greet(){
        System.out.println("nana");
    }
}
class Psss extends Cham{
    public void greet(){
        System.out.println("ll");
    }
}
public class Abtract {
    public static void main(String[] args) {
         Psss p=new Psss();
        p.greet();
        p.say();
    }
}
