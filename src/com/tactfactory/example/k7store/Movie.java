package com.tactfactory.example.k7store;

public class Movie {
    /** The name of the movie. */
    private String name;

    /** The current stock (in store) of this movie. */
    private int stock;

    /** The total of copies of this movies. */
    private int stockTotal;

    /** The daily rent price. */
    private float rentPrice;

    /**
     * The movie constructor.
     * @param name The -commercial- name of the movie.
     * @param stock The current stock ({@code stockTotal - <rent stocks>}).
     * @param stockTotal
     * @param rentPrice
     */
    public Movie(final String name, final int stock, final int stockTotal, final float rentPrice) {
        this.name = name;
        this.stock = stock;
        this.stockTotal = stockTotal;
        this.rentPrice = rentPrice;
    }

    /**
     * @return Returns an inline representation of a movie
     *         (example: Bambi -- 12.12{@literal €} -- 1/23131 disponible(s)).
     */
    public String getDetailsInline() {
        return String.format("%s -- %.2f€ -- %d/%d disponible(s)",
                this.name,
                this.rentPrice,
                this.stock,
                this.stockTotal);
    }

    /** @return {@code TRUE} if {@link #stock} > 0, {@code FALSE} otherwise. */
    public boolean isAvailable() {
        return this.stock > 0;
    }

    /** Decrements stock ({@link #stock} - 1). */
    public void decrementStock() {
        this.stock --;
    }

    /** Increments stock ({@link #stock} - 1). */
    public void incrementStock() {
        this.stock ++;
    }

    public String getName() {
        return this.name;
    }

    public float getRentPrice() {
        return this.rentPrice;
    }
}
