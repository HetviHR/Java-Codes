
import java.util.Scanner;



public class prac_4_2 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Manager m1 = new Manager();
        System.out.println("********************** Enter the Data for Employee **********************");
        e1.getData();
        e1.putSpecializaion();



        System.out.println("********************** Enter the Data for Manager **********************");
        m1.getData();
        m1.putDeparrtment();
        

        System.out.println("------------PRINTING THE DATA OF EMPLOYEE-----------");
        e1.putData();
        e1.printSalary();
        System.out.println("Specialization for Employee is " + e1.getSpecialization());

        System.out.println("------------PRINTING THE DATA OF MANAGER-----------");
        m1.putData();
        m1.printSalary();
        System.out.println("Department for Manager is " + m1.getDepartment());
        System.out.println("\nThis Practical is made by Hetvi Radaiya - 23CS081");

    }
}

class Member{
    Scanner sc = new Scanner(System.in);
    String Name;
    int Age;
    long Phone_no;
    String Address;
    double Salary;

    //scan data from keyboard
    public void getData(){
        System.out.print("Enter the Name: ");
        Name = sc.nextLine();
        System.out.print("Enter the Age: ");
        Age = sc.nextInt();
        System.out.print("Enter the Phone Number: ");
        Phone_no = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter the Address: ");
        Address = sc.nextLine();
        System.out.print("Enter the Salary: ");
        Salary = sc.nextDouble();
    }
    //print salary functon
    public void printSalary(){
        System.out.println("The Salary is " + Salary);
    }

    //print the data funtion
    public void putData()
    {
        System.out.println("The Name is: " + Name);
        System.out.println("The Age is: " + Age);
        System.out.println("The Phone number is: " + Phone_no);
        System.out.println("The Address is: " + Address);
    }
}

class Employee extends Member{
    String specialization;

    //method for specialization
    public  void putSpecializaion()
    {   
        sc.nextLine();
        System.out.print("Enter specialization of Employee: ");
        specialization = sc.nextLine();
    }
    public String getSpecialization() {
        return specialization;
    }

    
}

class Manager extends Member{
    String department;
    //method for department
    public void putDeparrtment()
    {   sc.nextLine();
        System.out.print("Enter Department of the manager: ");
        department =  sc.next();
    }
    public String getDepartment() {
        return department;
    }
}