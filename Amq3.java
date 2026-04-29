import java.util.Scanner;
public class Amq3{
    static int count(String a[]){
        int i;
        int c=0;
        for(i=0; i<a.length; i++){
            String temp=a[i];
            int j;
            for(j=0; j<temp.length(); j++){
                char x =temp.charAt(j);
                if(x=='A' || x=='a' || x=='E' || x=='e' || x=='I' || x=='i' || x=='O' || x=='o' || x=='U' || x=='u' ){
                    c=c+1;
                }

            }


        }
    
    return c;   
    }
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter a string and return total no. vowels");
        String a[]=new String[5];
        int i;
        System.out.println("enter String array");
        for(i=0; i<a.length; i++){
            a[i]=scanner.nextLine();

        }
        
        int  c=count(a);
        System.out.println( "count of vowels in String array: " + c);
    }
    
}