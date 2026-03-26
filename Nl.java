public class Nl{
public static void main(String args[]){
    System.out.println("Nested loop practice ");
    int i,j,k,l;
    for(i=1; i<=2; i++){
        for(j=i; j<=2; j++){
            for(k=i; k<=2; k++){
                for(l=i; l<=2; l++){
                    System.out.println(i +" "+ j+ " "+ k+" "+" "+ l);
                }
            }
        }
    }
}
}