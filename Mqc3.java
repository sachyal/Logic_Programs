import java.util.Scanner;
public class Mqc3{
     static char charav(int a){
        
        return a;
     }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("give int value");
        int a;
        a=scanner.nextInt();
        char b=charav(a);
        System.out.println(b);
    }
}