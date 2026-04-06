import java.util.Scanner;
public class Mq9{
    static int aver(int a, int b, int c){
        int e ,f;
        e=a +b +c;
        f=e/3;
        return f;

    }
    public static void main(String args[]){
        System.out.println("computer average of three integers");
        Scanner scanner = new Scanner(System.in);
        int d, a , b, c;
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        d=aver(a,b,c);
        System.out.println(d);

    }
}