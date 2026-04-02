import java.util.Scanner;
public class Q2p{
    public static void main(String args[]){
        System.out.println("take one integer from keyboard and print sum of all digits");
        Scanner scanner=new Scanner(System.in);
        int a,i,s,b;
        System.out.println("enter a value");
        a=scanner.nextInt();
        b=0;
        s=0;
        for(i=a; i>0; i=i/10){
            s=i%10;
            b=s+b;
        }
        System.out.println(b);
    }
}