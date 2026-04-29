import java.util.Scanner;
public class Seriesq6{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("series till n numbers, 1^1/1! - 2^2/2! + 3^3/3! - 4^4/4! .. n.");
        int n; int i; int s=0; int e=0; int o=0; 
        System.out.println("enter number");
        n = scanner.nextInt();
        for(i=1; i<=n; i++){
            if(i%2==0){
                int j; int p=1; int f=1;
                for(j=1; j<=i; j++){
                    p=p*i;
                    f=f*j;
                    e=e + p/f;
                }
            }
            else{
                 int j; int p=1; int f=1;
                for(j=1; j<=i; j++){
                    p=p*i;
                    f=f*j;
                    o= o+ p/f;
                }
            }
            
           
        }
        s=o- e;
    
        System.out.println(s);

    }
}