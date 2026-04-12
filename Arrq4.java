import java.util.Scanner;
public class Arrq4{
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        int a[]=new int[5];
        int i;
        int j;
        int index=0;
        int temp;

        for(i=0; i<a.length; i++){
            System.out.print("enter number" + (i + 1) +": ");
            a[i]=scanner.nextInt();
        }
         System.out.println("Before sorting");
         for(i=0; i<a.length; i++){
            System.out.print(a[i] + " " );
         }
      for(i=0; i<a.length; i++){
        for(j=i; j<a.length; j++){
            if(a[i]<a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;

            }
        }
      }
        System.out.println("After sorting in descending order ");
        for(i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("top 3 highest element is :" + a[0] + " " + a[1]+ " " + a[2]);
        }
    }