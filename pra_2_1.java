import java.util.*;

public class pra_2_1 {

    public static String front_times(String a, int n){
       String res = "";
        String result = "";
            if(a.length()<3)
            {
               for (int i = 0; i < n; i++) {
                   result = result+a;
               }
            }
            else{
          res = a.substring(0,3);
          for (int i = 0; i < n; i++) {
            result = result+res;
        }
            }
            return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str="";
        System.out.println("Enter The string you want to repeat: ");
        str = sc.nextLine();
        System.out.println("How many time you want to repeat: ");
        int x = sc.nextInt();
    String s = front_times(str, x);
    System.out.println(s);
    System.out.println("This Practical is made by Hetvi Radaiya - 23CS081");
    }
}
