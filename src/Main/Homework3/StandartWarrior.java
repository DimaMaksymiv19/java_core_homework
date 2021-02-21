package Main.Homework3;

public class StandartWarrior {
    private int hp;
    private int damage;
    private String weapon;
    private String name;

    public StandartWarrior(int hp, int damage, String weapon, String name) {
        this.hp = hp;
        this.damage = damage;
        this.weapon = weapon;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void Attack(StandartWarrior enemy) {
        if(enemy.getHp() > 0) {
            System.out.println(getName() + " attacks " + enemy.getName() + " by " + getWeapon());
            System.out.println(getName() + " damages = " + getDamage());
            System.out.println("HP " + enemy.getName() + " = " + enemy.getHp() + " - " + getDamage()
                    + " = " + (enemy.getHp() - getDamage()));
            enemy.setHp(enemy.getHp() - getDamage());
            if (enemy.getHp() <= 0) {
                System.out.println(enemy.getName() + " die");
            }
        }
    }
}
