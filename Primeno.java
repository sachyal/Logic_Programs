import java.util.Scanner;
public class Primeno{
    public static void main(String args[]){
        System.out.println("checking for prime num.");
        Scanner scanner = new Scanner(System.in);
        int a , i;
        boolean isprime=true;
        a = scanner.nextInt();
        for(i =2; i<=a/2; i ++){
            if(a%i==0){
                isprime=false;
                 break;
                } 
            
        }
        if(isprime){
            System.out.println("This a prime number");
        }
        else 
            System.out.println("This is not a prime number");
           }
}