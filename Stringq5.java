import java.util.Scanner;
public class Stringq5{
  static int capital(String a){
    int l=a.length();
    int i;
    char x;
    int c=0;
    for(i=0; i<l; i++){
        x=a.charAt(i);
        if(x>='A' && x<='Z'){
            c=c+1;
        }
         System.out.println(x);
    }
    return c;

}
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("take a String annd check how many capital letters they have");
        String a; int b;
        a=scanner.nextLine();
         b=capital(a);
         System.out.println(b);
         scanner.close();


    }
}
