import java.util.Scanner;
public class StringsInJava {
    public static void main(String[] args) {
     /*   Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(name);

        String a=new String("Harraf");
        System.out.println(a);


        String aa="Munna @ 02";
        System.out.println(aa);  */

        // String methods
        String as="AshrafsMunna";
        int a=as.length();
        System.out.println(a);
         
        String b=as.toLowerCase();
        System.out.println(b);
        
        String c=as.toUpperCase();
        System.out.println(c);

        String d=as.substring(5);
        System.out.println(d);
        String e=as.substring(3,8);
        System.out.println(e);
        
        String sa="  muNna raju";
        String f=sa.trim();
        System.out.println(f);

        System.out.println(as.replace('A','S'));
        
        System.out.println(as.startsWith("As"));
        
        System.out.println(as.endsWith("na"));

        System.out.println(as.charAt(5));

        System.out.println(as.indexOf("Mu"));
        System.out.println(as.indexOf("Mu",1));
        System.out.println(as.indexOf("h"));

        System.out.println(as.lastIndexOf("h"));
        System.out.println(as.lastIndexOf("r",6));

        System.out.println(as.equals("AshrafsMunna"));
        System.out.println(as.equalsIgnoreCase("ashrafSmunna"));



    }
}
