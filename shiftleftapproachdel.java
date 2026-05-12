import java.util.Scanner;

public class shiftleftapproachdel {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5 };
        int l = arr.length;
        System.out.println(l);

        System.out.println("enter a number you want to delete from array 1 to 5.");
        int n = scanner.nextInt();
        int index = -1;

        for (int i = 0; i < l; i++) {
            if (n == arr[i]) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < l - 1; i++) {
                arr[i] = arr[i + 1];
            }
            l = l - 1;
            for (int i = 0; i < l; i++) {
                System.out.print(arr[i]);
            }
        } else {
            System.out.println("number is not availanle in array");
        }
    }

}
