import java.util.Scanner;
public class Series{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("series till n no. square of int till n numbers");
        int n; int i; int s=0; int l;
        n = scanner.nextInt();
        for(i=1; i<=n; i++){
            l= i*i;
            s=s+l;

        }
        System.out.println(s);

    }
}