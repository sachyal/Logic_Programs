import java.util.Scanner;
public class Cdowhile{
    public static void main(String args[]){
        System.out.println("taking 2 integers from keyboard, printing numbers b/w them and sum of no.s b/w them");
        Scanner scanner = new Scanner(System.in);
        int a,b,s;
        a=scanner.nextInt();
        b=scanner.nextInt();
        s=0;
        do {
            System.out.println(a);
            s = s + a ;
            a ++;
        }
        while (a <=b);
        System.out.println("sum of no.s b/w a and b = " + s);
        scanner.close();

    }
}