public class prac_4_3 {
    public static void main(String[] args) {
        //rectanlge object
        rectangle r1 = new rectangle(4, 5);

        r1.printArea();
        r1.perimeter();
        //square object
        square s1 = new square(5);
        s1.printArea();
        s1.perimeter();
        

        System.out.println("**********************By using the array of object**********************");

        int k=18;
        square[] s = new square[10];


        for (int i = 0; i < 10; i++) {
            s[i] = new square(k);
            k++;
            s[i].printArea();
            s[i].perimeter();
        }
        System.out.println("\nThis Practical is made by Hetvi Radaiya - 23CS081");

    }
}

class rectangle{
    int length;
    int breadth;

    //constroctor

    public rectangle(int l,int b) {
        length = l;
        breadth = b;
    }

    
    //print area function

    void printArea()
    {
        System.out.println("Area :" + length*breadth);
    }

    void perimeter(){
        System.out.println("Perimeter :" + (2*(length+breadth)));
    }
}

class square extends rectangle{


    // int side;
    public square(int s) {
        super(s, s);
    }

}