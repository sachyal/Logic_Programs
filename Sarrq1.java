import java.util.Scanner;
public class Sarrq1{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("take on String arry of size 5 and count how many words are palindrome");
        String a[] = new String[5];
        int i; int c=0;
        for(i=0; i<a.length; i++){
            System.out.print("enter string "+(i+1)+ "");
            a[i]=scanner.nextLine();

        }
     for(i=0; i<a.length; i++){
        String str1="";
        String str2="";
        String temp=a[i];
        int j; int k;
        for(j=0; j<temp.length(); j++){
            char x=temp.charAt(j);
            str1=str1+x;

        }
        for(k=temp.length()-1; k>=0; k--){
            char x=temp.charAt(k);
            str2=str2+x;
        }
        if(str1.equals(str2)){
            c=c+1;
        }
     }
     System.out.println(c);
    }
    }
