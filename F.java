import java.util.Scanner;
public class F{
    public static void main(String args[]){
        System.out.println("factorial of given number");
        Scanner scanner = new Scanner(System.in);
        int a,i;
        int f=1;
        a=scanner.nextInt();
        for(i=1; i<=a; i++){
            f=f*i;
        }
        System.out.println("factorial of given number is "+ f);

    }
}