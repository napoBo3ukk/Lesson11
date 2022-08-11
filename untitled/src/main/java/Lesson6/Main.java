package Lesson6;

public class Main {
    public static void main(String[] args) {
        Cat Milka = new Cat("Milka", 150);
        Cat Bounty = new Cat("Bounty", 210);
        Dog Bob = new Dog("Bob", 490, 11);
        Dog GoodBoy = new Dog("GoodBoy", 520, 8);

        printinfo();


        Animals[] animals = {Milka, Bounty, Bob, GoodBoy};

        for (Animals animal : animals) {
            animal.run();
            animal.swim();
            System.out.println("==========");
        }
    }


    private static void printinfo() {
        System.out.printf("В нашем Приюте всего %d животных. Из них %d кошек и %d собак%n%n", Animals.Counter, Cat.Counter, Dog.Counter);
    }
}

