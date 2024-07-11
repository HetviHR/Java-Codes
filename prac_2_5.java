public class prac_2_5 {
    public static void main(String[] args) {
        String str = "To be or not to be";
        String arr[] = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            String result = "";
            for (int j = arr[i].length() -1 ; j >= 0; j--) {
                result += arr[i].charAt(j);
            }
            System.out.print(result + " ");
        }
        System.out.println("This Practical is made by Hetvi Radaiya - 23CS081");
    }
}
