public class prac_3_7_1 {
    public static void incrementValue(int a)
    {
        a++;
        System.out.println("Inside the function: " + a);
    }
    public static void main(String[] args) {
            //passing by value
            int h=10;
            System.out.println("Before the funciotn call: "+h);
            incrementValue(h);
            System.out.println("After the function call: "+h);
    }
}
