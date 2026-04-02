import java.util.Scanner;
public class SQ{
    public static void main(String args[]){
        System.out.println("Switch case program enter 1  to 5 counting represent best places to travel");
        Scanner scanner=new Scanner(System.in);
        int a ;
        a=scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("kerla");
                
                break;
            case 2: 
            System.out.println("noth-east");
                  break;
            case 3:
                System.out.println("Rajisthan");
                break;
            case 4:
                System.out.println("Andman Nicobar island");
                break;
            case 5:
                System.out.println("Bihar");
                break;
                
            default:
                System.out.println("enter valid value only");
                break;
        }
        scanner.close();


    }
}