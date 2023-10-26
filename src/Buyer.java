public class Buyer extends User {


    private CreditCardType creditCardType;
    private String creditCardNumber;
    private double creditCardBalance;
    public Buyer(String fullName, long IIN, String contactPhoneNumber,
                 CreditCardType creditCardType, String creditCardNumber, double creditCardBalance) {
        super(fullName, IIN, contactPhoneNumber);
        this.creditCardType = creditCardType;
        if (validateCreditCardNumber(creditCardNumber)) {
            this.creditCardNumber = creditCardNumber;
        } else {
            System.out.println("Invalid credit card number");
        }
        this.creditCardBalance = creditCardBalance;
    }

    public double getCreditCardBalance() {
        return creditCardBalance;
    }

    @Override
    void changeNumber(String number) {
        super.setContactPhoneNumber(number);
    }

    @Override
    void changeFullName(String data) {
        super.setFullName(data);
    }

    private boolean validateCreditCardNumber(String cardNumber) {
        return cardNumber.length() == 16;
    }

    public void makePurchase(double amount) {
        if (amount <= creditCardBalance) {
            creditCardBalance -= amount;
            System.out.println("Purchase successful. Remaining balance: " + creditCardBalance);
        } else {
            System.out.println("Insufficient funds on the credit card.");
        }
    }
}