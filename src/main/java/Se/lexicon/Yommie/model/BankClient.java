package Se.lexicon.Yommie.model;

public class BankClient {

    private final String socialSecurityNumber;
    private String fullName;
    private String email;
    private String phoneNumber;

    //Constructor creating/instantiating as object
    public BankClient(String socialSecurityNumber, String fullName, String email, String phoneNumber){
        this.socialSecurityNumber = socialSecurityNumber;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "BankClient{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
