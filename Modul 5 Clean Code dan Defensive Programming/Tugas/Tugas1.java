public class Tugas1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numerator = 3;
        int denominator = 0;

        try {
            System.out.println(numerator / denominator);
        } catch (ArithmeticException e) {
            System.out.println("Error: Terjadi pembagian dengan nol.");
        }
    }
}
