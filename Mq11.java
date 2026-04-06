import java.util.Scanner;
public class Mq11{
    static void check(char x){
        if( x>=65 && x<=90){
            System.out.println("its a capital alphabet");
        }
        else if(x>=48 && x<=57){
            System.out.println("its a digit");
        }
        else if(x>=97 && x<=122){
            System.out.println("its smalll alphabet");
        }
        else {
            System.out.println("its a symbol or special character");
        }
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        char x;
        System.out.println("enter single value to check");
        x=scanner.next().charAt(0);
        check(x);
    }
}