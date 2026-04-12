import java.util.Scanner;
public class Mqc5{
    static int sum(byte a, byte b){
        int c=a + b;
        return c;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        byte a , b;
        System.out.println("enter first byte code");
        a=scanner.nextByte();
        b=scanner.nextByte();
        int s=sum(a,b);
        System.out.println(s);
    }
}