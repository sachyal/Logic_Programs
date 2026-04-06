import java.util.Scanner;

public class Mf{
    static void fact(int a){
        int f=1;
        int i;
        for(i=a; i>=1; i--){
            f=i*f;
            System.out.println(f);
        }
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int a ;
        a=scanner.nextInt();
        fact(a);
    }
}