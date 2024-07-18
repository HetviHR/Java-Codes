import java.util.*;
public class prac_3_3 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
            e1.get();
            e1.set();
            System.out.print("Salary after raising 10% is: ");
            double r1= e1.raise(10);
            System.out.println(r1);
            System.out.println("Yearly salary is: " + r1*12);
            e2.get();
            e2.set();
            System.out.print("Salary after raising 10% is: ");
            double r2= e2.raise(10);
            System.out.println(r2);
            System.out.println("Yearly salary is: " + r2*12);
            System.out.println("This Practical is made by 23CS081-Hetvi Radadiya");
    }
}


class  Employee{
        String firstName,lastName;
        double m_salary;

    public void get(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Name: ");
        firstName = sc.nextLine();
        System.out.print("Enter the Last Name: ");
        lastName = sc.nextLine();
        System.out.print("Enter Monthly Salary: ");
        m_salary = sc.nextDouble();
    }

    public void set(){
        if (m_salary < 0) {
            m_salary = 0.0;
        }
        System.out.println("First Name is: " + firstName);
        System.out.println("Last Name is: " + lastName);
        System.out.println("Yearly Salary is: " + m_salary*12);
    }

    public double raise(double percentage){
        m_salary += percentage/100*m_salary;
        return m_salary;
    }

}