public class Continue{
    public static void main(String args[]){
        System.out.println("continue statement");
        int i;
        for (i=1; i<=10; i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }
    }
}