package Lesson6;

public class Cat extends Animals {
    private String petName;
    private int obstracleLenghtRun;

    final int MAX_DISTANCE_RUN = 200;
    public  static int Counter;

    public Cat(String petName, int obstracleLenghtRun) {
        super(petName, obstracleLenghtRun, 0);
        this.petName = petName;
        this.obstracleLenghtRun = obstracleLenghtRun;
        Counter++;
    }


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

    @Override
    public void run() {
        if (obstracleLenghtRun <= MAX_DISTANCE_RUN){
        System.out.printf("Кошка по кличке %s пробежала %d метров из %d возможных%n", petName, obstracleLenghtRun, MAX_DISTANCE_RUN);
        } else System.out.printf("К сожалению, кошка по кличке %s пыталась пробежать на %d метров больше, чем она может. Ей нужно отдохнуть..%n", petName, obstracleLenghtRun - MAX_DISTANCE_RUN);
    }
}
