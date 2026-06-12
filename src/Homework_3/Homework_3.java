package Homework_3;

import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args){
        while (true){
            System.out.print("Enter task number(1-5) or exit(6): ");
            String task = new Scanner(System.in).nextLine();
            switch (task){
                case "1" -> getNumber();
                case "2" -> getTemperature();
                case "3" -> getSquares();
                case "4" -> getSequence();
                case "5" -> getSum();
                case "6" -> System.exit(0);
                default -> System.out.println("Incorrect value");
            }
        }
    }

    public static void getNumber(){
        System.out.print("Enter any number: ");
        String number = new Scanner(System.in).nextLine();
        try {
            int num = Integer.parseInt(number);
            if (num % 2 == 0){
                System.out.println("You entered an even number");
            }else {
                System.out.println("You entered an odd number");
            }
        }catch (NumberFormatException e) {
            System.out.println("Incorrect value");
        }
    }

    public static void getTemperature(){
        System.out.print("Enter the outside temperature: ");
        String temperature = new Scanner(System.in).nextLine();
        try {
            int temp = Integer.parseInt(temperature);
            if (temp > -5){
                System.out.println("Warm");
            } else if (temp > -20) {
                System.out.println("Normal");
            } else {
                System.out.println("Cold");
            }
        }catch (NumberFormatException e) {
            System.out.println("Incorrect value");
        }
    }

    public static void getSquares(){
        int num = 10;
        System.out.print("While loop: ");
        while (num <= 20){
            System.out.print(num * num + " ");
            num += 1;
        }
        System.out.print("\nFor loop: ");
        for (int numfor = 10; numfor <= 20; numfor++){
            System.out.print(numfor * numfor + " ");
        }
        System.out.println("\n");
    }

    public static void getSequence(){
        int sum = 7;
        while (sum < 100){
            System.out.print(sum + " ");
            sum += 7 ;
        }
        System.out.println("\n");
    }

    public static void getSum(){
        System.out.print("Enter a positive number: ");
        String number = new Scanner(System.in).nextLine();
        try {
            int sum = 0;
            int num = Integer.parseInt(number);
            if (num == 1){
                System.out.println(1);
            }else if (num > 1){
                for (int value = 0; value < num; value++){
                    sum += value;
                }
                System.out.println(sum);
            }else {
                System.out.println("Negative number");
            }
        }catch (NumberFormatException e) {
            System.out.println("Incorrect value");
        }
    }
}
