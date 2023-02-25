package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.println("Podaj liczbe");
            input = scanner.nextInt();
            if (input <= 100) {
                System.out.println("Podana liczba jest za mala.");
            } else if (input >= 200) {
                System.out.println("Podana liczba jest za duza.");
            } else if (input % 3 != 0) {
                System.out.println("Podana liczba nie jest podzielna przez 3.");
            } else {
                System.out.println("Podana liczba jest ok");
            }

        } while (!((input > 100) && (input < 200) && (input % 3 == 0)));

        scanner.close();

    }
}
