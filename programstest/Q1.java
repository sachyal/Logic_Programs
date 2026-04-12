package programstest;
import java.util.Scanner;

public class Q1 {
    public static void main(String args[]){
        System.out.println("number of item and price per item from user and discound 10% will br offeref if total price if greater than 1000. other wise no discount will be offered");
         Scanner scanner=new Scanner(System.in);
         int n , p, i, t;
         t=0;
         int d;
         System.out.println("enter number of items you want");
         n=scanner.nextInt();
         System.out.println("enter price per item");
           for(i=1; i<=n; i++){
              p=scanner.nextInt();
              t=t+p;

           }  
           if(t>1000){
             d=t*10/100;
             t=t-d;
             System.out.println("bill with discount is " + t);
           }
           else{
            System.out.println("bill without discount is " + t);
           }
   
    }
    
}
