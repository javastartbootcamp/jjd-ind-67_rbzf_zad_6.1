package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        boolean check;
        do {
            System.out.println("Podaj liczbe");
            input = scanner.nextInt();
            if (input <= 100) {
                System.out.println("Podana liczba jest za mala.");
                check = false;
            } else if (input >= 200) {
                System.out.println("Podana liczba jest za duza.");
                check = false;
            } else if (input % 3 != 0) {
                System.out.println("Podana liczba nie jest podzielna przez 3.");
                check = false;
            } else {
                System.out.println("Podana liczba jest ok");
                check = true;
            }
        } while (!check);
    }
}
