import java.util.Scanner;

public class maxi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 2 intergers with different values ");
        int num1, num2 ;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        if ( num1 > num2 )
          { System.out.println("num1 is greater :" + num1); }
        
        else if ( num2 > num1 ) {
            System.out.println("num2 is greater :" + num2);
        }
        else {
            System.out.println("both are equal");
        }
    }
}