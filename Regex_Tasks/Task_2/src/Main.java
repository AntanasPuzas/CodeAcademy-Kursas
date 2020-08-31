public class Main {
    public static void main(String[] args) {
        String correctEmail = "vardas@codeacademy.lt";
        String wrongEmail = "vardas@codea@cademy.lt";

        System.out.println(emailValidator(correctEmail));
        System.out.println(emailValidator(wrongEmail));
    }

    static boolean emailValidator(String email) {
        return email.matches("^(\\w*@\\w*\\.\\w*)");
    }
}
