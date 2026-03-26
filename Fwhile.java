import java.util.Scanner;
public class Fwhile{
    public static void main(String args[]){
        System.out.println("factorial of given number");
        Scanner scanner=new Scanner(System.in);
        int a,i,f;
        f=1;
        a = scanner.nextInt();
        i=1;
        while(i<=a){
            f=f*i;
            System.out.println("factorial of given number is " + f);
            i++;
        }
    }
}