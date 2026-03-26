import java.util.Scanner;
public class C{
public static void main(String args[]){
    System.out.println("take 2 integers from keyboard and will print all numbers b/w them");
    Scanner scanner = new Scanner(System.in);
    int i,a,b,s;
    s=0;
    a=scanner.nextInt();
    b=scanner.nextInt();
    for (i=a; i<=b; i++){
        System.out.println(i);
        s=s+i;
    }
    System.out.println("sum of numbers b/w a and b =" + s);
    scanner.close();
}
}