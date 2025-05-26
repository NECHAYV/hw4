public class Main {
    public static void main(String[] args) {

        int os = 3;
        if (os == 0) {
            System.out.println("Установите версию приложения для OS");
        } else if (os == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Такого значения нет");
        }
        os = 0;
        int clientDeviceYear = 2016;
        if (os == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (os == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (os == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
        int year = 10000;
        int firstYear = 1584;
        if (year >= firstYear && year % 4 == 0 || year % 100 != 0 && year % 400 == 0) {
            System.out.println("год високосный ");
        } else {
            System.out.println(" год не високосный ");
        }
        int deliveryDistance = 95;
        int days;
        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            days = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = 3;
        } else {
            days = -1;
        }

        if (days != 1) {
            System.out.println("Потребуется дней" + days);
        } else {
            System.out.println("Доставки нет");
        }
        int monthNumber = 5;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("Неизвестный номер");
        }
    }
}