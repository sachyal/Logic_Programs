import java.io.*;
import java.util.Scanner;
public class Prim{
    public static void main (String args[]){
        System.out.println("printing prime no.s b/w two numbers");
        Scanner scanner = new Scanner(System.in);
        int a , b, num, i ,j;
        num =0;
        System.out.println("enter a value");
        a = scanner.nextInt();
        System.out.println("enter b value");
        b = scanner.nextInt();
        while(a<b){
            boolean num=false;
            for(i=2; i<=a/2; i++){
                if(a%i==0){
                     num=true;
                    break;
                }
            }
            if(!num && a!=0 && a!=1){
                System.out.println( num + " ");
            }
           a++;
        }
    }
}