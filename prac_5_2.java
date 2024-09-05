
import java.util.Scanner;


public class prac_5_2 {
    public static void main(String[] args) {
        int a,b,c,x;
        String str;
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

    try{

        try {
            System.out.print("Enter the value of a: ");
            a = sc.nextInt();

            System.out.print("Enter the value of b: ");
            b = sc.nextInt();
            
            x=a/b;
        } 
        catch (ArithmeticException X) {
            System.out.println("Invalid division");
            System.out.println(X.getMessage());
        }

        try {
            System.out.println("Enter one Integer: ");
            c=sc.nextInt();
        } catch (Exception D) {
            System.out.println("Invalid Input: "+ D);
        }

        try {
        System.out.println("the 5th element of the array: + arr[5]");
        } 
    
        catch (Exception S) {
        System.out.println("Index is invalid: " + S);
        }


}
    catch(Exception e) {
        System.out.println("Exception encountered..");
    }

    finally {
        System.out.println("Exception handling completed...");
    }
    }
}
