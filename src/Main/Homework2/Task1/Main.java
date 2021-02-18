package Main.Homework2.Task1;

public class Main {
    public static void main(String[] args) {
        Robot justRobot = new Robot();
        CoffeRobot coffeRobot = new CoffeRobot();
        RobotDancer danceRobot = new RobotDancer();
        RobotCooocker cookRobot = new RobotCooocker();

        justRobot.work();
        coffeRobot.work();
        danceRobot.work();
        cookRobot.work();
        System.out.println();

        Robot [] robotsArray = {justRobot, coffeRobot, danceRobot, cookRobot};
        for (int i = 0; i < robotsArray.length; i++) {
            robotsArray[i].work();
        }
    }
}
