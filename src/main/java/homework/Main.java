package homework;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Quote> quotes = FileReader.readQuoteFromFile("quotes.txt");
        QuoteService quoteService = new QuoteService(quotes);
        System.out.println(quoteService.getAllQuotes());
    }
}
