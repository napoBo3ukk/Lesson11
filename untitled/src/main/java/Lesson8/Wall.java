package Lesson8;

public class Wall implements Barrier {
    private int height;

    public Wall(int height) {
        this.height = height;
    }


    @Override
    public boolean overcome(toOvercome overcome) {
        return overcome.leap(height);
    }
}
