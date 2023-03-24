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

    public static void task1 () {
        System.out.println("Задача 1");
        for(int i = 0; i < 11; i = i + 1){
            System.out.println(i);
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        for(int i = 10; i > 0; i = i - 1){
            System.out.println(i);
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        for(int i = 0; i < 17; i = i + 2){
            System.out.println(i);
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        for(int i = -10; i < 11; i = i + 1){
            System.out.println(i);
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        for(int i = 1904; i < 2096; i = i + 4){
            System.out.println(i+" год является високосным");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        for(int i = 0; i < 99; i = i + 7) {
            System.out.println(i);
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        for(int i = 1; i < 513; i = i *2 ) {
            System.out.println(i);
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        for(int month = 1; month <= 12; month = month +1 ) {
            int summaVbanke = month * 29000;
            System.out.println("Месяц "+month+", сумма накоплений равна "+summaVbanke+" рублей. ");
        }
    }
    public static void task9 () {
        System.out.println("Задача 9");
        for(int month = 1; month <= 12; month = month +1 ) {
            int summaVbanke = month * (29000/100);
            System.out.println("Месяц "+month+", сумма накоплений равна "+summaVbanke+" рублей. ");
        }
    }
    public static void task10 () {
        System.out.println("Задача 10");
            for(int i = 1; i <= 10; i++ ) {
                int proizwedenie = 2 * i;
                System.out.println("2*" + i + "="+proizwedenie);
                }
            }
}