public class Two {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = { 1, 56, 84, 6, 5, 8 };
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
