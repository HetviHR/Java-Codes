public class prac_5_3 {

    int create_exception() throws ArithmeticException
        {
            int x = 10/0;
            return x;
        }

        public void checkAge(int age)
        {
            if(age<18)
            {
                throw new ArithmeticException("not eligible for vote ");
            }
            else 
            {
                System.out.println("Eligible for vote");
            }
        }


    public static void main(String[] args) {
        prac_5_3 obj = new prac_5_3();

        try {
            obj.create_exception();
        } catch (ArithmeticException e) {
            System.out.println("An error occured");
        }

        int age = 18;
        obj.checkAge(age);
    }
}