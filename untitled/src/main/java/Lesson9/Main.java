package Lesson9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива 1 и 2 порядка");
        int size1 = input.nextInt();
        int size2 = input.nextInt();

        String[][] array = new String[size1][size2];
        try {
            checkArraySize(array, 4, 4);
            System.out.println("Сумма элементов массива : " + checkArrayInt(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            throw new RuntimeException(e);
        }


    }

    private static void checkArraySize(String[][] array, int row, int col) throws MyArraySizeException {
        if (array.length == row) for (int i = 0; i < array.length; i++) {
            if (array[i].length != col) break;
            if (i == array.length - 1) return;
        }

        throw new MyArraySizeException("Размер массива должен быть " + row + "x" + col);
    }

    private static int checkArrayInt(String[][] array) throws MyArrayDataException {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Укажи значения для массива %d%n", i + 1);
            for (int j = 0; j < array[i].length; j++) {
                try {
                    array[i][j] = input.next();
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверное значение ячейки [" + (i + 1) + "] [" + (j + 1) + "]. Необходимо вписать число");
                }

            }
        }
        return sum;
    }
}
