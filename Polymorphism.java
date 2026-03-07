class A{
    public void tiger(){
        System.out.println("Tiger");
    }
}

class B extends A{
    public void tiger(){
        super.tiger();
        System.out.println("Tiger lives in forests");
    }
}

class C extends A{
        public void tiger(){
        System.out.println("Tiger is very dangerous");
    }
}

class Polymorphism {
    public static void main(String[] args) {
        A a = new B();
        A b=new C();   
        a.tiger();  
        b.tiger();     
    }
}