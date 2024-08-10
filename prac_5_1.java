import java.util.*;

public class prac_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the value of x: ");
            int x = sc.nextInt();

            System.out.print("Enter the value of y: ");
            int y = sc.nextInt();

            // Check if y is zero
            if (y == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            // Compute x/y
            double result =  x /  y;
            System.out.println("Result of x/y: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Exception occurred: " + e.getMessage());
        }

        catch (InputMismatchException e) {
            System.err.println("Enter only integer values ");
        }

        catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
        
        sc.close();
    }
}


