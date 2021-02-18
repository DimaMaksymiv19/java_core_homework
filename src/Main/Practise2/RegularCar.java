package Main.Practise2;

public class RegularCar extends Car{
    private String fuel;
    private Engine engine;

    public RegularCar(String color, String type, String mark, String fuel, Engine engine) {
        super(color, type, mark);
        this.fuel = fuel;
        this.engine = engine;
    }

    public RegularCar(String color, String type, String mark, Passanger passanger, String fuel, Engine engine) {
        super(color, type, mark, passanger);
        this.fuel = fuel;
        this.engine = engine;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
