public class Q7p{
    public static void main(String args[]){
        System.out.println("its a paterrn queston,5 rows,5col");
        int i,j, k;
        for(i=5; i>=1; i--){
           // System.out.print("");
            for(j=1; j<=5; j++){
                System.out.print("");
            }
            for(k=5; k>=i;k--){
            System.out.print(k);}
            System.out.println();
        }
    }
}