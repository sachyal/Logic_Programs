public class Nestesbreak{
    public static void main(String[] args) {
        System.out.println("continue in nested loop");
        int i,j;
        for(i=1; i<=3; i++){
            for(j=i;j<=3;j++){
                if(j==3){
                    continue;
                   // System.out.println("jai mata di");
                }
                if(i==2){
                   // break;
                }
                System.out.println(i +" "+ j);
            }
        }
    }
}