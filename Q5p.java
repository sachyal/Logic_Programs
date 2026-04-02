import java.util.Scanner;
public class Q5p{
    public static void main(String args[]){
        System.out.println("take one integer from keyboard and check its palidrome or not");
        Scanner scanner=new Scanner(System.in);
        int a,i,s,b;
        System.out.println("enter a value");
        a=scanner.nextInt();
        b=0;
        for(i=a; i>0; i=i/10){
            s=i%10;
            b=b*10+s;
        }
        if(b==a){
            System.out.println("its a palidrome no.");
        }
        else {
            System.out.println("its not a palidrome no.");
        }
        
}
}