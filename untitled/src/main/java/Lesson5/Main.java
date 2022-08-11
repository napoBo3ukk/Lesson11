package Lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Пожалуйста, введите возраст сотрудника для выборки");
        Worker[] workers = new Worker[5];
        workers [0] = new Worker("Иванов Иван Иванович", "Директор", "ivanov@mail.ru", "+79809174041", 150000, 42 );
        workers [1] = new Worker("Дементьев Петр Васильевич", "Управляющий", "dementyev@mail.ru", "+79809174040", 115000, 39 );
        workers [2] = new Worker("Давлетшин Антон Петрович", "Бухгалтер", "davletshin@mail.ru", "+79809174019", 70000, 35 );
        workers [3] = new Worker("Акбиров Ислам Исхакович", "Сторож", "akbirov@mail.ru", "+79809174042", 45000, 57 );
        workers [4] = new Worker("Исмагилов Азат Рашитович", "Уборщик", "ismagilov@mail.ru", "+79809174043", 25000, 49 );

        int age = in.nextInt();

    for (Worker worker: workers){
        if (worker.age >= age){
            worker.printInfo();
        }
    }
    }
}