package programstest;
import java.util.Scanner;

public class Mqc2 {
    static char charact(int a){
        char c=(char)a;
        return c;
    }
    public static void main(String args[]){
    Scanner scanner=new Scanner(System.in);
    int a;
    System.out.println("enter a int value");
    a=scanner.nextInt();
    char b=charact(a);
    System.out.println(b);
    }
}
