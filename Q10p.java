import java.util.Scanner;
public class Q10p{
    public static void main(String args[]){
        System.out.println("take 1 integer from keyboard and check its a prime or not");
        int a,i;
        boolean isprime=true;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a value to check");
        a=scanner.nextInt();
        for(i=2;i<=a/2; i++){
            if(a%i==0){
                isprime=false;
                break;

            }
        }
        if(isprime){
            System.out.println("its a prime no. " + a);
        }
        else{
            System.out.println("its not a prime no.");
        }

    }
}