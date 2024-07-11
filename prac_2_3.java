import java.util.*;

public class prac_2_3 {
    public static boolean  array_front9(int arr[])
    {
        boolean bool = false;
        for (int i = 0; i < 4; i++) {
            if(arr[i] == 9)
            bool = true;
        }
        return bool;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean bool = array_front9(arr);
        System.out.println(bool);
        System.out.println("This Practical is made by Hetvi Radaiya - 23CS081");
    }

}
