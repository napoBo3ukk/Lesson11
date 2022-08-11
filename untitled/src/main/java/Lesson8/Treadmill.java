package Lesson8;

public class Treadmill implements Barrier {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }


    @Override
    public boolean overcome(toOvercome overcome) {
        return overcome.run(distance);
    }
}
