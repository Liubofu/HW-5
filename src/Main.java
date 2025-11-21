//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задания 1 и 2");

        int clientOS = 1; // 0 — iOS, 1 — Android
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("«Установите облегченную версию приложения для Android по ссылке»");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        }
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке»");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        }

        System.out.println("Задание 3");

        int year = 2015; // начиная с 1584 года, не ранее
        if ((year % 4 == 0) && (year % 100 != 0) && (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }
}