
import java.util.Scanner;

public class prac_3_4 {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.get();
        d1.set();
        d1.displayDate();
        System.out.println("This Practical is made by 23CS081-Hetvi Radadiya");
    }
}

/**
 * Date
 */
    class Date {
        Scanner sc = new Scanner(System.in);
        int month,day,year;


    public void get()
    {
        System.out.print("Enter The Day: ");
        day = sc.nextInt();
        System.out.print("Enter The Month: ");
        month = sc.nextInt();
        System.out.print("Enter The Year: ");
        year = sc.nextInt();
    }

    public void set(){
        System.out.println("The Month is " + month);
        System.out.println("The Day is " + day);
        System.out.println("The year is " + year);
    }


    public void displayDate()
    {
        System.out.println(month + " / " + day  + " / " + year);
    }



}