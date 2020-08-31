public class Main {
    public static void main(String[] args) {
        String passwords = "tN6WgkPg\n" +
                "eX9qZRwr\n" +
                "nQfMQjJz\n" +
                "eAEwVSfh\n" +
                "vLCnbwXK\n" +
                "HUTCjjfs\n" +
                "bRATtkPw\n" +
                "VxGSzR8y\n" +
                "qYhWYquL\n" +
                "Kk3GajkG\n" +
                "VZ3s2U9v\n" +
                "QGJXQxHc\n" +
                "AA6WZVpA\n" +
                "Cws4xyXz\n" +
                "QeY8p4aX";

        passwords = passwords.replaceAll("\n", ",");
        StringBuilder sb = new StringBuilder(passwords);
        sb.insert(0, "[");
        sb.insert(sb.length(), "]");
        passwords = sb.toString();
    }
}
