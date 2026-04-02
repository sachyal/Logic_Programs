package TestQuestions;
import java.util.Scanner;

public class Tq1 {
    public static void main(String args[]){
        System.out.println("Take 4 no.s from keyboard and print their max");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 4 intergers to get max value");
        int a,b,c,d;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        if(a>b){
            if(a>c){
                if(a>d){
                    System.out.println("A has highest value b/t 4 integers " + a);
                }
            }
        }
        else if(b>c){
            if(b>d){
              System.out.println("B has highest value b/t 4 integers " + b);
            }
        }
        else {
            if(c>d){
                System.out.println("C has higest value b/w 4 integers " + c );
            }
            else{

                System.out.println("D has the largest Value "+ d);
            }
        }

    }
    
}
