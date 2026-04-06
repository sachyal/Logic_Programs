import java.util.Scanner;
public class Mqr8{
    static int digits(int a){
        int i,c,r;
        r=0;
        c=0;
        for(i=a; i>0; i=i/10){
          c=i%10;
          r=r*10+c;
        }
        return r;
        
        
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int a,d;
        a=scanner.nextInt();
        d=digits(a);
        System.out.println("its reverse is :"+ d);
    }
}