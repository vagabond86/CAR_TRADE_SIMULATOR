import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Trade {

    private Integer budget;
    List<Car> availableCars;
    private List<Car> ownedCars;
    private List<Transaction> transactionsHistory;

    public Trade() {
        this.budget = 1000000;
        this.availableCars = new ArrayList<>();
        this.ownedCars = new ArrayList<>();
    }

    public void showAvailableCars() {
        System.out.println("Dostępne samochody: ");
        for (Integer i = 0; i < availableCars.size(); i++) {
            Car car = availableCars.get(i);
            System.out.println(i + ": " + car.getBrand() + ", " + car.getValue() + " PLN");
        }

    }

    public void buyCar(Integer carIndex) {
        if (carIndex < 0 || carIndex >= availableCars.size()) {
            System.out.println("Niepoprawny indeks samochodu.");
            return;
        }
        Car car = availableCars.get(carIndex);
        if (car.getValue() > budget) {
            System.out.println("Nie stać Cię na ten samochód.");
            return;
        }
        budget -= car.getValue();
        ownedCars.add(car);
        availableCars.remove(carIndex);
        availableCars.add(generateCar());
    }

    private Car generateCar() {
        String[] brands = {"Toyota", "Honda", "Nissan", "Ford", "Audi", "BMW"};
        String[] colors = {"czerwony", "niebieski", "czarny", "biały", "srebrny"};
        String[] segments = {"kompaktowy", "miejski", "sedan", "SUV", "kombi"};
        Random random = new Random();

        String brand = brands[random.nextInt(brands.length)];
        Integer millage = random.nextInt(200000);
        String color = colors[random.nextInt(colors.length)];
        String segment = segments[random.nextInt(segments.length)];
        Integer value = random.nextInt(300000) + 50000;
        Boolean brakes = random.nextBoolean();
        Boolean suspension = random.nextBoolean();
        Boolean engine = random.nextBoolean();
        Boolean body = random.nextBoolean();
        Boolean transmission = random.nextBoolean();
        Boolean delivery = random.nextBoolean();
        Integer cargoSpace = random.nextInt(1000) + 100;

        return new Car(brand, millage, color, segment, value, brakes, suspension, engine, body, transmission, delivery, cargoSpace);

    }

    public void showOwnedCars() {
        System.out.println("Posiadane samochody: ");
        for (Integer i = 0; i < ownedCars.size(); i++) {
            Car car = ownedCars.get(i);
            System.out.println(i + ": " + car.getBrand() + ", " + car.getValue() + " PLN");
        }
    }

}
