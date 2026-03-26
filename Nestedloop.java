public class Nestedloop{
    public static void main(String args[]){
        System.out.println("nested loop");
        int i, j;
        for(i=1; i<=2; i++){
            for(j=i; j<=2; j++){
                System.out.println(i + " "+ j);
            }
        }
    }
}