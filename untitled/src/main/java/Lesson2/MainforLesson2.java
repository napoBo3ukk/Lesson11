package Lesson2;

public class MainforLesson2 {
    public static void main(String[] args) {
        System.out.println(checkSum(5, 10));        // 1
        positiveOrNegative (-5);                       // 2
        System.out.println(negative(-6));              // 3
        printStr("Hello", 5);                   // 4
        System.out.println(leapYear(400));                // 5
    }

    public static boolean checkSum (int a, int b){
        System.out.print("1. ");
        return (a + b) >= 10 && (a + b) <= 20;
    }

    public static void positiveOrNegative (int a){
        System.out.print("2. ");
        if (a >= 0){
            System.out.println("Число " + a + "положительное");
        } else System.out.println("Число " + a + " отрицательное");
    }

    public static boolean negative (int a) {
        System.out.print("3. ");
        return a < 0;
    }

    public static void printStr (String str, int count) {
        System.out.print("4. ");
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean leapYear (int year) {
        System.out.print("5. ");
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0; // если year делится на 4 но не делится на 100 = тру, если year делится на 400 = true, иначе false
    }
}

