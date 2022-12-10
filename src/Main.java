import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Task1
        int year = 2001;
        leapYear(year);
        int currentYear = LocalDate.now().getYear();

        //Task2
        int clientDevaceYear = 2015;
        boolean clientOS = false;//true- ios, false- android
        applicationVersion(clientDevaceYear, clientOS);

        //Task3
        int distance = 77;
        deliveryPeriod(distance);


    }


    //1
    public static void leapYear(int year) {
        if (year <= 0){
                throw new RuntimeException("Некорректный ввод данных");

        }
        if (year % 100 == 0 || year % 4 == 0 && year % 400 != 0) {
            System.out.println(year + "високосный год");
        } else System.out.println(year + " не високосный год");
    }

    //2
    public static void applicationVersion(int clientDeviceYear, boolean clientOS) {
        int currentYear = LocalDate.now().getYear();
        String liteVersion = "";
        if (clientDeviceYear < 2015) {
            liteVersion = " облегченную";
        }
        if (clientOS) {
            System.out.println("Установите" + liteVersion + " версию приложения для iOS по ссылке");
        }
        if (!clientOS) {
            System.out.println("Установите" + liteVersion + " версию приложения для Android по ссылке");


        } else {
            throw new RuntimeException("Некорректный ввод данных");
        }
    }

    //3
    public static void deliveryPeriod(int distance) {

        if (distance < 20) {
            System.out.println("Потребуется дней: 1");
        }
        if (distance >= 20 && distance < 60) {
            System.out.println("Потребуется дней: 2");
        }
        if (distance >= 60 && distance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            throw new RuntimeException("Некорректный ввод данных");
        }
    }
}