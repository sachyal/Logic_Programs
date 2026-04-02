public class Q9p{
    public static void main(String args[]){
        System.out.println("patter question,5 rows, 5 cls");
        int i,j,k;
        for(i=1; i<=5; i++){
            for(j=5; j>=1; j--){
                System.out.print("");
            }
            for(k=1; k<=6-i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}