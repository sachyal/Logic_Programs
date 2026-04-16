import java.util.Scanner;
public class Saq1{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("take one string array and rever its character capital to small, small to capital");
        String arr1[]=new String[5];
        String arr2[]=new String[5];
        int i;
        for(i=0; i<arr1.length; i++){
            System.out.print("enter string"+ (i+1)+ ": ");
            arr1[i]=scanner.nextLine();
        }
        System.out.println(arr1);
        for(i=0; i<arr1.length; i++){
            String str="";
            String temp=arr1[i];
            int j;

            for(j=0; j<temp.length(); j++){
                char x=temp.charAt(j);
                if(x>='A' && x<='Z'){
                    x=(char)(x+32);
                }
                else if(x>='a' && x<='z'){
                    x=(char)(x-32);
                }
                str=str+x;

            }
            System.out.print(str + "");
             arr2[i]=str;
        }
         System.out.println(java.util.Arrays.toString(arr1));
          System.out.println(java.util.Arrays.toString(arr2));
    }
}