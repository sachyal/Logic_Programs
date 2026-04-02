package TestQuestions;
import java.util.Scanner;

public class Tq6 {
    public static void main(String args[]){
        System.out.println("Printing A power b");
        Scanner scanner = new Scanner(System.in);
        int a , b, i,p;
        System.out.println("give value of a and its power b");
        p= 1;
        a = scanner.nextInt();
        b = scanner.nextInt();
        for(i=1; i<=b; i++){
            p=p*a;
        }
        System.out.println(p);

    }
    
}
