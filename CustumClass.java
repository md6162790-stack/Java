class Custum{
    public int id;
    protected String name;
    public void run(){
        System.out.println(id);
        System.out.println(name);
    }
    public String names(){
        return name;
    }
    public int ids(){
        return id;
    }
}
public class CustumClass {
    public static void main(String[] args) {
        Custum c=new Custum();
        Tom t=new Tom();
        c.id=10;
        c.name="Ashraf";
        t.id=12;
        t.name="Munna";
        System.out.println(c.id);
        System.out.println(c.name);
        System.out.println(t.id);
        System.out.println(t.name);
        c.run();
        String name=c.names();
        System.out.println(name);
        int id=c.ids();
        System.out.println(id);
      //  t.run();



        
    }
}
