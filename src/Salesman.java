public class Salesman extends User {

    private LegalEntityType legalEntityType;
    private long sellerBankAccount;
    private int maxLaptops;
    private int maxMobiles;
    private int soldLaptops;
    private int soldMobiles;

    private Laptop[] laptops = new Laptop[5];
    private int laptop_cnt = 0;
    private int movile_cnt = 0;
    private Mobile[] mobiles = new Mobile[5];

    public Salesman(String fullName, long IIN, String contactPhoneNumber,
                    LegalEntityType legalEntityType, long sellerBankAccount, int maxLaptops, int maxMobiles) {
        super(fullName, IIN, contactPhoneNumber);
        this.legalEntityType = legalEntityType;
        this.sellerBankAccount = sellerBankAccount;
        this.maxLaptops = maxLaptops;
        this.maxMobiles = maxMobiles;
        this.laptops = new Laptop[maxLaptops];
        this.mobiles = new Mobile[maxMobiles];
    }

    @Override
    void changeNumber(String number) {
        super.setContactPhoneNumber(number);
    }

    @Override
    void changeFullName(String data) {
        super.setFullName(data);
    }
    public void addLaptop(Laptop laptop){
        laptops[laptop_cnt] = laptop;
        laptop_cnt++;
    }
    public void addMobile(Mobile mobile){
        mobiles[movile_cnt] = mobile;
        movile_cnt++;
    }

    public boolean sellLaptop(Laptop laptop) {
        if (soldLaptops < maxLaptops) {
            laptops[soldLaptops] = laptop;
            soldLaptops++;
            sellerBankAccount += (long) laptop.getProductPrice();
            return true;
        } else {
            System.out.println("Seller is out of laptops.");
            return false;
        }
    }

    public boolean sellMobile(Mobile mobile) {
        if (soldMobiles < maxMobiles) {
            mobiles[soldMobiles] = mobile;
            soldMobiles++;
            sellerBankAccount += (long) mobile.getProductPrice();
            return true;
        } else {
            System.out.println("Seller is out of mobiles.");
            return false;
        }
    }

    public void viewSalesReport() {
        System.out.println("Sales report for " + super.getFullName());
        System.out.println("Legal Entity Type: " + legalEntityType);
        System.out.println("Seller's Bank Account: " + sellerBankAccount);
        System.out.println("Number of Laptops Sold: " + soldLaptops);
        System.out.println("Number of Mobiles Sold: " + soldMobiles);
    }
}