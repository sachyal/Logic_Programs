package methodtest;
import java.util.Scanner;

public class Q1 {
    static void table(int a){
        int i,b;
        b=0;
        for(i=1; i<=10; i++){
            b=a*i;
            System.out.println(b);
        }

    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int a ;
        a=scanner.nextInt();
        table(a);
    }
    
}
