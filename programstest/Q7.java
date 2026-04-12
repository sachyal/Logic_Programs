package programstest;
import java.util.Scanner;


public class Q7 {
    static int vowel(char a){
        if(a=='A'|| a=='a' || a=='e' || a=='E' || a=='I' || a=='i' || a=='O' || a=='o' || a=='U' || a=='u'){
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void main(String args[]){
        System.out.println("w.A.Mwill take one character const. as argument and return 1 its its value is vowel other wise return 0");
         Scanner scanner = new Scanner(System.in);
         char a;
         System.out.println("enter a character value");
         a=scanner.next().charAt(0);
         int b;
         b=vowel(a);
         System.out.println(b);

    }
    
}
