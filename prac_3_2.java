public class prac_3_2 {
    public static void main(String[] args) {
        TriangleArea t1 = new TriangleArea();
        TriangleArea t2 = new TriangleArea(4);
        TriangleArea t3 = new TriangleArea(4,5);

        System.out.println("Area of square is: "+ t1.area);
        System.out.println("Area of circle is: "+ t2.area);
        System.out.println("Area of triangle is: "+ t3.area);
    }
}

class TriangleArea{
    double area;
    public TriangleArea() {
        area = 15;
    }
    public TriangleArea(double  r)
    {
        area = 3.14*r*r;
    }
    public TriangleArea(double length,double width)
    {
        area = 0.5*length*width;
    }
    
}