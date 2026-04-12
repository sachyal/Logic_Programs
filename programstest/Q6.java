package programstest;
import java.util.Scanner;


public class Q6 {
    static int palin(int a){
        int i; 
        int c;
        int rev=0;
        for(i=a; i>0; i=i/10){
            c=i%10;
            rev=rev*10 + c;

        }
        System.out.println(rev);
        if(a==rev){
            return 1;

        }
        else{
            return 0;
        }
    }
    public static void main(String args[]){
    System.out.println("take one int as argument and return one if its value is palindrome other wise return 0");
    Scanner scanner=new Scanner(System.in);
    int a;
    System.out.println("give int value");
    a=scanner.nextInt();
    int b=palin(a);
    System.out.println(b); 

}

    
}
