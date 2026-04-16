import java.util.Scanner;
public class A2dq3{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int a[][]=new int [3][3];
        int max=a[0][0];
        int i,j;
        for(i=0; i<a.length; i++){
            for(j=0; j<a[i].length; j++){
               System.out.println("Enter element at row " + (i+1) + ", column " + (j+1) + ":");
                a[i][j]=scanner.nextInt();
            }
        }
        for(i=0; i<a.length; i++){
            for(j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
                
            }
            System.out.println();
        }
        for(i=0; i<a.length; i++){
            for(j=0; j<a[i].length; j++){
                if(max<a[i][j]){
                    max=a[i][j];
                }
               
            }
        }
        System.out.println("max in 2-d array is: "+ max);
        

    }
}