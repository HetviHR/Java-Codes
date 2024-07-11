import java.util.*;

public class prac_2_2 {

    public static int array_count9(int arr[]){
        int count=0;
        for (int idx = 0; idx < arr.length; idx++) {
           if(arr[idx] == 9){
            count++;
           }
            
        }
 return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element you want to enter: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");

  int arr[] = new int[n];

        for (int i = 0; i < n; i++) {            
         arr[i] = sc.nextInt();
        }

        int num = array_count9(arr);
        System.out.print("Count of 9 in your array is: ");
        System.out.println(num);
        System.out.println("This Practical is made by Hetvi Radaiya - 23CS081");
    }
}
