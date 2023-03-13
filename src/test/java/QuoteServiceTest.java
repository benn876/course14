import homework.Quote;
import homework.QuoteService;
import org.assertj.core.api.Assertions;
import org.assertj.core.groups.Tuple;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class QuoteServiceTest {
    @Test
    @DisplayName("WHEN the a valid parameter is sent THEN the QuoteService is created correctly")
    public void testCorrectParameterCreation() {
        //GIVEN
        List<Quote> quotes = List.of(Quote.builder()
                .author("Beni")
                .quote("Castravetele este verde")
                .build());
        //WHEN
        QuoteService quoteService = new QuoteService(quotes);

        //THEN
        Assertions.assertThat(quoteService.getQuotes()).hasSize(1);
    }

    @Test
    public void testNullAsParameter() {
        QuoteService quoteService = new QuoteService(null);
        Assertions.assertThat(quoteService.getQuotes()).isEmpty();
    }

    @Test
    public void testEmptyListAsParameter() {
        QuoteService quoteService = new QuoteService(new ArrayList<>());
        Assertions.assertThat(quoteService.getQuotes()).isEmpty();
    }

    @Test
    @DisplayName("WHEN calling getAllQuotes correctly THEN the correct response is returned")
    public void testGetAllQuotes() {
        //GIVEN
        List<Quote> quotes = List.of(
                Quote.builder()
                        .quote("A fi sau a nu fi")
                        .author("Schecspper")
                        .build(),
                Quote.builder()
                        .quote("Timpul inseamna bani")
                        .author("Mihai")
                        .build());
        QuoteService quoteService = new QuoteService(quotes);

        //WHEN
        List<String> allQuotes = quoteService.getAllQuotes();

        //THEN
        Assertions.assertThat(allQuotes)
                .hasSize(2)
                .containsExactlyInAnyOrder("A fi sau a nu fi", "Timpul inseamna bani");

        Assertions.assertThat(quoteService.getQuotes()).hasSize(2);
        Assertions.assertThat(quoteService.getQuotes()).extracting("quote", "author")
                .containsExactlyInAnyOrder(Tuple.tuple("A fi sau a nu fi", "Schecspper"),
                        Tuple.tuple("Timpul inseamna bani", "Mihai"));

        Assertions.assertThat(quoteService.getQuotes()).extracting("author")
                .containsExactlyInAnyOrder("Schecspper", "Mihai");

    }
}
