import java.util.Scanner;

public class ProductView {
    public void displayProductInfo(String name, int price, int stock) {
        System.out.println("Nama Barang : " + name);
        System.out.println("Harga Barang : " + price);
        System.out.println("Stok Barang : " + stock);
    }

    public int getQuantity() {
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah barang : ");
        return in.nextInt();
    }

    public void displayTotalPayment(int totalPayment) {
        System.out.println("Jumlah Bayar : " + totalPayment);
    }
}
