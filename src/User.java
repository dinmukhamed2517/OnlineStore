public abstract class User {
    private String fullName;
    private long IIN;
    private String contactPhoneNumber;

    public User(String fullName, long IIN, String contactPhoneNumber) {
        this.fullName = fullName;
        this.IIN = IIN;
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    abstract void changeNumber(String number);
    abstract void changeFullName(String data);
}