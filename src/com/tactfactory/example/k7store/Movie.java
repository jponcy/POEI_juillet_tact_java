package com.tactfactory.example.k7store;

public class Movie {
    /** The name of the movie. */
    private String name;

    /** The current stock (in store) of this movie. */
    private short stock;

    /** The total of copies of this movies. */
    private short stockTotal;

    /** The daily location price. */
    private float locationPrice;

    /**
     * The movie constructor.
     * @param name
     * @param stock
     * @param stockTotal
     * @param locationPrice
     */
    public Movie(final String name, final short stock, final short stockTotal, final float locationPrice) {
        this.name = name;
        this.stock = stock;
        this.stockTotal = stockTotal;
        this.locationPrice = locationPrice;
    }

    public String getDetailsInline() {
        return String.format("%s -- %.2f -- %d/%d disponible(s)",
                this.name,
                this.locationPrice,
                this.stock,
                this.stockTotal);
    }
}
