package lt.codeacademy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println(new GradeService(new MarksDaoImpl()).average());

        GradeService gradeService1 = new GradeService();
        gradeService1.setMarksDao(new MarksDaoImpl());
        System.out.println(gradeService1.average());

    }

    private static class GradeService {

        private MarksDao marksDao;

        public GradeService(MarksDao marksDao) {
            this.marksDao = marksDao;
        }

        public GradeService() {}

        public void setMarksDao(MarksDao marksDao) {
            this.marksDao = marksDao;
        }

        public double average() {
            return marksDao.getMarks().stream()
                    .mapToInt((x) -> x)
                    .average().getAsDouble();
        }
    }
}

// Service (average) --> DAO (Data Access Object) (getMarks())

