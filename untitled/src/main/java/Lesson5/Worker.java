package Lesson5;

public class Worker {
    String name;
    String post;
    String email;
    String number;
    int salary;
    int age;


    Worker (String name, String post, String email, String number, int salary, int age){
        this.name = name;
        this.post = post;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    void printInfo (){
        System.out.printf("Сотрудник %s занимает должность %s. Возраст сотрудника %d. Зарплата на занимаемой долженности составляет %s.\nКонтакты для связи: телефон: %s, эл.почта: %s\n", name, post, age, salary, number, email);
    }

}
