import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.Test.*;

import java.awt.print.Book;

public class BookInStockTest {
    private String isbn;
    private String isbn1;
    private String isbn2;
    private double price;
    private double price1;
    private double price2;
    private double price3;

    @Before
    public void setUp() throws Exception {
        isbn = "ABCD1234";
        isbn1 = "ABCD-1234";
        isbn2 = "";
        price = 12.23;
        price1 = 0;
        price2 = 32;
        price3 = -1;
    }

    @Test
    public void getIsbn() { assertEquals("expect ABCD1234 for isbn ABCD1234", isbn, new BookInStock(isbn, price).getIsbn());}

    @Test
    public void getIsbn1() { assertEquals("expect ABCD-1234 for isbn ABCD-1234", isbn1, new BookInStock(isbn1, price).getIsbn());}

    @Test
    public void getIsbnEmpty() {
        try{
            BookInStock book = new BookInStock(isbn2, price);
        } catch (IllegalArgumentException e)
        {
            return;
        }
        fail("failure");
    }

    @Test
    public void getPrice0() {
        try{
            BookInStock book = new BookInStock(isbn, price1);
        } catch (IllegalArgumentException e)
        {
            return;
        }
        fail("failure");
    }

    @Test
    public void getPriceNegative() {
        try{
            BookInStock book = new BookInStock(isbn, price3);
        } catch (IllegalArgumentException e)
        {
            return;
        }
        fail("failure");
    }

    @Test
    public void getPriceFormat() { assertEquals("Expect proper price String format", new String("$" + String.format("%.2f", price2)), new BookInStock(isbn, price2).priceAsString());}

    @Test
    public void getPrice() {assertEquals("Expect no delta between input value and instance value", price2, new BookInStock(isbn, price2).getPrice(), 0);}
}