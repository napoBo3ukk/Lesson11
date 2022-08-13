package Lesson10;

public class Box<T extends Fruit> {

    private T[] fruits;

    @SafeVarargs
    public Box(T... fruits) {
        this.fruits = fruits;
    }


    public T[] getFruits() {
        return fruits;
    }


    public int getSize() {
        return fruits.length;
    }

    public double getWeight() {
        if (fruits.length > 0) return fruits.length * fruits[0].getWeight();
        return 0;
    }

    public boolean compare(Box<?> box) {
        return box.getWeight() == this.getWeight();
    }

    public void movementFruit(Box<? extends T> box) {
        fruits = box.getFruits();
        box.pullOutFruit();
    }

    @SafeVarargs
    public final void pullOutFruit(T... fruits) {
        this.fruits = fruits;
    }


}
