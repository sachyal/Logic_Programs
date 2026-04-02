public class Qp7{
    public static void main(String args[]){
        System.out.println("solving pattern question");
        int i , j;
        for(i=1;i<=4; i++){
            for(j=1; j<=4; j++){
                if(i%2==0){
                    System.out.print(0);
                }
                else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }

    }
}