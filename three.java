  import java.util.Scanner;
public class three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 3 intergers with different values");
        int num1, num2, num3 ;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        if ( num1 > num2) {
            if (num1 > num3){
            
            System.out.println("num1 is largest " + num1); 
        }
             }
             
        else {
            if ( num2 > num3) {
                System.out.println("num2 is largest " + num2);
                }
                else {
                    System.out.println("num3 is the largest " + num3);
                }
        }
        
        }
        
        
        

    }
