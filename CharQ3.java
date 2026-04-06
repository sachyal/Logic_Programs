import java.util.Scanner;
public class CharQ3{
    static char vowel(char x){
        if(x=='A' || x=='a' || x=='E' || x=='e' || x=='I' || x=='i' || x=='O' || x=='o' || x=='U' || x=='u'){
            return 1;
            
        }
        else {
            return 0;
            
        }
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("to check if its vowel then return 1 or 0");
        char x ;
        int b;
        x=scanner.next().charAt(0);
          b=vowel(x);
      System.out.print(b);
    }
}