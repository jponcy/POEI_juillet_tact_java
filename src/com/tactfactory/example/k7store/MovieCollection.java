package com.tactfactory.example.k7store;

import java.util.Scanner;

/**
 * Manages a list of movies.
 * <p><b>NOTE:</b> Salut</p>
 */
public class MovieCollection {
    private Movie[] movies;

    public MovieCollection() {
        // Init movies.
        this.movies = new Movie[] {
                new Movie("Bambi", 3, 10, 1.5f),
                new Movie("Vice et versa", 5, 15, 2.1f),
                new Movie("Le dernier samouraï", 3, 3, 1f),
                new Movie("Star Wars: a new hope", 6, 20, 1.5f)
        };
    }

    /**
     * Prints the list of movies in console.
     */
    public void printList() {
        final StringBuilder sb = new StringBuilder();
        Movie movie;

        sb.append("Voici la liste des films :\n");

        for (int i = 0; i < this.movies.length; i ++) {
            movie = this.movies[i];

            sb.append(i + 1);
            sb.append(") ");
            sb.append(movie.getDetailsInline());
            sb.append('\n');
        }

        System.out.println(sb);
    }

    /**
     * Helps to choice a movie then starts the rent.
     */
    public void startRent() {
        final Movie movie = this.choiceMovie();

        if (movie != null) { // Si un film a ete choisi/trouve.
            if (movie.isAvailable()) { // Si le film est disponible.
                movie.decrementStock();
                System.out.println(String.format("N'oubliez pas de prendre votre K7 de %s", movie.getName()));
            } else { // Sinon (si le film existe mais n'est pas disponible).
                System.out.println("Désolé mais ce film n'est actuellement pas disponible");
            }
        }
    }

    public void stopRent() {
        final Movie movie = this.choiceMovie();

        if (movie != null) { // Si un film a ete choisi/trouve.
            movie.incrementStock();
            int dayNb = this.askIntValue("Combien de temps à durer votre emprunt ?");
            System.out.println(String.format("Cela vous fera %.2f€.", movie.getRentPrice() * dayNb));
            System.out.println(String.format(
                    "Merci de votre confiance, nous espérons que le film %s vous a plus. A bientôt.", movie.getName()));
        }
    }

    /**
     * Retrieves a movie from collection from his number (not array index).
     * @param movieNumber The movie number from list (starts at 1).
     * @return The movie if found, {@code NULL} otherwise.
     */
    private Movie retrieveMovie(int movieNumber) {
        final Movie result;

        if (movieNumber >= 1 && movieNumber <= this.movies.length) {
            result = this.movies[movieNumber - 1];
        } else {
            result = null;
        }

        return result;
    }

    private Movie choiceMovie() {
        this.printList();
        final int movieNumber = this.askIntValue("Quel film voulez-vous louer ?");

        final Movie movie = this.retrieveMovie(movieNumber);

        if (movie == null) { // Si le film n'existe pas.
            System.out.println("Film non trouvé");
        }

        return movie;
    }

    /**
     * Asks a question to user then wait a response (integer value).
     * @param message Message or question.
     * @return
     */
    private int askIntValue(final String message) {
        System.out.println(message);

        final Scanner scanner = new Scanner(System.in);
        final int value = scanner.nextInt();

        return value;
    }
}
