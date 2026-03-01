import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int[] marks={45,23,67,98,45};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter index number:");
        int ind=sc.nextInt();
        System.out.println("Index is  "+marks[ind]);
    }
}
