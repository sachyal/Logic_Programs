import java.util.Scanner;
public class Mqr4{
    static int even(int a){
        if(a%2==0){
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int a,c;
        a=scanner.nextInt();
        c=even(a);
        System.out.println(c);
    }
}