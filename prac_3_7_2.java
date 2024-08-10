public class prac_3_7_2 {
    public static void modifyString(StringBuilder hr)
    {
        hr.append(" Radadiya");
        System.out.println("Inside the method: " + hr);
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hetvi");
        System.out.println("Before method call: " + sb);
        //passing by reference
        modifyString(sb);
        System.out.println("After method call: " + sb);
    }
}
