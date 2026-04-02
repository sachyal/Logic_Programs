public class Qp9{
    public static void main(String args[]){
        System.out.println("solving pattern");
        int i , j;
        for(i=1; i<=5; i++){
            for(j=1; j<=5-i; j++){
                System.out.print(" ");

            }
            for(j=1; j<=2*i-1; j++){
                System.out.print("1");
            }
            System.out.println();        }
    }
}