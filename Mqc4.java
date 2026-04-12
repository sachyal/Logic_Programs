import java.util.Scanner;
public class Mqc4{
    static char revalph(char a){
          if(a>='A' && a<='Z'){
            int i=a+32;
            char c=(char)i;
            return c;
          }
          if(a>='a' && a<='z'){
            int j=a-32;
            char d=(char)j;
            return d;
          }
          return a;
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        char a ;
        System.out.println("enter  CC value");
        a=scanner.next().charAt(0);
        char b=revalph(a);
        System.out.println(b);
    }
}