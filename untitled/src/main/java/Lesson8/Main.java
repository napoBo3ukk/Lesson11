package Lesson8;

public class Main {

    public static void main(String[] args) {


        Robot bender = new Robot("Бендер");
        Cat kisa = new Cat("Киса");
        Human ivan = new Human("Иванушка");

        Treadmill treadmill1 = new Treadmill(150);
        Treadmill treadmill2 = new Treadmill(250);
        Treadmill treadmill3 = new Treadmill(750);

        Wall wall1 = new Wall(1);
        Wall wall2 = new Wall(3);
        Wall wall3 = new Wall(5);

        toOvercome[] members = {ivan, kisa, bender};
        Barrier[] barriers = {treadmill1, wall1, treadmill2, wall2, treadmill3, wall3};


        for (toOvercome member : members) {
            for (Barrier barrier : barriers) {
                if (!barrier.overcome(member)) break;
            }
            System.out.println("============================");
        }
    }
}
