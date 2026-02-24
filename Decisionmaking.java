import java.util.Scanner;
public class Decisionmaking {
    public static void main(String[] args) {
        // if statement
        int a=18;
        if(a>=15)
            System.out.println("you are good");
        // if else statement
        int age=25;
        if(age>18){
            System.out.println("you are elagible");
        }else{
            System.out.println("u are not eligible");
        }
        // if elseif statement
        int marks=58;
        if(marks>=90){
            System.out.println("A grade");
        }else if(marks>=60){
            System.out.println("B grade");
        }else{
            System.out.println("C grade");
        }
               //switch statement
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        switch(num){
            case 1:
                System.out.println("excellent");
                break;
            case 2:
                System.out.println("good");
                break;
            case 3:
                System.out.println("Normal");
                break;
            default :
            System.out.println("bad");
            break;
        }
        System.out.println("program successfully executed");
        
    }
}
