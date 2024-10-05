import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class prac_6_3 {
    public static void main(String[] args) throws Exception {
        File f = new File("xanadu.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String words[] = null;
        String s = "Hetvi";
        String i;
        boolean occur = false;

        //give lines to i
        while((i = br.readLine()) != null)
        {
            //split with every word
            words= i.split(" ");
            for(String word: words)
            {
                //if same word occurs the return true
                if(word.equals(s))
                {
                    occur=true;
                    break;
                }
            }
        }
        if(occur)
        {
            System.out.println("The given word is present in the file. ");
        }
        else
        {
            System.out.println("The given word is not present in the file. ");
        }
            fr.close();
    }
}
