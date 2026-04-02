package TestQuestions;

public class Tq10 {
    public static void main(String args[]){
        System.out.println("Pattern question");
        int i , j , k,l;
        //k=5;
        
        for(i=5; i>=1; i--){
            for(j=2*5-i;j>i; j--){
                System.out.print(" ");
            }
            for(j=i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println(); }
           
    }
    
}
