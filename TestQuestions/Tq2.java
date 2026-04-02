package TestQuestions;
import java.util.Scanner;

public  class Tq2 {
    public static void main(String args[]){
        System.out.println("Take selling price and cost price and check if shopkeeper got profit,loss or no profit now loss, also percentage of profit and loss");
        Scanner scanner = new Scanner(System.in);
        float c , s ,p ;
        p =100;
        System.out.println("Enter cost price");
        c = scanner.nextInt();
        System.out.println("Enter selling price");
        s = scanner.nextInt();
        if(c==s){
            System.out.println("Selling and cost price are so no profit and nor loss.");
        }
        
       else if(c>s){
            System.out.println("shopkeeper getting loss.");
            p=p * c/s;
            System.out.println("he getting loss of "+ p + "%"); }
            else{
                System.out.println("shopkeer getting profit.");
                p=p * s/c;
                System.out.println("shopkeeper getting profit of " + p + "%");
            }
        
    }
    
}
