
import java.util.Scanner;

public class prac_3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of Rectangle: ");
        int breadth = sc.nextInt();

        Area r = new Area(length,breadth);
        System.out.println("The area of the rectangle is: " + r.returnArea() );
        System.out.println("This Practical is made by 23CS081-Hetvi Radadiya");

    }
}

class Area{

    int length,breadth;
    public Area()
    {
        length=10;
        breadth = 15;
    }

    //perameterized constructor
    public Area(int l,int b)
    {
        length = l;
        breadth = b;
    }

    //returnArea Function to return the are of rectangle
    public int returnArea()
    {
            return length*breadth;
    }
}