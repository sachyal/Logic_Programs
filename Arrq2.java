import java.util.Scanner;
public class Arrq2{
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        int a[]=new int[5];
        int i;
        int index=0;
        int min; 

        for(i=0; i<a.length; i++){
            System.out.print("enter number" + (i + 1) +": ");
            a[i]=scanner.nextInt();
        }
        min=a[0];
        for(i=0; i<a.length; i++){
            if(min>a[i]){

                min=a[i];
                index=i;
            }
        }
        System.out.println("min: " + min);
        System.out.println("index: "+ index);
        
        }
    }