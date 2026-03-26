import java.util.Scanner;

public class sum {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("please enter 3 integers to get total sum and enter");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        int sum = num1 + num2 + num3 ;
        System.out.println("sum of three integers " + sum);

    }
}
