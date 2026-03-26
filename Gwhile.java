import java.util.Scanner;
public class Gwhile{
public static void main(String args[]){
    System.out.println("printing value of a power b");
    Scanner scanner = new Scanner(System.in);
    int a,b,p,i;
    i=1;
    p=1;
    System.out.println("enter value of a");
    a=scanner.nextInt();
    System.out.println("enter power b");
    b=scanner.nextInt();
    while(i<=b){
        p=a*p;
        i++;
    }
    System.out.println("power value of given number is " + p);

}

}