public class Car {

    private String brand;
    private Integer mileage;
    private String color;
    private String segment;
    private Integer value;
    private Boolean brakes;
    private Boolean suspension;
    private Boolean engine;
    private Boolean body;
    private Boolean transmission;
    private Boolean delivery;
    private Integer cargoSpace;

    public Car(String brand, Integer mileage, String color, String segment, Integer value, Boolean brakes, Boolean suspension, Boolean engine, Boolean body, Boolean transmission, Boolean delivery, Integer cargoSpace) {
        this.brand = brand;
        this.mileage = mileage;
        this.color = color;
        this.segment = segment;
        this.value = value;
        this.brakes = brakes;
        this.suspension = suspension;
        this.engine = engine;
        this.body = body;
        this.transmission = transmission;
        this.delivery = delivery;
        this.cargoSpace = cargoSpace;
    }
}
