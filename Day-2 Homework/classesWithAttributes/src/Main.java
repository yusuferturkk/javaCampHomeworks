public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Laptop");
        product1.setDescription("Asus Laptop");
        product1.setPrice(5000);
        product1.setStockAmount(3);
        product1.setColor("Gray");

        System.out.println(product1.getName());

        ProductManager productManager = new ProductManager();
        productManager.Add(product1);
    }
}