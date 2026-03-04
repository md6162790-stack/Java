class Parent{
    public int x;
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
    public void myOne(){
        System.out.println("My one");
    }
}
class Child extends Parent{
    public int y;
    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Parent p=new Parent();
      //  p.setX(12);
      //  System.out.println(p.getX());
      //  p.myOne();
     // p.setY(3); // not executed
     // System.out.println(p.getY()); //not executed
      Child c=new Child();
      c.setX(16);
      System.out.println(c.getX());
      c.setY(14);
      System.out.println(c.getY());


        
    }
}
