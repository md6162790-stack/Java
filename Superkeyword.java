class Animal{
    public void animalSound(){
        System.out.println("Animals makes sounds but not talks");
    }
    Animal(int a){
        System.out.println("animals"+a);
    }
}
class Birds extends Animal{
    public void birds(){
        
        super.animalSound();
        System.out.println("Birds can fly");
    }
    Birds(int b){
        super(1);
        System.out.println("birds will eat seeds"+b);
    }
}
public class Superkeyword {
    public static void main(String[] args) {
     //   Animal a=new Animal();
     //   a.animalSound();
       Birds b=new Birds(1);
       b.birds();
        
    }
}
