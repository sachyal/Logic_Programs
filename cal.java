import java.util.Scanner;
public class cal{
    public static void main(String args[]){
        System.out.println("printing a calculator");
        Scanner scanner= new Scanner(System.in);
        float a,b;
       
        System.out.println("enter 'a' value");
        a=scanner.nextInt();
        System.out.println("enter 'b' value");
        b = scanner.nextInt();
        System.out.println("enter what you want to do + , -, /,* ");
        char sign = scanner.next().charAt(0);
        switch (sign) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("your given operator value is unvalid");
                break;
        }
        scanner.close();

    }
}