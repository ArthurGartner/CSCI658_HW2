public class BookInStock {
    private String isbn;
    private double price;

    public BookInStock(String isbn, double price) {
        if (isbn.isEmpty() || price <= 0) {
            throw new IllegalArgumentException("Invalid arguments given.");
        }
            this.isbn = isbn;
            this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String priceAsString()
    {
        return new String("$" + String.format("%.2f", price));
    }
}
