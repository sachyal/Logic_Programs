import java.util.Scanner;
public class Mqr5{
    static int maxi(int a,int b,int c){
        if(a>b){
            if(a>c){
                return a;
            }
            else {
                return c;
            }
        }
        else { 
            if(b>c){
            return b;
        }
        else{
            return c;
        }
        }
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int a,b,c,d;
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        d=maxi(a,b,c);
        System.out.println(d);
    }
}