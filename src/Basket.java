public class Basket {
    private double totalAmount;

    public void addToBasket(Device device, double amount) {
        device.discount(10); // Apply a 10% discount for this example
        totalAmount += amount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}