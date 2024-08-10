public class prac_3_7_3 {
    //function for sum for return value
    public static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        int a,b;
        a=10;
        b=30;
        int s = sum(a, b);
        System.out.println("The sum using function is: " +s);
    }
}
