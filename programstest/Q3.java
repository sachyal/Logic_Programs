package programstest;
import java.util.Scanner;


public class Q3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("checking for prime");
        int a,i;
        boolean prime=true;
        a=scanner.nextInt();
        for(i=2;i<=a/2; i++){
            if(a%i==0){
                prime=false;
                break;
            }
        }
        
           if(prime){
            System.out.println("its a prime number");
           }
           else{
            System.out.println("its not a prime number");
           }
    }
    
}
