import java.io.*;
import java.util.Scanner;

public class prac_6_1 {
    public static void main(String[] args) {
        int x;
        for(x=0;x<args.length;x++){
        try {
            int count=0;
            File files = new File("file1.txt");
            
            if(files.createNewFile())
            {
                System.out.println(files.getName() + " Successfully Created.\n");
            }
            else{
                System.out.println("\nFile already exists");
            }
            Scanner sc = new Scanner(files);
            while (sc.hasNextLine()) {
                sc.nextLine();
                count++;
            }

            System.out.println("\nNumber of Lines in File 1 is " + count);

        }
        catch (IOException e) {
            System.out.println("\nAn error occurred in creating file1");
            e.printStackTrace();
        }

        try {
            int count=0;
            File files = new File("file2.txt");
            
            if(files.createNewFile())
            {
                System.out.println(files.getName() + " Successfully Created.\n");
            }
            else{
                System.out.println("\nFile already exists");
            }

            Scanner sc = new Scanner(files);
        while (sc.hasNextLine()) {
            sc.nextLine();
            count++;
        }

        System.out.println("\nNumber of Lines in File 2 is " + count);

        }
        catch (IOException e) {
            System.out.println("\nAn error occurred in creating file2");
            e.printStackTrace();
        }
        
        
        try {
            int count = 0;
            File files = new File("file3.txt");
            
            if(files.createNewFile())
            {
                System.out.println(files.getName() + " Successfully Created.\n");
            }
            else{
                System.out.println("\nFile already exists");
            }

            Scanner sc = new Scanner(files);
        while (sc.hasNextLine()) {
            sc.nextLine();
            count++;
        }

        System.out.println("\nNumber of Lines in File 3 is " + count);
        }
        catch (IOException e) {
            System.out.println("\nAn error occurred in creating file3");
            e.printStackTrace();
        }
    }
    }

}



