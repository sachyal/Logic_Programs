import java.util.Scanner;
public class Soq1{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("sorting array question");
        int a[]=new int[5];
        int i;int c, j;
        System.out.println("give array int size 5");
        for(i=0; i<a.length; i++){
        a[i]=scanner.nextInt();
         
        }

        for(i=0; i<a.length; i++){
            for(j=i+1; j<a.length; j++){
                if(a[i]<a[j]){
                    c=a[i];
                    a[i]=a[j];
                    a[j]=c;

                }
            }
        }
        System.out.println("String after sorting");
        for(i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
    }
}