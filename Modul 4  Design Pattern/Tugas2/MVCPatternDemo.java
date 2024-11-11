public class MVCPatternDemo {
    public static void main(String[] args) {
        // Inisiasi Model
        Product product = new Product("GeForce GTX 1060Ti", 3000, 10);

        // Inisiasi View
        ProductView view = new ProductView();

        // Inisiasi Controller
        ProductController controller = new ProductController(product, view);

        // Tampilkan Informasi Produk
        controller.displayProduct();

        // Lakukan Transaksi
        controller.purchaseProduct();
    }
}
