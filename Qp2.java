public class Qp2{
    public static void main(String args[]){
        System.out.println("1 pattern in reverse");
        int i , j , k ;
        for(i=1; i<=5; i++){
            for(j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(k=1; k<=i; k++){
            System.out.print(1);
        }
        System.out.println();
        }
    }
}