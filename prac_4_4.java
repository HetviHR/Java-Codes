// class A creation
class A{
        //static declaration of x in A
    int x=10;
}

//class B extends (inherits) class A
class B extends A{
    //static declaration of x in B
    int x=20;
    public  void display()
    {
        System.out.println("The number from super class is " + super.x);
        System.out.println("The number from sub class is " + this.x);

    }
}


public class prac_4_4 {
    public static void main(String[] args) {
        //object creation
        B b = new B();
        b.display();
        System.out.println("\nThis Practical is made by Hetvi Radaiya - 23CS081");

    }
}
