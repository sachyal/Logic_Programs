package TestQuestions;
import java.util.Scanner;
public class Tq4 {
    public static void main(String args[]){
        System.out.println("Table of given number");
        Scanner scanner = new Scanner(System.in);
        int num , i , t;
        t=1;
        System.out.println("give number you want table of");
        num = scanner.nextInt();
        for(i=1; i<=10; i++){
            t= num * i;
             System.out.println(t);
        }
       

    }
    
}
