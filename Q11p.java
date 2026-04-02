import java.util.Scanner;
public class Q11p{
    public static void main(String args[]){
        System.out.println("take 4 integers from keyboard and print maximum");
        int a,b,c,d;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter 'a' value to check");
        a=scanner.nextInt();
         System.out.println("enter 'b' value to check");
        b=scanner.nextInt();
         System.out.println("enter 'c' value to check");
        c=scanner.nextInt();
         System.out.println("enter 'd' value to check");
        d=scanner.nextInt();
        if(a>b){
            if(a>c){
                if(a>d){
                    System.out.println("a has maximum value"+ a);
                }

            }
        }
        if(b>c){
            if(b>d){
                System.out.println("b has maximum value"+b);

            }
        }
        if(c>d){
            System.out.println("c has maximum value" + c);
        }
        else {
            System.out.println("d has maximum value"+d);
        }

    }
}