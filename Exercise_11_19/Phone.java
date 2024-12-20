package Exercise_11_19;

public class Phone {
    private String name;
    private String serialNumber;

    public Phone(String name, String serialNumber) {
        this.name = name;
        if (serialNumber == "" || serialNumber.length() != 16) {
            throw new ValidationException("Incorrect serialNumber length!");
        }
    }
}
