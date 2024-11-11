public class ProductController {
    private Product model;
    private ProductView view;

    public ProductController(Product model, ProductView view) {
        this.model = model;
        this.view = view;
    }

    public void displayProduct() {
        view.displayProductInfo(model.getName(), model.getPrice(), model.getStock());
    }

    public void purchaseProduct() {
        view.displayProductInfo(model.getName(), model.getPrice(), model.getStock());
        System.out.println("Transaksi Pembelian");
        int quantity = view.getQuantity();

        if (quantity <= model.getStock()) {
            int totalPayment = quantity * model.getPrice();
            model.setStock(model.getStock() - quantity);
            view.displayTotalPayment(totalPayment);
        } else {
            System.out.println("Stok tidak mencukupi.");
        }

        displayProduct();
    }
}
