package allprg;
//Custom exception class for division by zero
class DivisionByZeroException extends Exception {
 public DivisionByZeroException(String message) {
     super(message);
 }
}

//Main class
public class DivisionByZeroDemo {
 public static void main(String[] args) {
     try {
         // Attempt to perform division
         int result = performDivision(10, 0);
         System.out.println("Result of division: " + result);
     } catch (DivisionByZeroException e) {
         // Catch the custom exception for division by zero
         System.out.println("Error: " + e.getMessage());
     } finally {
         // This block will be executed regardless of whether an exception occurred or not
         System.out.println("Finally block executed");
     }
 }

 // Method that performs division and throws custom exception for division by zero
 private static int performDivision(int numerator, int denominator) throws DivisionByZeroException {
     if (denominator == 0) {
         // Throw the custom exception if division by zero is detected
         throw new DivisionByZeroException("Division by zero is not allowed");
     }
     return numerator / denominator;
 }
}
