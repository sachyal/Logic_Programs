import java.util.Scanner;
public class Char{
    static void vowel(char x){
        if(x=='A' || x=='a' || x=='E' || x=='e' || x=='I' || x=='i' || x=='O' || x=='o' || x=='U' || x=='u'){
            System.out.println("its a vowel");
            
        }
        else {
            System.out.println("its not a vowel");
            
        }
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter alphabet to check its vowel or not");
        char x ;
        x=scanner.next().charAt(0);
          vowel(x);
        //System.out.print("its a vowel "+ b);
    }
}