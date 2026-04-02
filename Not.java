import java.io.*;
public class Not{
    public static void main(String args[]){
        boolean knife = true;
        boolean gun = true;
        boolean police = true;
        if (knife && gun){
            System.out.println("you're going to die");
        }
        else {
            if (knife && police){
                System.out.println("you're safe");
            } 
            else {
                if( gun && police){
                System.out.println("Any things can happen"); }
        }
    }
}