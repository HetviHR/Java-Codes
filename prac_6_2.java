import java.io.*;

public class prac_6_2 {
    public static void main(String[] args) throws Exception {
        File f = new File("xanadu.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        int i=0;
        int count = 0;
        //reads
        while((i=br.read()) != -1)
        {
            if(i == args[0].charAt(0))
            {
                count++;
            }
        }
        System.out.println("The given letter "+ args[0].charAt(0) + " occurs " + count + " Times");
        fr.close();
    }
}
