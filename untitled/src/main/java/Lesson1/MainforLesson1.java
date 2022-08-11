package Lesson1;

public class MainforLesson1 {
    public static void main(String[] args) {                                //1 пункт
        System.out.println("1. Проект создан, метод main прописан");
        printThreeWords();                                                  //2 пункт
        checkSumSign();                                                     //3 пункт
        printColor();                                                       //4 пункт
        compareNumbers();                                                   //5 пункт
    }


    static void printThreeWords() {
        System.out.println("2.Orange\nBanana\nApple");
    }

    static void checkSumSign() {
        int a = 3;
        int b = -3;
        System.out.print("3. ");
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        else System.out.println("Сумма отрицательная");

    }

    static void printColor() {
        int value = 101;
        System.out.print("4. ");
        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 && value <=100) {
            System.out.println("Желтый");
        }else System.out.println("Зеленый");
    }

    static void compareNumbers () {
        int a = -6;
        int b = -5;
        System.out.println("5. ");
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }
}