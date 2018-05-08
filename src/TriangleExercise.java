public class TriangleExercise {

    public static void main(String args[]) {
        printOneAsterisk();
        System.out.println();
        printHorizontalLine(8);
        printVerticalLine(3);
        printRightTriangle(5);
    }

    public static void printOneAsterisk() {
        System.out.print("*");
    }

    public static void printHorizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            printOneAsterisk();
        }
        System.out.println();
    }

    public static void printVerticalLine(int n) {
        for (int i = 0; i < n; i++) {
            printOneAsterisk();
            System.out.println();
        }
    }

    public static void printRightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            printHorizontalLine(i);
        }
    }
}
