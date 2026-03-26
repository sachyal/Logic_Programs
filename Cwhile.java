import java.util.Scanner;
public class Cwhile{
    public static void main(String args[]){

        System.out.println("taking 2 integers from keyboard and will print numbers b/w them and their sum");
        Scanner scanner = new Scanner(System.in);
        int a , b, s;
        s = 0;
        a = scanner.nextInt();
        b = scanner.nextInt();
        while ( a<= b){
        System.out.println(a);
        s = a + s ;
        a++;
        }
        System.out.println("sum of integers b/w them = " + s);
        scanner.close();
    
    }
}