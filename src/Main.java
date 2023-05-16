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
        task9();
        task10();
    }

    public static void task1() {
        //С помощью цикла for выведите в консоль все числа от 1 до 10.
        for (int i = 1; i < 11; i++)
            System.out.print(i + " ");
        System.out.println();
    }


    public static void task2() {
        //С помощью цикла for выведите в консоль все числа от 10 до 1.
        for (int i = 10; i > 0; i--)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void task3() {
        //Выведите в консоль все четные числа от 0 до 17.
        for (int i = 0; i < 18; i = i + 2)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void task4() {
        //Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
        for (int i = 10; i > -11; i = i - 1)
            System.out.print(i + " ");
        System.out.println();

    }

    public static void task5() {
        //Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
        // В консоль результат должен выводиться в формате: «… год является високосным».
        for (int i = 1904; i < 2097; i = i + 4)
            System.out.println(i + " год явдяется високосным");
        System.out.println();
    }

    public static void task6() {
        //Напишите программу, которая выводит в консоль последовательность чисел:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        for (int i = 7; i < 99; i = i + 7)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void task7() {
        //Напишите программу, которая выводит в консоль последовательность чисел:
        //1 2 4 8 16 32 64 128 256 512
        for (int i = 1; i < 513; i = i * 2)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void task8() {
        //Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
        //Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
        int salary = 0;
        for (int i = 1; i < 13; i++) {
            salary = salary + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + salary + " рублей");
        }
        System.out.println();
    }

    public static void task9() {
        //Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку», а в банк под проценты — 12% годовых.
        // Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
        int salary = 29900;
        double total = 0;
        int salaryWithPenny = salary * 100;
        int totalWithPenny = 0;
        for (int i = 1; i < 13; i++) {
            totalWithPenny = totalWithPenny + totalWithPenny / 100;
            totalWithPenny = totalWithPenny + salaryWithPenny;
            total = totalWithPenny / 100.;
            System.out.println("Месяц " + i + " Итого " + total);
        }
        System.out.println();

    }

    public static void task10() {
        //Напишите программу, которая выводит в консоль таблицу умножения на 2:
        int i = 2;
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }
}