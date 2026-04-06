import java.util.Scanner;
public class Mqr7{
    static int digits(int a){
        int i,c;
        c=0;
        for(i=a; i>0; i=i/10){
            c=c+1;

        }
        return c;
        
        
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int a,d;
        a=scanner.nextInt();
        d=digits(a);
        System.out.println("this number has :"+ d);
    }
}