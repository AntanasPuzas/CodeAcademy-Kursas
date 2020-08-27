import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Path peoplePath = Paths.get("C:\\Users\\Puzas\\Desktop\\CodeAcademy-Kursas\\people.txt");
        List<String> names = new ArrayList<>();
        try {
            names = Files.lines(peoplePath)
                    .map(line -> line.split(", ")[1])
                    .distinct()
                    .sorted()
                    .filter(string -> !string.equals("vardas"))
                    .collect(Collectors.toList());
            names.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
