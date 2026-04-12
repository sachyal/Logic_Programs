import java.util.Scanner;
public class Mq5{
    static int asci(char a){
        return a;
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        char a;
        System.out.println("enter character constant value");
        a=scanner.next().charAt(0);
        int b=asci(a);
        System.out.println(b);
    }
}