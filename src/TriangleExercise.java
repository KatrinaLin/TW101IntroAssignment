public class TriangleExercise {

    public static void main(String args[]) {
        printOneAsterisk();
        System.out.println();
        printNAsterisk(8);
    }

    public static void printOneAsterisk() {
        System.out.print("*");
    }

    public static void printNAsterisk(int n) {
        for (int i = 0; i < n; i++) {
            printOneAsterisk();
        }
    }
}
