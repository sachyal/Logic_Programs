package TestQuestions;
import java.io.*;
public class And{
    public static void main(String args[]){
        System.out.println("And operators");
        int  a =10 , b =20 , c =20 ,d=0;
        System.out.println("Var= " + a);
        System.out.println("Var= " + b);
        System.out.println("Var= " + c);
        if((a<b) && (b==c)){
            d = a + b + c;
            System.out.println("The sum is : " + d );

        }
        else 
            System.out.println("False Contions");
    }
}