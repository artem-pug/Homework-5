public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        } else {
            if (clientOS == 1) ;
            {
                System.out.println("Установите версию приложения для Android по ссылке ");
            }
        }
        System.out.println("Задание 2");
        clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке ");
        }
        System.out.println("Задание 3");
        int year = 2020;
        if (year > 1584) {
            if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
                System.out.println("Год " + year + " является високосным ");
            } else {
                System.out.println("Год " + year + " не является високосным ");
            }
        }
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + deliveryTime);
        } else {
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потребуется дней " + (deliveryTime + 1));
            } else {
                if (deliveryDistance > 60 && deliveryDistance <= 100) {
                    System.out.println("Потребуется дней " + (deliveryTime + 2));
                } else {
                    System.out.println("Доставка не осуществляется");
                }
            }
        }
        System.out.println("Задание 5");
        int monthNumber = 10;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}


