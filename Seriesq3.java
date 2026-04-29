import java.util.Scanner;
public class Seriesq3{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("series till n numbers 1/2 + 2/3 + 3/4 + .. n.");
        int n; int i; int s=0; 
        n = scanner.nextInt();
        for(i=1; i<=n; i++){
            s=s + i/i+1;
           
        }
    
        System.out.println(s);

    }
}