package Main.Practise5;

public enum City {
    KYIV(1313,14155),
    LVIV(12313,34155),
    ODESSA(131333333,1433333155);
    private double square;
    private long population;

    City(double square, long population) {
        this.square = square;
        this.population = population;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
