public class prac_4_5 {
    public static void main(String[] args) {
        Degree d = new Degree();
        d.getDegree();
        Undergraduate u = new Undergraduate();
        u.degree();
        Postgraduate p = new Postgraduate();
        p.degree();
    }
}

//Class Degree

class Degree
{
    public void getDegree() {
        {
            System.out.println("I got a degree");
        }
    }
}

// Class Undergraduate which inherits Degree class
class Undergraduate extends Degree{
    public void degree() {
        {
            System.out.println("I am an Undergraduate");
        }
    }
}

// Class Postgraduate which inherits Degree class

class Postgraduate extends Degree
{
    public void degree() {
        {
            System.out.println("I am a Postgraduate");
        }
    }
}
