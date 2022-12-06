import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanInput = new Scanner(System.in);
      boolean stop = false;
      while (stop == false){
        try {
            
            String fileName = "";

            System.out.print("Enter file name: ");
            fileName = scanInput.next();
            

            Subject mySub = new Subject(fileName);
          
            System.out.println();
          System.out.println("The " + mySub.getClassName() + " class roster is: "); 
          // iterating through roster w/ enhanced for loop
            for (String x: mySub.getRoster()){
            System.out.println(x); 
          }
          System.out.println(); 
          // printing grade average w/ class name 
            System.out.println("The average of all grades in " + mySub.getClassName() + " is " + mySub.getAvgGrade() + ".");

          // asking if they would like to read another file
          System.out.println(); 
          System.out.println("Would you like to read another file?"); 
        System.out.println("Type 1 for yes."); 
          System.out.println("Type 2 for no."); 

      int answer = scanInput.nextInt(); 
     
        
      if (answer == 1){
   stop = false; 
      } else {
        stop = true; 
          
        }

        
      }
      
         
       catch (Exception e) {
            System.out.println("Error " + e);
        }
      
    }
}}