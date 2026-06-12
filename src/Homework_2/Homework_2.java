package Homework_2;

public class Homework_2 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        calculate();
        System.out.println("-".repeat(50));
        System.out.println("Task 2");
        getSum();
        System.out.println("-".repeat(50));
        System.out.println("Task 3");
        getSumNumbers();
        System.out.println("-".repeat(50));
        System.out.println("Task 4");
        getRemainder();
        System.out.println("-".repeat(50));
        System.out.println("Task 5");
        getDivision();
        System.out.println("-".repeat(50));
        System.out.println("Task *");
        getReplacement();
    }

    public static void calculate() {
        int b = 10;
        int c = 4;
        int a = 4 * (b + c - 1) / 2;
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("a = 4 * (b + c - 1) / 2 = " + a);
    }

    public static void getSum(){
        int n = 26;
        int a = n / 10;
        int b = n % 10;
        System.out.println("Исходное число: " + n);
        System.out.println("Числа для сложения: " + a + " и " + b);
        System.out.println("Сумма чисел: " + (a + b));
    }

    public static void getSumNumbers() {
        int n = 126;
        int a = n % 10;
        int b = (n / 10) % 10;
        int c = n / 100;
        int d = a + b + c;
        System.out.println("Исходное число: " + n);
        System.out.println("Числа для сложения: " + a + ", " + b + " и " + c);
        System.out.println("Сумма чисел: " + d);
    }

    public static void getRemainder(){
        float n = 4.89F;
        float x = n % 1;
        System.out.println("Остаток при делении: " + x);
        int a = (x < 0.5) ? (int) n : (int) n+ 1;
        System.out.println("Число: " + n);
        System.out.println("Округлено до: " + a);
    }

    public static void getDivision(){
        int q = 21;
        int w = 8;
        System.out.println(q + " / " + w + " = " + (q/w) + " и " + (q%w) + " в остатке");
    }

    public static void getReplacement(){
        int a = 5;
        int b = 3;
        System.out.println("Переменная а заданная: " + a);
        System.out.println("Переменная b заданная: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Переменная а полученная: " + a);
        System.out.println("Переменная b полученная: " + b);
    }
}
