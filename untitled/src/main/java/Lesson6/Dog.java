package Lesson6;

public class Dog extends Animals {
    private String petName;
    private int obstracleLenghtRun;
    private int obstacleLenghtSwim;
    final int MAX_DISTANCE_RUN = 500;
    final int MAX_DISTANCE_SWIM = 10;
    public static int Counter;

    public Dog(String petName, int obstracleLenghtRun, int obstracleLenghtSwim) {
        super(petName, obstracleLenghtRun, obstracleLenghtSwim);
        this.petName = petName;
        this.obstracleLenghtRun = obstracleLenghtRun;
        this.obstacleLenghtSwim = obstracleLenghtSwim;
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

    public int getObstacleLenghtSwim() {
        return obstacleLenghtSwim;
    }

    public void setObstacleLenghtSwim(int obstacleLenghtSwim) {
        this.obstacleLenghtSwim = obstacleLenghtSwim;
    }

    public void run() {
        if (obstracleLenghtRun <= MAX_DISTANCE_RUN){
            System.out.printf("Собака по кличке %s пробежала %d метров из %d возможных%n", petName, obstracleLenghtRun, MAX_DISTANCE_RUN);
        } else System.out.printf("К сожалению, собака по кличке %s пыталась пробежать на %d метров больше, чем она может. Ей нужно отдохнуть..%n", petName, obstracleLenghtRun - MAX_DISTANCE_RUN);
    }

    public void swim(){
        if (obstacleLenghtSwim <= MAX_DISTANCE_SWIM){
            System.out.printf("Собака по кличке %s проплыла %d метров из %d возможных%n", petName, obstacleLenghtSwim, MAX_DISTANCE_SWIM);
        } else System.out.printf("К сожалению, собака по кличке %s пыталась проплыть на %d метров больше, чем она может. Ей нужно отдохнуть..%n", petName, obstacleLenghtSwim - MAX_DISTANCE_SWIM);
    }
}