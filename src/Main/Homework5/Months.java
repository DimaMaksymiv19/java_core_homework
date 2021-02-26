package Main.Homework5;

public enum Months {
    JANUARY(Seasons.WINTER, 31),
    FEBRUARY(Seasons.WINTER, 29),
    MARCH(Seasons.SPRING, 31),
    APRIL(Seasons.SPRING, 30),
    MAY(Seasons.SPRING, 31),
    JUNE(Seasons.SUMMER, 30),
    JULY(Seasons.SUMMER, 31),
    AUGUST(Seasons.SUMMER, 30),
    SEPTEMBER(Seasons.AUTUMN, 31),
    OCTOBER(Seasons.AUTUMN, 30),
    NOVEMBER(Seasons.AUTUMN, 30),
    DECEMBER(Seasons.WINTER, 31);

    private Seasons season;
    private int numDay;

    Months(Seasons season, int numDay) {
        this.season = season;
        this.numDay = numDay;
    }

    public Seasons getSeason() {
        return season;
    }

    public int getNumDay() {
        return numDay;
    }
}
