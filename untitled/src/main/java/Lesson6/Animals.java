package Lesson6;

public abstract class Animals {
    private String petName;
    private int obstracleLenghtRun;
    private int obstracleLenghtSwim;
    public static int Counter;

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getObstracleLenghtRun() {
        return obstracleLenghtRun;
    }

    public void setObstracleLenghtRun(int obstracleLenghtRun) {
        this.obstracleLenghtRun = obstracleLenghtRun;
    }

    public int getObstracleLenghtSwim() {
        return obstracleLenghtSwim;
    }

    public void setObstracleLenghtSwim(int obstracleLenghtSwim) {
        this.obstracleLenghtSwim = obstracleLenghtSwim;
    }

    public static int getCounter() {
        return Counter;
    }

    public static void setCounter(int counter) {
        Counter = counter;
    }

    public Animals(String petName, int obstracleLenghtRun, int obstracleLenghtSwim) {
        this.petName = petName;
        this.obstracleLenghtRun = obstracleLenghtRun;
        this.obstracleLenghtSwim = obstracleLenghtSwim;
        Counter++;
    }
    public void run(){};

    public void swim(){};
}



