package methodtest;
import java.util.Scanner;

public class Q2 {
    static void area(int r){
        int b;
        float a;
        b=r*r;
        float p=3.14f;
        a=b*p;
        System.out.println(a);
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int r;
        r=scanner.nextInt();
        area(r);
    }
    
}
