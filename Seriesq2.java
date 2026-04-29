import java.util.Scanner;
public class Seriesq2{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("series till n numbers add odd numbers and  minus even numbers");
        int n; int i; int s; int e=0; int o=0;
        n = scanner.nextInt();
        for(i=1; i<=n; i++){
            if(i%2==0){
                e=e+i;
            }
            else{
                o=o+i;
            }
        }
        s=o-e;
        System.out.println(s);

    }
}