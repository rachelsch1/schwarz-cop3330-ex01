package ex01.base;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = input.nextLine();

        String outputString = "Hello, " + name + ", it's a pleasure to meet you.";

        System.out.println(outputString);
    }
}
