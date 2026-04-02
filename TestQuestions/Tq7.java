package TestQuestions;
import java.util.Scanner;

public class Tq7 {
    public static void main(String args[]){
        System.out.println("take 2 integers and print average of all even numbers b/w them");
        Scanner scanner = new Scanner(System.in);
        int i , a , b , c,s,avg ;
        avg = 0;
        s= 0;
        c= 0;
        System.out.println("enter 1st integer");
        a = scanner.nextInt();
        System.out.println("enter second value");
        b = scanner.nextInt();
        for(i=a; i<=b; i++){
            if(i%2==0){
                c=c+1;
                s = s + i;

            }

        }
        avg = s/c;
        System.out.println("Average of all evennumber is " + avg);
    }
    
}
