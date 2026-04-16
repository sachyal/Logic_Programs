import java.util.Scanner;
public class A2dq5{
    static int sum(int a[]){
        int i;
        int s=0;

        for(i=0; i<a.length; i++){
                s=s+a[i];
                
            }
            return s;

    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a[]=new int [3];
        int i,s;
        for(i=0; i<a.length; i++){
            System.out.print("enter array values: ");
            a[i]=scanner.nextInt();
        }
        s=sum(a);
        System.out.println("sum of array" +s);
        
        }

    }