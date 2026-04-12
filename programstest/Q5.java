package programstest;
import java.util.Scanner;

public class Q5 {
    static boolean palindrome(String a){
        int l=a.length();
         String rev="";
        int i;
        for(i=l-1; i>=0; i--){
            char x=a.charAt(i);
            rev=rev+x;

        }
        System.out.println(rev);
        if(a.equals(rev)){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String args[]){
        System.out.println("w.a.m. that will take string object as argument and return true if its palindrome other wise return false");
        Scanner scanner =new Scanner(System.in);
        String a;
        boolean b;
        System.out.println("enter a string value");
        a=scanner.nextLine();
        b=palindrome(a);
        System.out.println(b);
    }
}
