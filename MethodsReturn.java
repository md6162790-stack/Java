public class MethodsReturn {
    static int My(int num){
        return num+50;
    }
    static double Ret(double pi,int r){
        return pi*r*r;
    }
    static int MyFace(int x){
        return x*2;
        
    }
    public static void main(String[] args) {
        System.out.println(My(5));
      //  MethodsReturn mt=new MethodsReturn();
      //  System.out.println(mt.My(4));
      System.out.println(Ret(3.14,5));
      for(int i=1;i<=5;i++){
        System.out.println("Double of"+i+"is"+MyFace(i));
      }

    }
}
