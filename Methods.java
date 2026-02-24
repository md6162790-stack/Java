public class Methods {
    public static void MyRun(){
        System.out.println("running running");
    }
    static void myRunning(String Name){
        System.out.println("Enter a name:"+Name);
    }
    static void myOne(String name,int num){
        System.out.println("name:"+name+"Id number"+num);
    }
    static void My(int age){
        if(age>=18)
            System.out.println("u r elagible");
        else
            System.out.println("u r not eligible");
    }
    public static void main(String[] args) {
        MyRun();
        Methods m=new Methods();
       m.MyRun();
       m.myRunning("ashraf");
       m.myOne("ram",34);
       m.My(25);
        
    }
}
