import java.io.*;
import java.util.Vector;

public class ListOfNumbers2 {
    private Vector<Integer> victor;
    private static final int size = 10;

    public ListOfNumbers2() {
        victor = new Vector<>(size);
        for (int i = 0; i < size; i++) {
            victor.addElement(i);
        }
        try {
            this.readList("infile.txt");
            this.writeList();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void readList(String fileName) {
        String line;
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(fileName, "r");
            while ((line = raf.readLine()) != null) {
                Integer i = Integer.parseInt(line);
                System.out.println(i);
                victor.addElement(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File '" + fileName + "' tidak ditemukan.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Format angka dalam file tidak valid.");
        } catch (IOException e) {
            System.out.println("Error saat membaca file: " + e.getMessage());
        } finally {
            try {
                if (raf != null) {
                    raf.close();
                }
            } catch (IOException e) {
                System.out.println("Error saat menutup file: " + e.getMessage());
            }
        }
    }

    public void writeList() {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter("outfile.txt"));
            for (int i = 0; i < victor.size(); i++) {
                out.println("Value at: " + i + " = " + victor.elementAt(i));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Akses ke elemen array melebihi batas.");
        } catch (IOException e) {
            System.out.println("Error saat menulis ke file: " + e.getMessage());
        } finally {
            if (out != null) {
                out.close();
                System.out.println("File berhasil ditutup.");
            } else {
                System.out.println("PrintWriter tidak terbuka.");
            }
        }
    }

    public static void main(String[] args) {
        new ListOfNumbers2();
    }
}
