class Employee{
    int id;
    int salary;
    String name;
    public void detail(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    } 
    public int salarys(){
        return salary;
    }  
}
public class Oops {
    public static void main(String[] args) {
        Employee harry=new Employee();
        Employee john=new Employee();
        Employee ram=new Employee();
        harry.id=1;
        harry.salary=1233;
        harry.name="Sameera";
        john.id=2;
        john.salary=678;
        john.name="munna";
        ram.id=1;
        ram.salary=34567;
        ram.name="Sameedha";
        harry.detail();
        john.detail();
        ram.detail();
 int salary=harry.salarys();
 System.out.println(salary);
    }
}
