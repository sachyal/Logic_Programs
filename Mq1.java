import java.util.Scanner;
public class Mq1{
     
    static void sum(float a , float b, float c){
        float d ;
        d= a + b + c;
        System.out.println(d);
    }
    public static void main(String args[]){
        System.out.println("method will take 3 floats as auguments and print total of 3 floats");
        Scanner scanner = new Scanner(System.in);
        float a ,b,c;
        a=scanner.nextFloat();
        b=scanner.nextFloat();
        c=scanner.nextFloat();
        sum(a,b,c);
    }
}