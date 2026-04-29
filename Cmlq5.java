import java.util.Scanner;

public class Cmlq5 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int x;
        int c = 0;
        int s = 0;
        int l = args.length;
        System.out.println("No of data passed" + l);
        for (i = 0; i < l; i++) {
            x = Integer.parseInt(args[i]);
            if (x % 2 == 0) {
                c = c + 1;
                s = s + x;

            }

        }
        System.out.println("avg: " + s / c);

    }

}
