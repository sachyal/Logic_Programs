import java.util.Scanner;
public class Mp{
    static void power(int a , int b){
        int i ,p;
        p=1;
        for(i=1; i<=b; i++){
            p=p*a;

        }
        System.out.println(p);
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a ,b;
        System.out.println("enter a value");
        a=scanner.nextInt();
        System.out.println("enter power as b");
        b=scanner.nextInt();
        power(a,b);
    }
}