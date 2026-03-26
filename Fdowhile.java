import java.util.Scanner;
public class Fdowhile{
    public static void main(String args[]){
        System.out.println("factorial of given numbrer");
        Scanner scanner = new Scanner(System.in);
        int a,f,i;
        a = scanner.nextInt();
        f=1;
        i=1;
        do{
                f=f*i;
                i++;
            
        }while(i<=a);
        System.out.println("factorial of given number is " + f);

    }
}