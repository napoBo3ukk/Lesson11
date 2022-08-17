package Lesson11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("1 задание");
        array();
        System.out.println("================================");
        System.out.println("2 задание");
        phoneBook();

    }

    private static void phoneBook() {
        Scanner input = new Scanner(System.in);
        int current = -1;
        PhoneBook book = new PhoneBook();
        book.add("Лывин", "89809174045");
        book.add("Акбирова", "89809174044");
        book.add("Васин", "89809284647");
        book.add("Лывин", "+79809174045");

        while (current != 0) {
            System.out.println();
            System.out.println("1. Посмотреть все контакты\n2. Добавить новвый контакт\n3. Найти контакт\n\n0. Выход");

            switch (current = input.nextInt()) {
                case (1) -> book.getPhoneBook().entrySet().forEach(System.out::println);
                case (2) -> {
                    System.out.println("Введите Фамилию и номер телефона");
                    book.add(input.next(), input.next());
                }
                case (3) -> {
                    System.out.println("Введите фамилию");
                    book.get(input.next());
                }
                case (0) -> System.out.println("Счастливо!");

                default -> System.out.println("Неверная команда");

            }
        }
    }

    private static void array() {

        String[] strings = {"тетя", "дядя", "брат", "сестра", "мать", "отец", "дядя", "кузен", "брат", "дед", "бабка", "тетя"};
        Set<String> setStrings = new TreeSet<>(Arrays.asList(strings));
        System.out.println(setStrings);

        TreeMap<String, Integer> mapStrings = new TreeMap<>();

        for (String string : strings)
            if (mapStrings.containsKey(string)) {
                Integer count = mapStrings.get(string);
                mapStrings.put(string, ++count);
            } else {
                mapStrings.put(string, 1);
            }
        System.out.println(mapStrings);
    }
}
