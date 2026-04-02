import java.util.Scanner;
public class Q12p{
    public static void main(String args[]){
        System.out.println("menu driven program for +.-.*,/");
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter= + , - , * ,/");
       char  a=scanner.next().charAt(0);
         switch(a){
            case '+':
                System.out.println("you entered +");
                break;
            case '-':
                System.out.println("you entered -");
                break;
            case '*':
                 System.out.println("you entered *");
                 break;
            case '/':
                System.out.println("you entered /");
                break;
            default:
                System.out.println("you entered wrong input");
                break;

         }

    }
}