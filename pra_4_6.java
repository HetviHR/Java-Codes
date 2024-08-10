//interface P1
interface P1
{
    int P1=5;
    void printp1();

}

// inferface p2 
interface P2
{
    int P2=10;
    void printp2();

}

//p12 inherits p1 ans p2
interface P12 extends P1,P2
{
    int P12=10;
    void printp12();
}


//class Q implements interface p12
class Q implements P12
{   
    @Override
    public void printp12()
    {
        System.out.println("P12 : " + P12);
    }
    @Override
    public void printp1()
    {
        System.out.println("P1 : " + P1);
    }
    @Override
    public void printp2()
    {
        System.out.println("P2 : " + P2);
    }
}
public class pra_4_6 {
    public static void main(String[] args) {
        //create object of Q
        Q q = new Q();
        //callling all the methods
        q.printp1();
        q.printp2();
        q.printp12();

        System.out.println("\nThis Practical is made by Hetvi Radaiya - 23CS081");

    }
}