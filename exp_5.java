import java.util.Scanner;

public class exp_5 {
    public static void main(String[] args) {
       int pr_code[] = {1,2,3,4,5};
       float tax[] = {8,12,5,7.5f,3};
       float price[] = {100,200,300,400,500};
       String str[] = {"motor","fan","tube_light","wires","other"};

        for (int i = 0; i < 5; i++) {
            System.out.println(pr_code[i]+" for "+str[i]);
            System.out.println("price and tax for this is "+price[i]+" and "+tax[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("you have chosen " +str[ch-1]);
                System.out.print("Total price is "+(price[ch-1] + tax[ch-1]*price[ch-1]/100));
                break;
            case 2:
            System.out.println("you have chosen " +str[ch-1]);
            System.out.print("Total price is "+(price[ch-1] + tax[ch-1]*price[ch-1]/100));
            break;

            case 3:
            System.out.println("you have chosen " +str[ch-1]);
            System.out.print("Total price is "+(price[ch-1] + tax[ch-1]*price[ch-1]/100));
            break;

            case 4:
            System.out.println("you have chosen " +str[ch-1]);
            System.out.print("Total price is "+(price[ch-1] + tax[ch-1]*price[ch-1]/100));
            break;

            case 5:
            System.out.println("you have chosen " +str[ch-1]);
            System.out.print("Total price is "+(price[ch-1] + tax[ch-1]*price[ch-1]/100));
            break;

            default:
            System.out.println("Invalid input");
                break;
        }
        System.out.println("This Practical is made by Hetvi Radaiya - 23CS081");

    }
}
