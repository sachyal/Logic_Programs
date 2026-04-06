import java.util.Scanner;
public class Mqr6{
    static int fact(int a){
        int  i, f;
        f=1;
        for(i=a; i>=1; i--){
            f=f*i;
        }
        return f;
        
        
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int a,d;
        a=scanner.nextInt();
        d=fact(a);
        System.out.println(d);
    }
}