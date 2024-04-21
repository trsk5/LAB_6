public class Phone {
    private String number;
    private String model;
    private double weight;
    // Конструктор з трьома параметрами
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    // Конструктор з двома параметрами
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0.0;
    }
    // Конструктор за замовчуванням
    public Phone() {
        this.number = "";
        this.model = "";
        this.weight = 0.0;
    }
    // Метод receiveCall з одним параметром - ім'я того, хто дзвонить
    public void receiveCall(String callerName) {
        System.out.println("Дзвонить " + callerName);
    }
    // Перевантажений метод receiveCall з двома параметрами - ім'я абонента та номер телефону
    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Дзвонить " + callerName + ", номер: " + callerNumber);
    }
    // Метод для отримання номера телефону
    public String getNumber() {
        return number;
    }
    // Метод для відправки повідомлення з аргументами змінної довжини
    public void sendMessage(String... numbers) {
        System.out.println("Номери, яким буде надіслано повідомлення:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        // Створення трьох об'єктів класу Phone з різними конструкторами
        Phone phone1 = new Phone("123456789", "Samsung Galaxy", 0.2);
        Phone phone2 = new Phone("987654321", "iPhone 12");
        Phone phone3 = new Phone();
        // Виведення значень змінних об'єктів на консоль
        System.out.println("Телефон 1:");
        System.out.println("Номер: " + phone1.getNumber());
        System.out.println("Модель: " + phone1.model);
        System.out.println("Вага: " + phone1.weight);
        System.out.println("\nТелефон 2:");
        System.out.println("Номер: " + phone2.getNumber());
        System.out.println("Модель: " + phone2.model);
        System.out.println("Вага: " + phone2.weight);
        System.out.println("\nТелефон 3:");
        System.out.println("Номер: " + phone3.getNumber());
        System.out.println("Модель: " + phone3.model);
        System.out.println("Вага: " + phone3.weight);
        // Виклик методів receiveCall для кожного об'єкту
        phone1.receiveCall("Іван");
        phone2.receiveCall("Марія", "555-1234");
        // Виклик методу sendMessage з аргументами змінної довжини
        phone1.sendMessage("111-222-333", "444-555-666");
        phone2.sendMessage("777-888-999");
    }
}
