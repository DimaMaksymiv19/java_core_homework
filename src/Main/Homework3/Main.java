package Main.Homework3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Berserk berserk = new Berserk(500,150,"Axe","Berserk");
        Archer archer = new Archer(200,300,"Bow","Archer");
        Knight knight = new Knight(600, 150, "Sword","Knight");


        ArrayList<StandartWarrior> warArray = new ArrayList<>();
        warArray.add(berserk);
        warArray.add(archer);
        warArray.add(knight);

        boolean k = true;

        while (warArray.toArray().length > 1){
            int firstWarrior = (int) Math.floor(Math.random() * warArray.toArray().length);
            int secondWarrior = (int) Math.floor(Math.random() * warArray.toArray().length);
            while (k){
                if(firstWarrior == secondWarrior){
                    firstWarrior = (int) Math.floor(Math.random() * warArray.toArray().length);
                    secondWarrior = (int) Math.floor(Math.random() * warArray.toArray().length);
                }else {
                    k = false;
                }
            }
            k = true;
            warArray.get(firstWarrior).Attack(warArray.get(secondWarrior));
            System.out.println();
            for (int i = 0; i < warArray.toArray().length; i++) {
                if(warArray.get(i).getHp() <= 0){
                    warArray.remove(i);

                }
            }
        }







    }
}
