package Lesson11;

import java.util.*;

public class PhoneBook {
    Scanner input = new Scanner(System.in);

    public Map<String, List<String>> getPhoneBook() {
        return phoneBook;
    }

    private final Map<String, List<String>> phoneBook = new TreeMap<>();

    public List<String> get(String name) {
        List<String> phones = phoneBook.get(name);
        if (phones == null) throw new RuntimeException("Данный контакт не найден");
        System.out.print("По данному контакту найдены номера: " + phones);
        return phones;
    }

    public void add(String name, String phone) {
        List<String> phones = phoneBook.getOrDefault(name, new ArrayList<>());
        phones.add(phone);
        phoneBook.put(name, phones);
    }


}
