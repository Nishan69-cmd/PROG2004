public class Patient {

    private String name;
    private String mobileNumber;

    public Patient(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    @Override
    public String toString() {
        return "Patient Name: " + name
                + "\nMobile Number: " + mobileNumber;
    }
