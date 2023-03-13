package homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    public static List<Quote> readQuoteFromFile(String fileName) throws FileNotFoundException {
        List<Quote> result = new ArrayList<>();
        Scanner scanner = new Scanner(new File("src/main/resources", fileName));
        while (scanner.hasNext()) {
            result.add(buildQuote(scanner.nextLine()));
        }
        return result;
    }

    private static Quote buildQuote(String line) {
        String[] splitArray = line.split("~");
        return Quote.builder()
                .author(splitArray[0])
                .quote(splitArray[1])
                .build();
    }
}
