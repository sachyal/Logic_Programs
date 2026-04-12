package programstest;
import java.util.Scanner;


public class Mqc4 {
    static int sum(byte a, byte b){
        int s= a+b;
        return s;
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        byte a , b;
        System.out.println("enter byte a value");
        a=scanner.nextByte();
        System.out.println("enter byte b value");
        b=scanner.nextByte();
        int c=sum(a,b);
        System.out.println( "sum of both byte is "+ c);
    }
    
}
