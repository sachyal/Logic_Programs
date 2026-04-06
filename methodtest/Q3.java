package methodtest;
import java.util.Scanner;

public class Q3 {
    static void arear(int a,int b){
        int c;
        c=a*b;
        System.out.print(c);
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int a,b;
        a=scanner.nextInt();
        b=scanner.nextInt();
        arear(a,b);
    }
    
}
