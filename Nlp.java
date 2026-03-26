public class Nlp{
    public static void main(String args[]){
        System.out.println("practicing");
        String address="delhi,India";
        if(address.endsWith("India")){
            if(address.contains("Meerut")){
                System.out.println("your city is Meerut");
            }
            else if(address.contains("Noida")){
                System.out.println("your city is Noida");
            }
            else {
                System.out.println(address.split(",") [0]);
            }
        }
        else {
            System.out.println("you're not in India");
        }
    }
}