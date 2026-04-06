import java.util.Scanner;
public class Stringq1{
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        String name;
        int l,i;
        System.out.println("enter your name");
        name=scanner.nextLine();
        l=name.length();
        System.out.println(l);
         char c;

         for(i=0; i<=l; i++){
            c=name.charAt(i);
            System.out.println(c);
         }


    }
}