import java.util.Scanner;
public class Stringq2{
    public static void main(String args[]){
        System.out.println("take 2 string and compare equal or not");
        Scanner scanner= new Scanner(System.in);
        String a , b;
        boolean x;
        System.out.print("enter first String");
        a=scanner.nextLine();
        System.out.println("enter second String");
        b=scanner.nextLine();
        x=a.equals(b);
        if(x){
            System.out.println("both string are equal");
        }
        else {
            System.out.println("both strings are equal");
        }

    }
}