import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcepTest {
    public static void main(String args[]) {
        int a[] = new int[2];
        try {
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
        } finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }

        // File handling block
        FileInputStream file = null;
        String fileName = "example.txt"; // Replace with your file name
        try {
            file = new FileInputStream(fileName);
            int x = file.read();
            System.out.println("First byte read from file: " + x);
        } catch (FileNotFoundException f) {
            System.out.println("File not found exception thrown: " + f);
        } catch (IOException i) {
            System.out.println("IO exception thrown: " + i);
        } finally {
            try {
                if (file != null) file.close();
            } catch (IOException i) {
                System.out.println("Failed to close file: " + i);
            }
        }
    }
}
