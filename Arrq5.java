import java.util.Scanner;
public class Arrq5{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int a[]=new int[5];
        int i ,j;
        for(i=0; i<a.length; i++){
            System.out.println("enter numbers: " );
            a[i]=scanner.nextInt();
        }
        System.out.println("Before sorting");
        for(i=0; i<a.length; i++){
             System.out.print(a[i] + " ");
             }

    int temp;

    for(i=0; i<a.length; i++){
        for(j=i; j<a.length; j++){
            if(a[i]<a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }

        }
    }

       System.out.println("After Sorting");
       for(i=0; i<a.length; i++){
        System.out.print(a[i]+" ");
       }


    }
}