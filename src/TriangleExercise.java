public class TriangleExercise {

    public static void main(String args[]) {
        printOneAsterisk();
        System.out.println();
        printHorizontalLine(8);
        System.out.println();
        printVerticalLine(3);
    }

    public static void printOneAsterisk() {
        System.out.print("*");
    }

    public static void printHorizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            printOneAsterisk();
        }
    }

    public static void printVerticalLine(int n) {
        for (int i = 0; i < n; i++) {
            printOneAsterisk();
            System.out.println();
        }
    }

}
