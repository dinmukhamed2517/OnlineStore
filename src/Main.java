public class Main {
    public static void main(String[] args) {
        // Create a Buyer
        Buyer buyer = new Buyer("John Doe",
                1234567890, "7-707-543-44-32",
                CreditCardType.VISA, "1234567890123456",
                2000000);

        // Create a Salesman
        Salesman salesman = new Salesman("Seller Inc",
                1876543210, "7-777-777-77-77",
                LegalEntityType.LLP, 987654321,
                5, 3);

        // Create some devices
        Laptop laptop1 = new Laptop("Dell XPS", 100000.0);
        Laptop laptop2 = new Laptop("HP Pavilion", 80000.0);
        Mobile mobile1 = new Mobile("iPhone 13", 90000.0);
        Mobile mobile2 = new Mobile("Samsung Galaxy S21", 75000.0);

        // Add devices to the salesman's inventory
        salesman.addLaptop(laptop1);
        salesman.addLaptop(laptop2);
        salesman.addMobile(mobile1);
        salesman.addMobile(mobile2);

        // Create a basket for the buyer
        Basket basket = new Basket();

        // Add items to the buyer's basket
        basket.addToBasket(laptop1, laptop1.getProductPrice());
        basket.addToBasket(mobile1, mobile1.getProductPrice());

        // Calculate the total amount in the basket
        double totalAmount = basket.getTotalAmount();

        // Make a purchase
        if (totalAmount <= buyer.getCreditCardBalance()) {
            buyer.makePurchase(totalAmount);
            salesman.sellLaptop(laptop1);
            salesman.sellMobile(mobile1);
        } else {
            System.out.println("Purchase failed. Insufficient funds on the credit card.");
        }

        // View the sales report for the salesman
        salesman.viewSalesReport();
    }
}