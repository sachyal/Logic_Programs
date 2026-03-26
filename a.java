import java.util.Scanner;
public class a {
    public static void main(String args[]){
        System.out.println("taking 2 integers a and b from keyboard and printing sum of all numbers b/w them");
        Scanner scanner = new Scanner(System.in);
        int a,b,s,i ;
        s=0;
        a=scanner.nextInt();
        b=scanner.nextInt();
        for(i=a; i<=b; i++){
            s= s + i;
        }
        System.out.println("sum b/w a and b is = " + s);

    }
}