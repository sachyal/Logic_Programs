import java.util.Scanner;
public class Arrq1{
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        int a[]=new int[5];
        int i;
        int c=0;
        int index=0;
        int m=0; 
        System.out.println("enter the search value");
        int b=scanner.nextInt();

        for(i=0; i<a.length; i++){
            System.out.println("enter number" + (i + 1));
            a[i]=scanner.nextInt();
        }
        for(i=0; i<a.length; i++){
            if(a[i]==b){
                m=1;
                c=c+1;
                index=i;
            }
        }
        if(m==1){
            System.out.println("Available and the count "+  c);
        }
        else{
            System.out.println("not available");
        }
        System.out.println("index " + index);

        }
    }
