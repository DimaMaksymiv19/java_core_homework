package Main.Practise14;

public class DebitAccount extends Account{
    private int id;

    public DebitAccount(double money, int id) {
        super(money);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
