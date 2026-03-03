public class MethodsPractice {
    static int fact(int n){
        if(n==0 ||n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    public static void mul(int s){
        for(int i=0;i<10;i++){
            System.out.format("%d X %d =%d\n",i,s,s*i);
        }
    }
    public static void run(int k){
        for(int i=0;i<k;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
    static int sumRec(int a){
        if(a==1){
            return 5;
        }else{
            return a+sumRec(a-1);
        }
    }
public static int kgf(int b){
    if(b==1){
        return 0;
    }else if(b==2){
        return 2;
    }else{
        return kgf(b-1)+kgf(b-2);
    }
    
}
    
    public static void main(String[] args) {
        int n=6;
        System.out.println(fact(n));
        int s=5;
        mul(s);
        run(5);
        int c=sumRec(5);
        System.out.println(c);
        System.out.println(kgf(10));

    }
}
