package programstest;
import java.util.Scanner;

public class Q8 {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        System.out.println("press 1 for max number, press 2 for factorail no., press 3  for string palindrome or not, press 4 for cc is capital A or not, press 5 for exit");
        
        int k=1;
        
        while(k!=0){
            char s;
        System.out.println("enter value from 1 to 5");
        s=scanner.next().charAt(0);
        switch(s){
            case '1' :
                System.out.println("max number b/t 2 numbers");
                int a , b;
                System.out.println("enter value a");
                a=scanner.nextInt();
                System.out.println("enter value b ");
                b=scanner.nextInt();
                if(a>b){
                    System.out.println("a is larger: " + a);
                }
                else{
                    System.out.println("b is larger " + b);
                }
                break;
            case '2':
                System.out.println("enter value for factorial");
                int f, i, fa; fa=1;
                f=scanner.nextInt();
                for(i=f; i>=1; i--){
                    fa=i*fa;

                }
                System.out.println("Factorial value is " + fa);
                break;
            
            case '3':  
                System.out.println("enter a String value");
                String str;
                int j;
                char x;
                String rev="";
                str=scanner.nextLine();
                int l=str.length();
                for(j=l-1; j>0; j--){
                    x=str.charAt(j);
                    rev=rev+x;

                }
                if(str.equals(rev)){
                    System.out.println("its a palindrome");
                }
                else{
                    System.out.println("its not a palindrome no.");
                }
                break;
            case '4' :
                char cap;
                System.out.println("checking CC is capital A or not");
                cap=scanner.next().charAt(0);
                if(cap=='A'){
                    System.out.println("its Capital A");
                }
                else {
                    System.out.println("it is not capital A");
                }
                break;
            
            case '5' :
                System.out.println("5 is for exit");
                break;


        }
           System.out.print("continue press 1 and 0 for stop ");
             k=scanner.nextInt();
              }
    }
    
}
