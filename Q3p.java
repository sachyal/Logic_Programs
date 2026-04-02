import java.util.Scanner;
public class Q3p{
    public static void main(String args[]){
        System.out.println("take one integer from keyboard and print its all indiviual");
        Scanner scanner=new Scanner(System.in);
        int a,i,s,b;
        System.out.println("enter a value");
        a=scanner.nextInt();
        b=0;
        for(i=a; i>0; i=i/10){
            b=i%10;
            System.out.println(b);

        }
        
    }
}