import java.util.Scanner;
public class Mq3{
    static void max(int a, int b){
        if(a>b){
            System.out.println("a has bigger value" + a);
        }
        else {
            System.out.println("b has bigger value "+ b);
        }
    }
    public static void main(String args[]){
        System.out.println("Method will take 2 int as argument and print amax no.");
        Scanner scanner = New Scanner(System.in);
         int a , b;
         a=scanner.nextInt();
         max(a,b);
    }
    
}