import java.util.ArrayList;
import java.util.List;

public class Trade {

    private Integer budget;
    List<Car> availableCars;
    private List<Customer> potentialCustomers;
    private List<Transaction> transactionsHistory;

    public Trade(){
        this.availableCars = new ArrayList<>();
    }

    public void showAvailableCars() {
        System.out.println("Dostępne samochody: ");
        for (Integer i = 0; i < availableCars.size(); i++) {
            Car car = availableCars.get(i);
            System.out.println(i + ": " + car.getBrand() + ", " + car.getValue() + " PLN");
        }

    }

}
