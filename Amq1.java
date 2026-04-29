import java.util.Scanner;
public class Amq1{
    static int avail(int a[], int b){
        int i;
        for(i=0; i<a.length; i++){
            int x =a[i];
            if(x==b){
                return 1;
            }

        }
        return 0;
    }
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        System.out.println("wam that take 1 int array and 1 int as argument, return 1 if its available other wise 0");
        int a[]=new int[5];
        int b, i;
        System.out.print("enter integer value");
        b=scanner.nextInt();
        System.out.println("int array");
        for(i=0; i<a.length; i++){
            a[i]=scanner.nextInt();

        }
        
        int c=avail(a, b);
        System.out.println( "if int avail its print 1 else 0: " + c);
    }
    
}