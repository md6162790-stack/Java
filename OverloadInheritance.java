class A {
    A() {
        System.out.println("A Constructor");
    }

    A(int a) {
        System.out.println("A Constructor : " + a);
    }
}

class B extends A {
    B() {
        super();   // calls A()
        System.out.println("B Constructor");
    }

    B(int a, int b) {
        super(a);   // calls A(int)
        System.out.println("B Constructor : " + b);
    }
}

class C extends B {
    C() {
        super();   // calls B()
        System.out.println("C Constructor");
    }

    C(int a, int b, int c) {
        super(a, b);   // calls B(int,int)
        System.out.println("C Constructor : " + c);
    }
}

public class OverloadInheritance {
    public static void main(String[] args) {
        A a=new A(1);
        C c=new C(1,2,3);

    }
}