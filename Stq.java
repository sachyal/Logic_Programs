import java.util.Scanner;
public class Stq{
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        System.out.println("remove duplicate characters from String");
        String str;
        String nstr="";

        System.out.println("given your wanted String");
        str=scanner.nextLine();
        int l =str.length();
        int i,j;
    
    for(i=0; i<l; i++){
    char x = str.charAt(i);
    boolean found = false;
    for(int k = 0; k < nstr.length(); k++){
        if(nstr.charAt(k) == x){
            found = true;
            break;
        }
    }
    if(!found){
        nstr += x;
    }
}
System.out.println(nstr);
         }
}