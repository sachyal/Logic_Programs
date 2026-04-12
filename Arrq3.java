import java.util.Scanner;
public class Arrq3{
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        int a[]=new int[5];
        int i;
        int index=0;
        int min; 
        int max;

        for(i=0; i<a.length; i++){
            System.out.print("enter number" + (i + 1) +": ");
            a[i]=scanner.nextInt();
        }
        min=a[0];
        for(i=0; i<a.length; i++){
            if(min>a[i]){

                min=a[i];
            }
        }
         
        max=a[0];
        for(i=0; i<a.length; i++){
            if(max<a[i]){

                max=a[i];
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
          int p=1;
        for(i=1; i<=min; i++){
           p=p*max;
        }
        System.out.println("max power min: " + p);
        int maxf=1;
        for(i=max; i>=1; i--){
            
            maxf=maxf*i;
        }
        System.out.println("max factorial is: " + maxf);
        int minf=1;
        for(i=min; i>=1; i--){
            
            minf=minf*i;
        }
        System.out.println("min factorial is: " + minf);

        System.out.println("sum of max! and min! : " + (minf+ maxf));
        int avg=max + min;
        System.out.println("Avg of max and min: " + avg/2);
        

        
        }
    }