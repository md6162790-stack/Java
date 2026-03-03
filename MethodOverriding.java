public class MethodOverriding {
    public static void main(){
        System.out.println("Munna is a good boy");
    }
    static void main(int i){
        System.out.println("Munna got first rank "+i);
    }
    static void main(String name,int a){
        System.out.println(name+ "  "+a);
    }

    public static void main(String[] args) {
        main();
        main(1);
        main("Ashraf",18);
        
        
    }
}
