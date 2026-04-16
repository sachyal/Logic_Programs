import java.util.Scanner;
public class Asq1{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println(" String from kb and print Ascii value of each characters and sum of ascii value");
        String a;
        System.out.println("give string value");
        a=scanner.nextLine();
        int l =a.length();
        int i;
        int s=0;
        for(i=0; i<l; i++){
            char x=a.charAt(i);
            int v=x;
            System.out.println("Ascii value of " + x + ":" + v );
            s=s+v;
        }
        System.out.println("sum of ASCII value is " + s);

    }
}