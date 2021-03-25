package Main.Practise14;

public class CreditAccount extends Account{
    private String id;

    public CreditAccount(double money, String id) {
        super(money);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
