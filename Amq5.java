import java.util.Arrays;
import java.util.Scanner;
public class Amq5{
    static int prime(int a[]){
       int c=0;
       int i;
       boolean isprime=true;
       for(i=0; i<a.length; i++){
        int temp=a[i];
        int j;
        for(j=2; j<temp/2; j++){
            if(temp%j==0){
                isprime=false;
            }
        }
        if(isprime){
            c=c+1;
        }

       }
       return c;
    }
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        System.out.println("WAM 2d array as argument and return how many are prime no.s");
        int a[]=new int[3];
        int i,j;
        System.out.println("enter int array");
        for(i=0; i<a.length; i++){
           
            a[i]=scanner.nextInt();
            

        }
        System.out.println(Arrays.toString(a));
        
        int  c=prime(a);
        System.out.println( "this many prime no.s are available: " + c);
    }
    
}