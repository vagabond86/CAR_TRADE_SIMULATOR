import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private List<Car> purchases;


    public Customer(String firstName, String lastName, String address, String phoneNumber, List<Car> purchases) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.purchases = new ArrayList<>();
    }
}
