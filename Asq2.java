import java.util.Scanner;
public class Asq2{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("name from k.b and convert its small letters to capital and capital letters to small leters");
        String a;
        System.out.println("enter your name");
        a=scanner.nextLine();
        int l=a.length();
        int i;
        String str1="";
        for(i=0; i<l; i++){
    char x = a.charAt(i);
    if(x >= 'a' && x <= 'z'){
        x = (char)(x - 32);
    } else if(x >= 'A' && x <= 'Z'){
        x = (char)(x + 32);
    }
    str1 = str1+ x;
}
System.out.println("name character in reverse: " + str1);
        
    }
}