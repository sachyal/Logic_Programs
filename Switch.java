import java.util.Scanner;
public class Switch{
    public static void main(String args[]){
        System.out.println("Doing switch statements");
        System.out.println("give a value b/w 1 to 3");
        Scanner scanner = new Scanner(System.in);
        int num;
        num = scanner.nextInt();

        switch(num){
            case 0:
                System.out.println("case value is 0 same as your given number " + num);
                break;
            case 1:
                System.out.println("case value is 1 same as your given number " + num);
                break;
            default :
            System.out.println(" your given number is not presend within case " + num);        
        }
    }
}