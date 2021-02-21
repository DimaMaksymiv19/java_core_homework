package Main.Homework3;

public class Berserk extends StandartWarrior{

    public Berserk(int hp, int damage, String weapon, String name) {
        super(hp, damage, weapon, name);
    }


//    @Override
//    public void Attack(StandartWarrior enemy) {
//        System.out.println(getName() + " attacks " + enemy.getName() + " by " + getWeapon());
//        System.out.println(getName() + "damages = " + getDamage());
//        System.out.println("HP " + enemy.getName() + " = " + enemy.getHp() + " - " + (enemy.getHp()-getDamage()));
//        enemy.setHp(enemy.getHp() - getDamage());
//        if (enemy.getHp() <= 0){
//            System.out.println(enemy.getName() + " die");
//        }
//    }
}
