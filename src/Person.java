import java.util.Scanner;

public class Person {
    private String fullName;
    public Person() {
    }
    public Person(String fullName) {
        this.fullName = fullName;
    }
    public void move() {
        System.out.println(fullName + " рухається");
    }
    public void talk() {
        System.out.println(fullName + " говорить");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ім'я: ");
        scanner.nextLine();
        Person person1 = new Person();
        Person person2 = new Person("Jane Doe");
        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
        scanner.close();
    }
}
