import java.util.Scanner;
public class Scc{
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        String str;
        String nstr="";
        System.out.println("Enter you string value");
        str=scanner.nextLine();
        int l=str.length();
        int i,j;
        for(i=0; i<l; i++){
            boolean found=false;
            char x=str.charAt(i);
            for(j=0; j<nstr.length(); j++){
                char y=nstr.charAt(j);
                if(x==y){
                    found = true;
                    break;
                }
            }
            if(!found){
                nstr=nstr+ x;
            }
            
        }
        
        System.out.println(nstr);
    }
}