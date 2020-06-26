package udemy_exercises.IO;

import java.util.Scanner;

//READING USER INPUT CHALLENGE


public class Main {

    private static Scanner scanner = new Scanner((System.in));


    public static void main(String[] args) {
        boolean quit = false;
        startCounter();
        int total = 0;

        while(!quit) {
            if (scanner.hasNextInt()) {
                total += scanner.nextInt();
                System.out.println(total + "\nEnter a non-int to terminate the program.");
                scanner.nextLine();

            }
                else {
                    quit = true;
                }
        }
    }

    private static void startCounter() {
        System.out.println("\nEnter some integers. Like, just go nuts...");
    }

}
