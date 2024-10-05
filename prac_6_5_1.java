
import java.io.BufferedWriter;
import java.io.FileWriter;


public class prac_6_5_1 {

    public static void main(String[] args) {
        try{
        FileWriter wr = new FileWriter("file1.txt");
        BufferedWriter  bw = new BufferedWriter(wr);
        
        bw.write("My name is Hetu");
        System.out.println("Success");
        }
        catch(Exception e)
        {
            System.out.println("");
        }
        
    }
}