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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Boolean getBrakes() {
        return brakes;
    }

    public void setBrakes(Boolean brakes) {
        this.brakes = brakes;
    }

    public Boolean getSuspension() {
        return suspension;
    }

    public void setSuspension(Boolean suspension) {
        this.suspension = suspension;
    }

    public Boolean getEngine() {
        return engine;
    }

    public void setEngine(Boolean engine) {
        this.engine = engine;
    }

    public Boolean getBody() {
        return body;
    }

    public void setBody(Boolean body) {
        this.body = body;
    }

    public Boolean getTransmission() {
        return transmission;
    }

    public void setTransmission(Boolean transmission) {
        this.transmission = transmission;
    }

    public Boolean getDelivery() {
        return delivery;
    }

    public void setDelivery(Boolean delivery) {
        this.delivery = delivery;
    }

    public Integer getCargoSpace() {
        return cargoSpace;
    }

    public void setCargoSpace(Integer cargoSpace) {
        this.cargoSpace = cargoSpace;
    }
}
