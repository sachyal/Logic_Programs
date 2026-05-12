import java.util.Scanner;

public class Arraydel {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
        int l = arr.length;
        System.out.println("enter array inputs");
        for (int i = 0; i < l; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("inpurt array is:");
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("enter number you want to delete from an array");
        int n = scanner.nextInt();
        int arr2[] = new int[l];
        for (int i = 0; i < l; i++) {
            int m = arr[i];
            if (n == m) {
                continue;
            } else {
                arr2[i] = arr[i];
            }
            System.out.print(arr2[i] + " ");
        }

    }

}
