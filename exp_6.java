import java.util.*;
public class exp_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int reversed_num, num;

        num = sc.nextInt();
        reversed_num = 0;

        while(num>0)
        {
            reversed_num = reversed_num*10 +  num%10;
            num = num/10;
        }
        System.out.println(reversed_num);
        System.out.println("This Practical is made by Hetvi Radaiya - 23CS081");

    }
}
