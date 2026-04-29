import java.util.Scanner;
public class Amq4{
    static int sum(int a[][]){
        int r1sum=0;
        for(int j=0; j<a[0].length; j++){
               r1sum = r1sum+ a[0][j];
               }
        return r1sum;
           
    }
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        System.out.println("WAM 2d array as argument and return sum of all 1st row elements");
        int a[][]=new int[2][3];
        int i,j;
        System.out.println("enter int array");
        for(i=0; i<a.length; i++){
            for(j=0; j<a[i].length; j++){
            a[i][j]=scanner.nextInt();
            }

        }
        System.out.println(java.util.Arrays.deepToString(a));
        
        int  s=sum(a);
        System.out.println( "sum of all elements in 1strow in 2d  array: " + s);
    }
    
}