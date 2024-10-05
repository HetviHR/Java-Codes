import java.io.*;

public class prac_6_4 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("file3.txt");
            FileOutputStream fos = new FileOutputStream("file4.txt");
            int x;
            while((x = fis.read()) != -1)
            {
                fos.write(x);
            }

            System.out.println("data is copied Successfully");
            fis.close();
            fos.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
