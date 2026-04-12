import java.util.Scanner;
public class Mqop1{
    static int calc(int a, int b, char x){
        int d;
        if(x=='+'){
            d=a + b;
            return d;
        }
        if(x=='-'){
            d= a - b;
            return d;
        }
        if(x=='/'){
            d= a / b;
            return d;
        }
        if(x=='*'){
            d= a * b;
            return d;
        }
        if(x=='%'){
            d= a % b;
            return d;
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a , b; char x;
        int c;
        System.out.println("enter first operant value");
        a=scanner.nextInt();
        System.out.println("enter second operant value");
        b=scanner.nextInt();
        System.out.println("enter your operator");
        x=scanner.next().charAt(0);
        c=calc(a,b,x);
        System.out.println("your operator is " + x + " answer is " + c);
    }
}