import java.util.Scanner;
public class A2d{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int a[][]=new int [3][3];
        int trans[][]=new int [3][3];
        int i,j; 
        int r1=0; int r2=0; int r3=0;
        int c1=0; int c2=0; int c3=0; 
        int d=0;
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
            r1=r1+a[0][i];
            r2=r2+a[1][i];
            r3=r3+a[2][i];
            c1=c1+a[i][0];
            c2=c2+a[i][1];
            c3=c3+a[i][2];
            d=d+a[i][i];

        }
    System.out.println("row1, row2, row3 : " + r1 +" "+ r2+ " " + r3 );
      System.out.println("col1, col2, col3 : " + c1 +" "+ c2+ " " + c3 );
      System.out.println("diagonal sum: "+ d);
      for(i=0; i<a.length; i++){
        for(j=0; j<a[i].length; j++){
            trans[j][i]=a[i][j];
        }
      }
      System.out.println("transpose matrix");

       for(j=0; j<trans.length; j++){
            for(i=0; i<trans[j].length; i++){
                System.out.print(trans[j][i]+" ");
                
            }
            System.out.println();
        }

        

    }
}