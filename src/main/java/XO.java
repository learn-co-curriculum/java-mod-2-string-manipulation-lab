import java.util.Scanner;
public class XO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in a string to check for x's and o's:");
        String xo = scanner.nextLine();

        if (getXO(xo)) {
            System.out.println("The string entered has the same amount of x's and o's.");
        } else {
            System.out.println("The string entered has different amounts of x's and o's.");
        }
    }

    public static boolean getXO(String xo) {
        // Write your code here!
    }
}
