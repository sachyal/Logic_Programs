package programstest;
import java.util.Scanner;


public class Q4 {
    public static void main(String args[]){
        System.out.println("name from keyboard and concat its vowels ino another String object");
        String name ; 
        String v;
        char x;
        v="";
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter your name");
        name=scanner.nextLine();
        int l=name.length();
        int i;
        for(i=0; i<l; i++){
            x=name.charAt(i);
            if(x=='A' || x=='a' || x=='E'|| x=='e' || x=='I' || x=='i' || x=='O' || x=='o' || x=='U' || x=='u'){
                v=v+x;
            }
        }
        System.out.println(v);
    }
    
}
