public class Qp10{
    public static void main(String args[]){
        System.out.println("solving pattern");{
            int i,j,k;
            for(i=1; i<=4; i++){
                for(j=1; j<=4; j++){
                    System.out.print("");
                }
                for(k=1; k<=i+1; k++){
                    System.out.print(k);

                }
                System.out.println();
            }
        }
    }
}