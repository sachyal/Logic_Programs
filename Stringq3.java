import java.util.Scanner;
public class Stringq3{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("take a name annd check how many vowels they have");
        String a; 
        int i; 
        char x; 
        int c=0;
        a=scanner.nextLine();
        int l=a.length();
        for(i=0; i<l; i++){
            x=a.charAt(i);
            if(x=='A' || x=='a' || x=='E' || x=='e' || x=='I' || x=='i' || x=='O' || x=='o' || x=='U' || x=='u'){
                c=c+1;
            }
        }
        System.out.println(c);

    }
}