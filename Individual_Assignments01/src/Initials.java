// Below this comment: import the Scanner
import java.util.Scanner;


public class Initials {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
	   Scanner in = new Scanner(System.in);
            
      // Below this comment: declare any other variables you may need
      
      
      // Below this comment: collect the required inputs
      System.out.print("Enter name : ");
      String fullName = in.nextLine();
      
      // Below this comment: call your required method
      String initialsOnly = nameToInitials(fullName);
      
      // Below this comment: display the required results
      System.out.printf("Initials for %s : %s", fullName, initialsOnly);
      
      
      in.close();
   }
   
   // define your required method here below
   public static String nameToInitials(String fullName)
   {
	   String remainingName = fullName;
	   
	   String firstName = "";
	   String middleName = "";
	   String lastName = "";
	   
	   
	   
	   
	   /* 
	   
	   Count the total number of spaces, keep track of how many there are/are not
	  
	  
	   If No space:
	   		First name only need be saved
	   		
	   If One Space:
	  		First AND Last name need be saved
	   
	   If Two Spaces:
	   		First, Middle, AND Last name need be saved
	   
	   
	   
	   */
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   return fullName;
   }
   
}
