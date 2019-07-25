package com.tactfactory.example.k7store;

import java.util.Scanner;

public class MovieStoreApplication {
    public static void main(String[] args) {
        final MovieCollection store = new MovieCollection();

        System.out.println("Bonjour,");
        store.printList();

        System.out.println("Que voulez-vous faire ?");
        System.out.println("1) louer");
        System.out.println("2) rendre");
        // ...

        final Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()) {
        case 1: // Rent.
            store.startRent();
            break;
        case 2: // Return movie.
            store.stopRent();
            break;
        }

        scanner.close();
    }
}
