import java.util.Scanner;
public class Sscq1{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("take on string and one string array check if string present in string array or not");
        String str1;
        System.out.println("enter str 1");
        str1=scanner.nextLine();
        String arr[]= new String [5];
        int l=arr.length;
        int i;
        System.out.println("enter string array values");
        for(i=0; i<l; i++){
             System.out.println("string :" + (i+1));
            arr[i]=scanner.nextLine();
            }
        
        boolean avail=false;
        for(i=0; i<l; i++){
            String x=arr[i];
            if(x.equals(str1)){
                avail=true;
                

            }
        }
        
        if(avail){
            System.out.println("string 1 available in array" + str1);
        }
        else{
            System.out.println("not available");
        }

    }
}