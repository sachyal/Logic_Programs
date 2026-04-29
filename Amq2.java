import java.util.Scanner;
public class Amq2{
    static float avgminmax(float a[]){
        float avg;
        float max=a[0];
        float min=a[0];
        int i;
        for(i=0; i<a.length; i++){
            if(max<a[i]){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
        }
        avg=max+min;
        return avg/2;
       
    }
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        System.out.println("WAM that take 1 float arry as argument & return avg of its min and max");
        float a[]=new float[5];
        int i;
        System.out.println("enter float array values");
        for(i=0; i<a.length; i++){
            a[i]=scanner.nextFloat();

        }
        
        float c=avgminmax(a);
        System.out.println( "avg of min and max no: " + c);
    }
    
}