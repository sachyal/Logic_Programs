import java.util.Scanner;
public class Mq2{
    static void iseven(int a){
        if(a%2==0){
            System.out.println("its a even number");
        }
        else {
            System.out.println("its a odd number");
        }
    }
    public static void main(String args[]){
        System.out.println("method will 1 int as argument and print it is even or not");
        Scanner scanner = new Scanner(System.in);
        int a;
        a =scanner.nextInt();
        iseven(a);
    }
}