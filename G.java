import java.util.Scanner;
public class G{
    public static void main(String args[]){
        System.out.println("Value of a power b");
        Scanner scanner = new Scanner(System.in);
        int a,b, p;
        p=1;
        System.out.println("enter value a");
        a = scanner.nextInt();
        System.out.println("enter power as b");
        b = scanner.nextInt();
        for(int i =1; i<=b; i++){
            p=p*a;
        }
        System.out.println("factorial of a power b is " + p);

    }
}