public class VarArgs {
    static int MySum(int...arr){
        int sum=0;
        for(int e:arr){
            sum+=e;
        }
        return sum;
    }
public static void main(String[] args) {
    System.out.println(MySum(1,5,2,90,34)); // passing values like 1;1,2;1,2,3;1,2,3,4;
    
}
}
