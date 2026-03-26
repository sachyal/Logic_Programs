import java.util.Scanner;
public class Gdowhile{
    public static void main(String args[]){
        System.out.println("printing value of a power as b");
        Scanner scanner = new Scanner(System.in);
        int a,b,p,i;
        System.out.println("enter value of a");
        a =scanner.nextInt();
        System.out.println("enter power as b ");
        b = scanner.nextInt();
        p=1;
        i=1;
        do {
                p=p*a;
                i++;
        }while(i<=b);
        System.out.println("value of given number is  " + p);
    }
}