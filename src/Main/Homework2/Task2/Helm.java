package Main.Homework2.Task2;

public class Helm {
    private int helmRadius;
    private String covering;

    public Helm(int helmRadius, String covering) {
        this.helmRadius = helmRadius;
        this.covering = covering;
    }

    public int getHelmRadius() {
        return helmRadius;
    }

    public void setHelmRadius(int helmRadius) {
        this.helmRadius = helmRadius;
    }

    public String getCovering() {
        return covering;
    }

    public void setCovering(String covering) {
        this.covering = covering;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "helmRadius=" + helmRadius +
                ", covering='" + covering + '\'' +
                '}';
    }
    public int radius2x(){
        helmRadius *= 2;
        return helmRadius;
    }

}
