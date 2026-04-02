import java.util.Scanner;
public class Q1p{
    public static void main(String args[]){
        System.out.println("take 1 integer from keyboard and print how many digits in this");
        Scanner scanner =new Scanner(System.in);
        int a , c, i;
        c=0;
        System.out.print("give a value");
        a=scanner.nextInt();
        for(i=a; i>0; i=i/10){
            c=c+1;
        }
        System.out.println(c);
    }
}