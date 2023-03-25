import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Customer {

    private String firstName;
    private String lastName;
    private Integer budget;
    private String phoneNumber;
    private List<Car> purchases;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getBudget() {
        return budget;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    List<Customer> generatePotentialCustomers() {
        String[] firstNames = {"Jan", "Grzegorz", "Marek", "Tomasz", "Jarosław", "Sławomir", "Krzesimir", "Paweł", "Marcin", "Piotr", "Grzegorz", "Patryk"};
        String[] lastNames = {"Kowalski", "Nowak", "Wiśniewski", "Nowakowski", "Zieliński", "Lewandowski", "Kamiński", "Szymański", "Kowalski", "Margalski", "Pospieszalski", "Jurecki"};
        Random random = new Random();

        List<Customer> potentialCustomers = new ArrayList<>();
        for (Integer i = 0; i < 10; i++) {
            Customer customer = new Customer();
            Integer firstNameIndex = random.nextInt(firstNames.length);
            Integer lastNameIndex = random.nextInt(lastNames.length);

            customer.setFirstName(firstNames[firstNameIndex]);
            customer.setLastName(lastNames[lastNameIndex]);
            customer.setPhoneNumber(String.valueOf(random.nextInt(200000000) + 500000000));
            customer.setBudget(random.nextInt(50000) + 25000);
            potentialCustomers.add(customer);
        }
        return potentialCustomers;
    }
}
