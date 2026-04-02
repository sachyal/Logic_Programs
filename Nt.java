import java.util.Scanner;
import java.io.*;
public class Nt{
    public static void main(String args[]){
        System.out.println("program for checking if student is fail or pass, press b/w 1 to 100");
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        if(a ==33 || a>33){
            System.out.println("Student is passed in exam");
        }
        else 
            System.out.println("Student is failed");

    }
}