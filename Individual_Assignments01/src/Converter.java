import java.util.Scanner;

public class Converter {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
	  Scanner in = new Scanner(System.in);
      
      
      // Below this comment: declare any other variables you may need
      // to store the user's input and the Feet and Inches equivalent value
      System.out.print("Enter distance in Meters : ");
	  float meters = in.nextFloat();
	  
	  
      // Below this comment: collect the required inputs
      
      
      // Below this comment: call your MetersToFeetAndInches method
      String message = MetersToFeetAndInches(meters);
      
      // Below this comment: display the required results
      System.out.printf("%.2f meters in Feet and Inches is : ", meters);
      System.out.println(message);
      
	  in.close();
   }
   
   // define your MetersToFeetAndInches method here below
   public static String MetersToFeetAndInches(float Meters)
   {
	   float meters = Meters;
	   
	   float totalInches = (float) (meters * 39.37);
	   int feet = (int) (totalInches / 12);
	   float inches = totalInches % 12;
	  
	   
//	   System.out.println(feet);
//	   System.out.println(inches);
	   
	   String strFeet = String.valueOf(feet);
	   String strInches = String.format("%.2f", inches);
	   

	   String message = new String(strFeet + "' " + strInches + "\"");
	   
	   return message; 
   }
   
}