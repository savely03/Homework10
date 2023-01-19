import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №10");
        task1();
        task2();
        task3();
        task4();
    }

    // Генерация случайного массива из 30 элементов.
    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000, 200000);
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Task1:");
        int[] payments = generateRandomArray();
        int totalMonthly = 0;
        // Посчет суммы через цикл
        for (int payment : payments) {
            totalMonthly += payment;
        }
        System.out.println(" Сумма трат за месяц составила - " + totalMonthly + " рублей.");
    }

    public static void task2() {
        System.out.println("Task2:");
        int[] payments = generateRandomArray();
        int maxDayPayment = payments[0];
        int minDayPayment = payments[0];
        for (int payment : payments) {
            if (payment > maxDayPayment) {
                maxDayPayment = payment;
            } else if (payment < minDayPayment) {
                minDayPayment = payment;
            }
        }
        System.out.println(" - Минимальная сумма трат за день составила " + minDayPayment + " рублей.\n" +
                " - Максимальная сумма трат за день составила " + maxDayPayment + " рублей.");
    }

    public static void task3() {
        System.out.println("Task3:");
        int[] payments = generateRandomArray();
        int totalMonthly = Arrays.stream(payments).reduce(0, Integer::sum); // Подсчет суммы через Stream.
        double avgPayment = totalMonthly / (double) payments.length;
        System.out.println(" Средняя сумма трат за месяц составила " + avgPayment + " рублей.");
        /*
            При необходимости результат можно округлять до n - знаков после запятой через форматирование строк.
        */
    }

    public static void task4() {
        System.out.println("Task4:");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.print(" ");
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}