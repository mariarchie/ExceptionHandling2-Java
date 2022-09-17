import java.util.Scanner;

public class Four {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string");
        String s = scanner.nextLine();
        scanner.close();

        if (s.equals("")) {
            throw new NullPointerException("String can't be empty!");
        }
        System.out.println(s);;
    }
}
