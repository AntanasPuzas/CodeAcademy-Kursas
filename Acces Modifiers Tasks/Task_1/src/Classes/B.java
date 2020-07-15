package Classes;

public class B {
    int v1 = x();
    int v2 = y();
    int v3 = w();
    int v4 = z();

    private static int x() {
        return 3;
    }

    static int y () {
        return 2;
    }

    protected static int w () {
        return 1;
    }

    public static int z () {
        return 0;
    }
}
