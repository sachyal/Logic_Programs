import java.util.Scanner;
public class A2dq2{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int a[][]=new int [3][3];
        int i,j;
        int c=0;
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
                int p=a[i][j];
                int k;
                int l= 0;;

                for(k=p; k>0; k=k/10){
                    l= l*10 + k%10;
                    

                }
                if(l==p){
                    c=c+1;
                }
            }
        }
        System.out.println("count of palindrome is: "+ c);
        

    }
}