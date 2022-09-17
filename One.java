import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your float number");
        String str = scanner.nextLine();
        scanner.close();

        if (isNumeric(str)) {
            float number = Float.parseFloat(str);
            System.out.println(number);
        } else {
            throw new NumberFormatException("Not a number, pls, try again");
        }
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}