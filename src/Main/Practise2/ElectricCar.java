package Main.Practise2;

public class ElectricCar extends Car{
    private String energy;

    ElectricCar(){

    }

    public ElectricCar(String color, String type, String mark, String energy) {
        super(color, type, mark);
        this.energy = energy;
    }

    public ElectricCar(String color, String type, String mark, Passanger passanger, String energy) {
        super(color, type, mark, passanger);
        this.energy = energy;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }
}
