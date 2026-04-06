package methodtest;
import java.util.Scanner;

public class Q5 {
    static void shop(int a, int b){
        if(a<b){
            System.out.println("shopkeeper got profit");
        }
        else {
            if(a==b){
                System.out.println("no profit or not loss");
            }
            else {
                System.out.println("shop keeper got loss");
            }
        }
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a ,b;
        System.out.println("enter cost price");
        a=scanner.nextInt();
        System.out.println("enter selling price");
        b=scanner.nextInt();
          shop(a,b);
    }
    
}
