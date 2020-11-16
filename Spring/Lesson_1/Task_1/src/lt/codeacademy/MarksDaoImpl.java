package lt.codeacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MarksDaoImpl implements MarksDao {
    @Override
    public List<Integer> getMarks() {
        // return Arrays.asList(5, 7, 10, 10, 8, 10); <-- Java 8
        return List.of(5, 7, 10, 10, 8, 10); // <-- Java 9
    }
}
