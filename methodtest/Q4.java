package methodtest;
import java.util.Scanner;
 
public class Q4 {
    static void totalpercent(int a , int b, int c){
        int t,d,p;
        t=a + b + c;
        p=100*t/300;
        System.out.println(p+"%");
        
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int a , b ,c;
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        totalpercent(a,b,c);
    }
    
}
