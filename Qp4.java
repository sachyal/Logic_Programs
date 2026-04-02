public class Qp4{
    public static void main(String args[]){
        System.out.println("solving pattern left side rverse counting 5 rows 5 columns");
        int i , j , k;
       for(i=1; i<=5; i++){
        for(j=1; j<=5; j++){
            System.out.print("");
        }
        for(k=5; k>=i; k--){
            System.out.print(k);
        }
        System.out.println();
       }
    }
}