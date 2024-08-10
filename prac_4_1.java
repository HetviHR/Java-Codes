public class prac_4_1 {
    public static void main(String[] args) {
        //creation of object
        parent p1 = new parent();
        child c1 = new child();
        p1.p();
        c1.c();
        //calling patrent by child
        
        c1.p();
    }
}

//parent class

class parent{
    public void p()
    {
        System.out.println("This is parent class");
    }
}
//child class
class child extends parent{
    public void c() {
        System.out.println("This is child class");
    }
}