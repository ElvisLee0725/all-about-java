package streams.practical;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws IOException {
        /*
        IntStream
                .range(1, 10)   // end value is exclusive
                .skip(5)        // skip the first 5 elements
                .forEach((x) -> System.out.println(x));
         */

        int val = IntStream
                .range(1, 10)
                .sum();
        System.out.println(val);

        Stream.of("Hello", "World", "America")
                .sorted()
                .findFirst()
                .ifPresent((x) -> System.out.println(x));

        String [] items = {"car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy"};
        Stream.of(items)
                .filter((str) -> str.startsWith("t"))
                .sorted()
                .forEach(x -> System.out.print(x + ", "));

        System.out.println();

        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map((x) -> x * x)
                .average()
                .ifPresent(n -> System.out.println(n));

        List<String> list = Arrays.asList("car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy");
        list.stream()
                .filter((str) -> str.startsWith("c"))
                .map((str) -> str.toLowerCase())
                .sorted()
                .forEach((s) -> System.out.print(s + ", "));

        System.out.println();
        // A way to read file:
        Stream<String> lines = Files.lines(Paths.get("files/wordFile.txt"));
        lines.filter((line) -> line.length() > 6)
                .sorted()
                .forEach((x) -> System.out.print(x + ", "));
        // Remember to close the file
        lines.close();

        System.out.println();
        List<String> words = Files.lines(Paths.get("files/wordFile.txt"))
                .filter((x) -> x.contains("th"))
                .collect(Collectors.toList());

        words.forEach((word) -> System.out.print(word + ", "));
        lines.close();

        System.out.println();
        Stream<String> rows = Files.lines(Paths.get("files/stockDataCsv.txt"));
//        int rowCount = (int) rows.map((x) -> x.split(","))
//                .filter((row) -> row.length > 3)
//                .count();
//        System.out.println(rowCount);

        rows.map((x) -> x.split(","))
                .filter((row) -> row.length > 3)
                .filter((row) -> Integer.parseInt(row[1].trim()) > 15)
                        .forEach((x) -> System.out.println(x[0].trim() + " " + x[1].trim() + " " + x[2].trim()));

        rows.close();
    }

}
