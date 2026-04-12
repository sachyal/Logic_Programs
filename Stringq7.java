import java.util.Scanner;
public class Stringq7{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String a , b;
        System.out.println("b/n two strings check which one is longer, a or b");
        a=scanner.nextLine();
        b=scanner.nextLine(); 
        int al=a.length();
        int bl=b.length();
        if(al>bl){
            System.out.println("String a has bigger length " + al);
        }
        else if(bl>al){
            System.out.println("String b has bigger length " + bl);
        }
        else{
            if(al==bl){
                System.out.println("both have equal length");
            }
        
        }
    }
}