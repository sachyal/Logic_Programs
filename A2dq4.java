import java.util.Scanner;
public class A2dq4{
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
        int maxr1=a[0][0];
        int maxr2=a[0][0];
        int maxr3=a[0][0];
        int maxc1=a[0][0];
        int maxc2=a[0][0];
        int maxc3=a[0][0];
        for(i=0; i<a.length; i++){
            for(j=0; j<a[i].length; j++){
                if(maxr1<a[0][j]){
                    maxr1=a[0][j];
                }
                if(maxr2<a[1][j]){
                    maxr2=a[1][j];
                }
                if(maxr3<a[2][j]){
                    maxr3=a[2][j];
                }
                 }
                 if(maxc1<a[i][0]){
                    maxc1=a[i][0];
                }
                if(maxc2<a[i][1]){
                    maxc2=a[i][1];
                }
                if(maxc3<a[i][2]){
                    maxc3=a[i][2];
                }
       
        

    }
     System.out.println("maxr1 in 2-d array is: "+ maxr1);
     System.out.println("maxr2 in 2-d array is: "+ maxr2);
     System.out.println("maxr3 in 2-d array is: "+ maxr3);
     System.out.println("maxc1 in 2-d array is: "+ maxc1);
     System.out.println("maxc2 in 2-d array is: "+ maxc2);
     System.out.println("maxc3 in 2-d array is: "+ maxc3);
}}