import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
            int birthMonth = 0;
            String trash = "";
            System.out.print("Enter your birth month(1-12): ");
            if(console.hasNextInt()) {
                birthMonth = console.nextInt();

                if (birthMonth >= 1 && birthMonth <= 12) {
                    System.out.print("Your birth month is: " + birthMonth);
                } else {
                    System.out.print("Your birth month is invalid: " + birthMonth);
                }
            }else{
                trash = console.next();
                System.out.print("Your birth month is invalid: " + trash);
            }
    }
}