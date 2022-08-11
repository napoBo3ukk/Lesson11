package Lesson3;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;


public class MainforLesson3 {

    public static void main(String[] args) {
        System.out.println("1. ");
        array ();                                                        // 1
        System.out.println();
        System.out.println("2. ");
        arrayHundred ();                                                 // 2
        System.out.println();
        System.out.println("3. ");
        arrayMultiply ();                                                // 3
        System.out.println();
        System.out.println("4. ");
        quadArray ();                                                    // 4
        System.out.println();
        System.out.println("5. ");
        int [] arrayTask5 = task5(6, 2);                    // 5
        System.out.println(Arrays.toString(arrayTask5));
        System.out.println();
        System.out.println("6. ");
        minAndMaxArray ();                                                // 6
        System.out.println();
        System.out.println("7. ");
        System.out.println(checkBalance(new int[] {3, 5, 2, 7}));        // 7
        System.out.println(checkBalance(new int[] {3, 5, 2, 6}));

    }


    private static void array() {
        int[] array = new int[10];                          // Создаем массив с последовательными значениями 0 и 1
        for (int i = 0; i < 10; i++) {
            array[i] = (i % 2 == 0) ? 0 : 1;
            System.out.print(array[i] + " ");
        }



        System.out.println();
        for (int i = 0; i < 10; i++) {                     // Меняем 0 на 1 и наоборот
            array[i] = (array[i] == 0) ? 1 : 0;
            System.out.print(array[i] + " ");
        }
    }

    private static void arrayHundred() {
        int [] array = new int [100];
                for (int i = 0; i<100; i++){
                    array[i] = i + 1;
                    System.out.print(array[i] + " ");
                }
    }

    private static void arrayMultiply() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array [i] < 6) {
               array[i] =  array[i] * 2;
            }
            System.out.print(array[i] + " ");
        }
    }

    private static void quadArray() {
        int [][] array = new int [5][5];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                   if (i == j || i + j == array.length-1) {                     // Если строка со столбцом равны или если их сумма равна последнему индексу = true
                        array [i][j] = 1;
                    }
                   System.out.printf("%3d", array[i][j]);
                }
                System.out.println();
            }
    }

    @NotNull
    public static int [] task5(int len, int initialValue) {
        int [] array = new int [len];
        Arrays.fill(array, initialValue);
        return array;
    }

    private static void minAndMaxArray() {
        int [] numbs = new int[]{1, 4, -2, 3};
        int min = numbs[0];
        int max = numbs [0];
        for (int num : numbs) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }
        System.out.println("Max = " + max + " Min = " + min);
    }

    private static boolean checkBalance (int[] arrayTask6){
        int leftPart = 0;
        int balance = sum(arrayTask6, 0, arrayTask6.length);
        if (balance % 2 !=0) {
            return false;
        }
        for (int i : arrayTask6) {
            leftPart += i;
            if (leftPart == balance / 2) {
                return true;
            }
        }
                return false;
    }

    public static int sum (int [] arrayTask6, int start, int end){
        int sum = 0;
        for (int i = start; i < end; i++){
            sum += arrayTask6[i];
        }
        return sum;
    }        // метод суммирования к 7 заданию


}