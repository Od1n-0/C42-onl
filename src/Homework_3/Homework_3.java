package Homework_3;

import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args){
        System.out.print("Enter task number(1-5): ");
        String task = new Scanner(System.in).nextLine();
        switch (task){
            case "1":
                FirstTask();
                break;
            case "2":
                SecondTask();
                break;
            case "3":
                ThirdTask();
                break;
            case "4":
                FourthTask();
                break;
            case "5":
                FifthTask();
                break;
        }
    }
    public static void FirstTask(){
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
    public static void SecondTask(){
        System.out.print("Enter the outside temperature: ");
        String temperature = new Scanner(System.in).nextLine();
        try {
            int temp = Integer.parseInt(temperature);
            if (temp > -5){
                System.out.println("Warm");
            } else if (temp <= -5 && temp > -20) {
                System.out.println("Normal");
            } else {
                System.out.println("Cold");
            }
        }catch (NumberFormatException e) {
            System.out.println("Incorrect value");
        }
    }
    public static void ThirdTask(){
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
    }
    public static void FourthTask(){
        int sum = 7;
        while (sum < 100){
            System.out.print(sum + " ");
            sum += 7 ;
        }
    }
    public static void FifthTask(){
        System.out.print("Enter a positive number: ");
        String number = new Scanner(System.in).nextLine();
        try {
            int sum = 0;
            int num = Integer.parseInt(number);
            if (num > 0){
                for (int value = 0; value <= num; value++){
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
