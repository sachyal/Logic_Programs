public class Nested{
    public static void main(String args[]){
        System.out.println("nested loops");
        int i , j,k ;
        for(i=2; i<=5; i++){
            for(j=i; j<=3; j++){
                System.out.println(i + " "+ j);
                for(k=1; k<=2; k++){
                    System.out.println(i + " "+ j + " "+ k);
                }
            }
            System.out.print("s");
        }
    }
}