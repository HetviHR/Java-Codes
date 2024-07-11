import java.util.Scanner;

public class prac_2_7 {
    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String: ");
        str = sc.nextLine();
        System.out.println("Length of the String is: " + str.length());
        System.out.println(str.replace('H','N'));
        System.out.println("Uppercase of the String is: "+ str.toUpperCase());
        System.out.println(str.substring(0, 8));
        System.out.println("This Practical is made by Hetvi Radaiya - 23CS081");
    }
}
