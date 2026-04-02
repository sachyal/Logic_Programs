package TestQuestions;
import java.util.Scanner;
public class Tq3{
    public static void main(String args[]){
        System.out.println(" Taking Length,Breadth of Rectangle,Radius of Circle and calculating Area of both and which has greater area");
        Scanner scanner = new Scanner(System.in);
        float l , b , r, g, cra , pi, cca ; //c for count, r =rect , c = circle
        System.out.println("Give lenght of Rectangle");
        l = scanner.nextInt();
        System.out.println("Give breadth of Rectangle");
        b = scanner.nextInt();
        System.out.println("Give r of Circle");
        r = scanner.nextInt();
         cra= l * b ;
         System.out.println("Area of rectangle is " + cra);
         g = r*r;
         pi = 3.14159265f ;
         cca = pi* g ;
         System.out.println("Area of circle " + cca);
         if(cra>cca){
            System.out.println("Area of Rectangle is greater"); 
         }
        else{
            System.out.println("Area of Circle is greater");
        }
    }
}