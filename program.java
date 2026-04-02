import java.util.Scanner;
public class program{
    public static void main(String args[]){
        System.out.println("give value first then power");
        Scanner scanner=new Scanner(System.in);
        int a,b,i,v;
        v=1;
        a=scanner.nextInt();
        b=scanner.nextInt();
        i=1;
        do{
            v=v*a;
            i++;
        }while(i<=b);

        System.out.println(v);
    }
}