import java.util.Arrays;
import java.util.Scanner;

public class prac_2_6 {
    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String: ");
        str = sc.nextLine();
        System.out.println("Length of the String is: " + str.length());
        System.out.println("Lowercase of the String is: "+ str.toLowerCase());
        System.out.println("Uppercase of the String is: "+ str.toUpperCase());


        StringBuilder ch = new StringBuilder(str);
        ch = ch.reverse();
        String a =   ch.toString();
        System.out.println("Reversed String is: " + a);

        char[] ch2 = str.toCharArray();
     Arrays.sort(ch2);
    System.out.println("Sorted String is : "+Arrays.toString(ch2));
    System.out.println("This Practical is made by Hetvi Radaiya - 23CS081");
    }   
}
