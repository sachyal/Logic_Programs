import java.util.Scanner;

public class Cmlq3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int l = args.length;
        int v1 = 2;
        int v2 = 1;
        System.out.println("No of data passed" + l);
        for (i = 0; i < l; i++) {
            v1 = Integer.parseInt(args[i]);
            v2 = Integer.parseInt(args[i + 1]);

            break;
        }
        char x = scanner.next().charAt(0);
        if (x == '+') {
            System.out.println("sum of both values is: " + (v1 + v2));
        }
        if (x == '-') {
            System.out.println("value a minus b is:" + (v1 - v2));
        }
        if (x == '*') {
            System.out.println("a*b is: " + (v1 * v2));
        }
        if (x == '/') {
            System.out.println("a/b is: " + (v1 / v2));
        } else {
            System.out.println("invalid operator");
        }

    }

}
