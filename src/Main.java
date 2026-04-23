//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int checkYears(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        return year;
    }

    public static int checkClientDevice(int clientOS, int clientDeviceYear) {
        int currentYear = 2015;
        if (currentYear == clientDeviceYear && clientOS == 0) {
            System.out.println("Установите стандартную версию приложения для iOS по ссылке.");
        } else if (currentYear == clientDeviceYear && clientOS == 1) {
            System.out.println("Установите стандартную версию приложения для Android по ссылке.");
        } else if (clientDeviceYear < currentYear && clientOS == 0) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear < currentYear && clientOS == 1) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке.");
        }
        return clientOS + clientDeviceYear;
    }

    public static int chekDeliveryDistance(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставка не осуществляется");
        }
        return deliveryDistance;
    }

    public static void main(String[] args) {
        System.out.println("Задание 1:");
        checkYears(2024);
        System.out.println("Задание 2:");
        checkClientDevice(1, 2013);
        System.out.println("Задание 3:");
        chekDeliveryDistance(110);
    }
}