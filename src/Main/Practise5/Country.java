package Main.Practise5;

public enum Country {
    UKRAINE("Ukraine", "UAH", 48838483, City.KYIV),
    USA("USA", "USD", 32838483, City.LVIV),
    FRANCE("Paris", "EUR", 21138483, City.ODESSA);

    private  String name;
    private String currency;
    private  long population;
    private City capital;

    Country(String name, String currency, long population, City capital) {
        this.name = name;
        this.currency = currency;
        this.population = population;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public String getCurrency() {
        return currency;
    }

    public long getPopulation() {
        return population;
    }
    public boolean isUSD(){
        return this.getCurrency().equals("USD");
    }
}
