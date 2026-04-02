public class Qp3{
    public static void main(String args[]){
        System.out.println("solving pattern question");{
            int i , j , k;
            for(i=1; i<=5; i++){
                for(j=1;j<=5; j++){
                    System.out.print(" ");
                }
                for(k=1; k<=i; k++){
                    System.out.print(6-k);
                }
                System.out.println();

            }
        }
    }
}