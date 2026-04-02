public class Qp8{
    public static void main(String args[]){
        System.out.println("solving pattern");
        int i , j,k;
        for(i=1; i<=5;i++){
            for(j=1; j<=5-i; j++){
                System.out.print("1");
             }
             for(k=1; k<=5-i; k++ ){
                System.out.print("0");
             }
            System.out.println();
        }
    }
}