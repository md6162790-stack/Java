class Const{
    public int id;
    protected String name;
    int num;
    public Const(){
        id=1;
        name="Ashraf";
        num=2;
}
public Const(String name,int id){
    this.id=id;
    this.name=name;
    this.num=10;
}
public Const(int num){
    this.id=2;
    this.name="Ashraf";
    this.num=num;
}
public void setId(int id){
    this.id=id;
}
public int getId(){
    return id;
}
public void setNum(int num){
    this.num=num;
}
public int getNum(){
    return num;
}
public void setName(String name){
    this.name=name;
}
public String getName(){
    return name;
}
}
public class Constructer {
    public static void main(String[] args) {
        Const c=new Const(15);
        System.out.println(c.getId());
        System.out.println(c.getName());
        System.out.println(c.getNum());
    
        
    }
}
