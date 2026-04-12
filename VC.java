import java.util.Scanner;
public class VC{
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        String name; 
        String str="";
        System.out.println("Enter your name");
        name=scanner.nextLine();
        int l=name.length();
        int i;
        for(i=0; i<l; i++){
            char x=name.charAt(i);
            if(x=='A' || x=='a' || x=='E' || x=='e' || x=='I' || x=='i' || x=='O' || x=='o' || x=='U' || x=='u'){
                str = str + x;
                System.out.println(str);
            }
        }
        System.out.println(str);
          
    }
}