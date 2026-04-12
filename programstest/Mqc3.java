package programstest;
import java.util.Scanner;

public class Mqc3 {
    static char revchar(char a){
        if(a>='A' && a<='Z'){
            int c=a + 32;
            char d=(char)c;
            return d;
        }
        else{
            if(a>='a' && a<='z'){
                int e=a-32;
                char f=(char)e;
                return f;
            }
        }
        return a;
    } 
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        char a;
        System.out.print("enter your CC value ");
        a=scanner.next().charAt(0);
        char b=revchar(a);
        System.out.println(b);
    }
    
}
