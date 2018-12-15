package first.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("to find out what Christmas means to you --> enter a number from 1 to 3");

        int x = scanner.nextInt();
        if (x == 1) {
            System.out.print("Christmas is about opening your presents!");
        } else if (x == 2) {
            System.out.print("Christmas is about opening your heart!");
        } else if (x == 3) {
            System.out.print("Christmas is about opening Kinder Surprise Eggs from Geo!");
        } else {
            System.out.print("Naughty!!!");
        }
    }
}

