import java.time.LocalDate;

public class Main {
    public static int checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        return year;
    }

//    public static void checkClientDeviceForApp(int clientOS, int clientDeviceYear) {
//        int currentYear = LocalDate.now().getYear();
//        if (currentYear == clientDeviceYear && clientOS == 0) {
//            System.out.println("Установите стандартную версию приложения для iOS по ссылке.");
//        } else if (currentYear == clientDeviceYear && clientOS == 1) {
//            System.out.println("Установите стандартную версию приложения для Android по ссылке.");
//        } else if (clientDeviceYear < currentYear && clientOS == 0) {
//            System.out.println("Установите облегчённую версию приложения для iOS по ссылке.");
//        } else if (clientDeviceYear < currentYear && clientOS == 1) {
//            System.out.println("Установите облегчённую версию приложения для Android по ссылке.");
//        }
//    }

    public static void checkClientDeviceForApp(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear == currentYear) {
                System.out.println("Установите стандартную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке.");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear == currentYear) {
                System.out.println("Установите стандартную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите облегчённую версию приложения для Android по ссылке.");
            }
        }
    }

    public static int checkDeliveryDistance(int deliveryDistance) {
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
        checkLeapYear(2024);
        System.out.println("Задание 2:");
        checkClientDeviceForApp(1, 2016);
        System.out.println("Задание 3:");
        checkDeliveryDistance(95);
    }
}