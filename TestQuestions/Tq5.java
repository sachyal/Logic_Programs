package TestQuestions;
import java.util.Scanner;

public class Tq5 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("factorial of a given number");
        int a , f, i ;
        f=1;
        System.out.println("Give a value you want factorial of");
        a = scanner.nextInt();
        for(i=1; i<=a; i++){
            f= f*i;

        }
        System.out.println("factorial of "+ a + " is "+ f);


    }
    
}
