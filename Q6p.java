import java.util.Scanner;
public class Q6p{
    public static void main(String args[]){
        System.out.println("print average of all even digit of a given number");
        Scanner scanner=new Scanner(System.in);
        int a,i,s,b,c,avg;
        s=0;
        c=0;
        System.out.println("enter a value");
        a=scanner.nextInt();
        for(i=a; i>0; i=i/10){
            b=i%10;
            if(b%2==0){
                s=s +b;
                c=c+1;
            }
        }
        avg=s/c;
        System.out.println(avg);
        
}
}