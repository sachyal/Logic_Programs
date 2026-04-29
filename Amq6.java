import java.util.Arrays;
import java.util.Scanner;
public class Amq6{
    static int maxasci(String a[]){
        int m=0;
        int i;
        char max='a';
        for(i=0; i<a.length; i++){
            String temp=a[i];
            int j;
            for(j=0; j<temp.length(); j++){
                char x=temp.charAt(j);
                if(x>='A' && x<='Z'){
                    x=(char)(x+32);

                }
                if(max<x){
                    max=x;
                }
               m=max;


            }
            
        }
       
       return m;
    }
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        System.out.println("WAM that will take string as argument and return character max asci value");
        String a[]=new String[3];
        int i,j;
        System.out.println("enter string array");
        for(i=0; i<a.length; i++){
           a[i]=scanner.nextLine();
            }
        System.out.println(Arrays.toString(a));
        
        int  m=maxasci(a);
        System.out.println( "max character asci value: " + m);
    }
    
}