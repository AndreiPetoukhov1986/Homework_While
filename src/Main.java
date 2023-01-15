public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15_000, total = 0, i = 0;
        while (total < 2_459_000) {
            total = total + salary;
            i++;
            System.out.println("Месяц " + i + " , сумма накоплений равна" + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(" " + i + " ");
        }
        System.out.println();
        for (; i > 0; ) {
            System.out.print(" " + i + " ");
            i--;
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int totalPeoples = 12_000_000, year = 0;
        while (year < 10) {
            year++;
            totalPeoples = totalPeoples + (17 - 8) * totalPeoples / 1000;
            System.out.println("Год " + year + " численность населения составляет " + totalPeoples);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int contribution = 15_000, month = 0;
        double total = 0;
        while (total < 12_000_000) {
            month++;
            total = (total + contribution) * 1.07;
            System.out.printf("Месяц " + month + ", сумма накоплений %.1f%n", total, " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int contribution = 15_000, month = 0;
        double total = 0;
        while (total < 12_000_000) {
            month++;
            total = (total + contribution) * 1.07;
            if (month % 6 == 0) {
                System.out.printf("Месяц " + month + ", сумма накоплений %.1f%n", total, " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int contribution = 15_000, month = 0;
        double total = 0;
        while (month <= 9 * 12) {
            month++;
            total = (total + contribution) * 1.07;
            if (month % 6 == 0) {
                System.out.printf("Месяц " + month + ", сумма накоплений %.1f%n", total, " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 6; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + " -е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year=2023;
        int b=year-200;
        int c=year+100;
        for (int a =0; a<=c; a=a+79){
            if (a>=b) {
                System.out.println(a);
            }
        }
    }
}