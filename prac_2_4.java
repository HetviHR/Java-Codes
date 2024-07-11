
public class prac_2_4 {
    public static String double_char(String str)
    {
        String result = "";
            for (int i = 0; i< str.length(); i++) {
                result = result + str.charAt(i) + str.charAt(i);
            }

        return result;
    }
    public static void main(String[] args) {
      String str1 = "The";
      String str2 = "AAbb";
      String str3 = "Hi-There";

      String  str4 = double_char(str1);
      String  str5 = double_char(str2);
      String  str6 = double_char(str3);
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println();
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println("This Practical is made by Hetvi Radaiya - 23CS081");
    }
}
