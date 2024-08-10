import java.util.*;

//interface shapes created
interface Shapes
{
    void input(Scanner s);
    void output();
}


//create Class signs
class signs
{
    
    double area;
    String color,text;
    public void get(Scanner sc)
    {
    System.out.print("Enter color:: ");
    color = sc.nextLine();
    System.out.print("Text:: ");
    text=sc.nextLine();
    //sc1.close();
    }
}
//created class Cirles that inherits signs and implements Shapes
class Circles extends signs implements Shapes{
    double r;
    //input function for circles
    @Override
    public void input(Scanner sc)
    {
        System.out.print("Enter Radius: ");
        r = sc.nextDouble();
        area = 3.14*r*r;
       // sc.close();
    }
    //output method of circle
    @Override
    public void output()
    {
        System.out.println("CIRCLE");
        System.out.println("Text: " + text);
        System.out.println("Color: " + color);
        System.out.println("Radius " + r);
        System.out.println("Area: " + area);
    }
    
}

//created class Cirles that inherits signs and implements Shapes
class Rectangles extends signs implements Shapes
{
    double l,b;
    @Override
    public void input(Scanner sc)
    {
    {
        System.out.print("Enter Length: ");
        l = sc.nextDouble();
        System.out.print("Enter Breadth: ");
        b = sc.nextDouble();
        area = l*b;
    }
    }
    @Override
    public void output()
    {
        System.out.println("RECTANGLE");
        System.out.println("Text: " + text);
        System.out.println("Color: " + color);
        System.out.println("Length: " + l);
        System.out.println("Breadth: " + b);
        System.out.println("Area: " + area);
    }
}
public class prac_4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("1. Cirle 2. Rectangle");
        System.out.println("Enter your Choice: ");
        n= sc.nextInt();
        //switch case for both
        
        switch (n) {
            case 1:
                Circles c = new Circles();
                    c.get(sc);
                    c.input(sc);
                    c.output();
                break;

            case 2:
                Rectangles r = new Rectangles();
                    r.get(sc);
                    r.input(sc);
                    r.output();
                break;
        
            default:
            System.out.println("Invalid choice");
            break;
        }
    sc.close();
    }
}
