package com.tactfactory.example.k7store;

public class MovieCollection {
    private Movie[] movies;

    public MovieCollection() {
        // TODO: Init movies.
//        movies = ...
    }

    public void printList() {
        final StringBuilder sb = new StringBuilder();
        Movie movie;

        sb.append("Voici la liste des films :\n");

        for (int i = 0; i < this.movies.length; i ++) {
            movie = this.movies[i];

            sb.append(i);
            sb.append(") ");
            sb.append(movie.getDetailsInline());
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
