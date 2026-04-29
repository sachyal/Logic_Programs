import java.util.Scanner;
import java.util.Arrays;
public class Seriesq7{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("long program");
        int n; String name []; int rolln []; float prnt []; int i;
        System.out.println(" enter no. of students you want to add. in record: ");
        n = scanner.nextInt();
        name = new String[n];
        rolln = new int[n];
        prnt = new float[n];
        for(i=0; i<n; i++){
          System.out.print(" enter roll no. ");
          rolln[i]=scanner.nextInt();
          System.out.print("enter name: ");
          scanner.nextLine();
          name[i]=scanner.nextLine();
          System.out.print("enter percentage: ");
          prnt[i]=scanner.nextFloat();
         }
         int j=1;
         while( j<=5){
            System.out.println("enter any value 1 to 5 for operations and 6 for exit");
         char x = scanner.next().charAt(0);

         switch (x) {
            case '1':
                  System.out.print("enter rollno for search by rollno.: ");
                  int rl;
                  rl=scanner.nextInt();
                  boolean found = false;
                    for (i = 0; i < n; i++) {
                        if (rl == rolln[i]) {
                            System.out.println(rolln[i]);
                            System.out.println(name[i]);
                            System.out.println(prnt[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("enter correct rollno.");
                    }
                
                break;
            case '2':
                 System.out.print("enter name for search by name: ");
                  String nm;
                  nm=scanner.nextLine();
                  for(i=0; i<n; i++){
                    if(nm.equals(name[i])){
                        System.out.println(rolln[i]);
                         System.out.println(name[i]);
                          System.out.println(prnt[i]);

                    }
                    else{
                        System.out.println("enter correct name in correct order");
                    }
                  }
                
                break; 
            case '3': 
                    System.out.print("all the records of data till: " + n);
                        System.out.print(Arrays.toString(rolln));
                         System.out.print(Arrays.toString(name));
                          System.out.print(Arrays.toString(prnt));
                
                break;
            case '4': 
               System.out.println("Record of topper Student");
               Float top= prnt[0]; int index=0;
                 for(i=0; i<n; i++){
                    if(top<prnt[i]){
                        top=prnt[i];
                        index=i;
                    }
                    

                 }
                 System.out.println(top);
                 System.out.println(name[index]);
                 System.out.println(rolln[index]);

                
                break;
            case '5':
                 System.out.println("Record of Students who got more than 50%");
               Float ft=50.0f; 
                 for(i=0; i<n; i++){
                    if(ft<prnt[i]){
                        System.out.println(rolln[i]);
                         System.out.println(name[i]);
                          System.out.println(prnt[i]);
                       
                    }
                    

                 }
                break;
           
         }
         System.out.println(" for exit press 6 and continue to 1 to 5: ");
         j=scanner.nextInt();
        }

    }
}