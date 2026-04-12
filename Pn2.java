import java.util.Scanner;
public class Pn2{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("prime no. b/w two numbers");
        int a ,i , j,b;
        
        a=scanner.nextInt();
        b=scanner.nextInt();
        for(i=a; i<=b; i++){
            boolean prime=true;
            for(j=2; j<=i/2; j++){
                if(i%j==0){
                    prime=false;
                  break;
                }
            }
            if(prime){
            System.out.println("prime number b/w them is "+ i);
        }
        }
        
}
}