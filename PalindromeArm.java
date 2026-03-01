public class PalindromeArm {
     public static void main(String[] args) {
        // palindrome
      /*  int num=131;
        int temp=num;
        int rev=0;
        while(temp!=0){
            rev=rev*10+temp%10;
            temp=temp/10;
            }if(num==rev){
                System.out.println("Palindrome number");
            }else{
                System.out.println("not a palindrome");
            }   
           // Armstrong number
          int num=153;
          int temp=num;
          int sum=0;
          while(temp!=0){
            int digit=temp%10;
            sum=sum+digit*digit*digit;
            temp=temp/10;
          }if(num==sum){
            System.out.println("Is a armstrong number");
          }else{
            System.out.println("Is not a armstrong number");
          } */
         //count a number in the digit
         int num=12345678;
         int count =0;
         while(num!=0){
            count++;
            num=num/10;
         }
         System.out.println(count);
     }
}
