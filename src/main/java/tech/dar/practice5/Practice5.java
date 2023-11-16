package tech.dar.practice5;

public class Practice5 {

    // Напишите рекурсивную функцию для печати чисел от 1 до N в порядке возрастания.
    public void printToN(int n, int i) {
        if (i <= n) {
            System.out.println(i);
            printToN(n, i + 1);
        }
    }

    public void printToN(int n) {
        if (n > 1) {
            printToN(n - 1);
        }
        System.out.println(n);
    }

    // Напишите рекурсивную функцию для вычисления N-го числа Фибоначчи.
    // N-ое число Фибоначчи определяется как сумма двух предыдущих чисел Фибоначчи.
    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    // Напишите рекурсивную функцию для вычисления числа x в степени n, где n - неотрицательное целое число
    // x = 2, n = 4 -> x * (x * (x * (x)))
    public long power(int x, int n) {
        if (n == 0)
            return 1;
        else
            return x * power(x, n - 1);
    }

    // Напишите рекурсивную функцию для поиска наибольшего элемента в массиве целых чисел.
    public int findMax(int[] arr, int i, int max) {
        if (i == arr.length) {
            return max;
        }
        if (max < arr[i]) {
            max = arr[i];
        }
        return findMax(arr, i + 1, max);
    }

    // Напишите рекурсивную функцию для вычисления суммы элементов в массиве целых чисел.
    public int arraySum(int[] arr, int i, int sum) {
        if (i == arr.length) {
            return sum;
        }
        sum += arr[i];
        return arraySum(arr, i + 1, sum);
    }


    // Написать метод formatTime, который принимает количество секунд и возвращает строку, представляющую время в формате часов, минут и секунд (HH:mm:ss).
    // 7300 - 7200 = 100
    // 3600 + 3660 = 7200
    public String formatTime(int seconds) {
        int minutesSeconds = 60;
        int hourSeconds = 3600;

        int hours = seconds / hourSeconds;
        seconds = seconds % hourSeconds;
        int minutes = seconds / minutesSeconds;
        seconds = seconds % minutesSeconds;

        return (hours < 10 ? "0" : "") + hours + ":" + (minutes < 10 ? "0" : "") + minutes + ":" + (seconds < 10 ? "0" : "") + seconds;
    }

    // Написать метод findGCD, который принимает два целых числа и возвращает их НОД.
    public static int findGCD(int a, int b) {
        int gcd = 0;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        return gcd;
    }

    // Написать метод getDaysInMonth, который принимает два параметра: month и year (месяц и год) и возвращает количество дней в этом месяце, учитывая високосные годы.
    public static int getDaysInMonth(int month, int year) {
        int days = 0;
        if ((month < 8 && month % 2 == 1) || (month >= 8 && month % 2 == 0))
            days = 31;
        else if (month == 2)
            days = isLeapYear(year) ? 29 : 28;
        else
            days = 30;
        return days;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Написать метод calculateDistance, который принимает координаты двух точек (x1, y1) и (x2, y2) на плоскости и возвращает расстояние между ними.
    // a^2 + b^2 = c^2
    // c = sqrt(a^2 + b^2)
    // a = |x1 - x2| 1 - 4 = -3
    // b = |y1 - y2|
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

}

