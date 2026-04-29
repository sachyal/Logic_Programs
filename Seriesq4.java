import java.util.Scanner;
public class Seriesq4{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("series till n numbers, 1^2 + 2^2 + 3^3 + 4^4 .. n.");
        int n; int i; int s=0; 
        n = scanner.nextInt();
        for(i=1; i<=n; i++){
            int p=1;
            int j;
            for(j=1; j<=i; j++){
                p= p*i;
            }
            s=s+p;
            
           
        }
    
        System.out.println(s);

    }
}