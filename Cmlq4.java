import java.util.Scanner;

public class Cmlq4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int j;
        int l = args.length;
        System.out.println("No of data passed" + l);
        String name = args[0];
        for (i = 0; i < name.length(); i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(name.charAt(j));
            }
            System.out.println();
        }

    }

}
