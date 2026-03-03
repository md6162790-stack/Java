class GetSet{
    public int id;
    public String name;
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String names){
        this.name=names;
    }
    public String getName(){
        return name;
    }public double area(){
        return 3.14*id*id;
    }
}
public class SettersGetters {
    void run(){
        System.out.println("running...");
    }
    void move(){
        System.out.println("Moving");
    }
    public static void main(String[] args) {
        SettersGetters sg=new SettersGetters();
        sg.run();
        sg.move();
    GetSet gt=new GetSet();
    gt.setId(12);
    System.out.println(gt.getId());
    gt.setName("Munna");
    System.out.println(gt.getName());
    System.out.println(gt.area());
        
    }
   
}
