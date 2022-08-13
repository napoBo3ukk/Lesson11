package Lesson10;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[]{1, 2, 3};
        System.out.println("Упражнение 1");
        System.out.println("==============================================");
        swap(arrayInteger, 0, 2);
        System.out.println("Задача с яблоками");
        System.out.println("==============================================");
        sortBox();

    }

    private static <T> void swap(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length) {
            throw new IllegalArgumentException("Некорретное значение первого индекса");
        }
        if (index2 < 0 || index2 >= array.length) {
            throw new IllegalArgumentException("Некорретное значение второго индекса");
        }
        System.out.println(Arrays.toString(array));

        T temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        System.out.println(Arrays.toString(array));
        System.out.println();

    }

    private static void sortBox() {
        Box<Orange> orangeBox = new Box<>(
                new Orange(),
                new Orange(),
                new Orange()
        );

        Box<Apple> appleBox = new Box<>(
                new Apple(),
                new Apple(),
                new Apple(),
                new GoldenApple()
        );
        System.out.println("В коробке с яблоками " + appleBox.getSize() + " яблок\n" +
                "В коробке с апельсинами " + orangeBox.getSize() + " апельсинов");
        System.out.println("Вес коробки с яблоками " + appleBox.getWeight() + "\n" +
                "Вес коробки я апельсинами " + orangeBox.getWeight() + "\n" +
                "Массы данных коробок " + appleBox.compare(orangeBox));

        Box<Apple> secondAppleBox = new Box<>();
        secondAppleBox.movementFruit(appleBox);

        System.out.println("Из первой коробки с яблоками пересыпали все фрукты во вторую коробку с яблоками. Теперь в первой коробке " +
                appleBox.getSize() + " А во второй " + secondAppleBox.getSize());

        Box<GoldenApple> goldenAppleBox = new Box<>(
                new GoldenApple(),
                new GoldenApple()
        );

        appleBox.movementFruit(goldenAppleBox);

        System.out.println("Из  коробки с золотыми яблоками пересыпали все фрукты в первую коробку с яблоками. Теперь  коробке с золотыми яблоками " +
                goldenAppleBox.getSize() + " А в первой " + appleBox.getSize());
    }


}
