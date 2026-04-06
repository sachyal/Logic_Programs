import java.util.Scanner;
public class Stringq6{
    public static void main(String args[]){
        System.out.println("check if given String are equals");
        Scanner scanner = new Scanner(System.in);
        String a, b ,c;
        a=scanner.nextLine();
        b=scanner.nextLine();
        c=scanner.nextLine();
        boolean x = true;
        x=a.equals(b);
        System.out.println(x);
        x=b.equals(c);
        System.out.println(x);
        x=a.equals(c);
        System.out.println(x);



    }
}