package Lesson8;

public class Robot implements toOvercome {
    private String name;
    private final int MAX_DISTANCE = 1000;
    private final int MAX_HEIGHT = 10;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public boolean run(int distance) {
        if (MAX_DISTANCE >= distance) {
            System.out.printf("%s пробежал дистанцию в %d метров!%n", name, distance);

            return true;
        } else {
            System.out.printf("%s не смог преодолеть дистанцию в %d метров и теперь выбывает!%n", name, distance);
            return false;
        }
    }

    @Override
    public boolean leap(int height) {
        if (MAX_HEIGHT >= height) {
            System.out.printf("%s преодолел высоту в %d метров!%n", name, height);

            return true;
        } else {
            System.out.printf("%s не смог преодолеть высоту в %d метров и теперь выбывает!%n", name, height);
            return false;
        }
    }


}
