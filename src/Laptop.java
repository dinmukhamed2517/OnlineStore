public class Laptop implements Device {
    private String productModel;
    private double productPrice;

    public Laptop(String productModel, double productPrice) {
        this.productModel = productModel;
        this.productPrice = productPrice;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public void discount(int percent) {
        double discountAmount = productPrice * percent / 100;
        productPrice -= discountAmount;
    }
}