package Homework_2;

public class Homework_2 {
    public static void main(String[] args) {
        FourthTask();
    }

    public static void FirstTask() {
        int b = 10;
        int c = 4;
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("4*(b+c-1)/2 = " + (4 * (b + c - 1) / 2));
    }

    public static void SecondTask(){
        int n = 26;
        int a = n / 10;
        int b = n % 10;
        int c = a + b;
        System.out.println("Исходное число: " + n);
        System.out.println("Числа для сложения: " + a + " и " + b);
        System.out.println("Сумма чисел: " + c);
    }

    public static void ThirdTask() {
        int n = 126;
        int a = n % 10;
        int b = (n / 10) % 10;
        int c = n / 100;
        int d = a + b + c;
        System.out.println("Исходное число: " + n);
        System.out.println("Числа для сложения: " + a + ", " + b + " и " + c);
        System.out.println("Сумма чисел: " + d);
    }

    public static void FourthTask(){
        float n = 4.49F;
        float x = n % 1;
        System.out.println("Остаток при делении: " + x);
        int a = (x < 0.5) ? (int) n : (int) n+ 1;
        System.out.println("Число: " + n);
        System.out.println("Округлено до: " + a);
    }

    public static void FifthTask(){
        int q = 21;
        int w = 8;
        int a = q / w;
        int b = q % w;
        System.out.println(q + " / " + w + " = " + a + " и " + b + " в остатке");
    }

    public static void SixthTask(){
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
