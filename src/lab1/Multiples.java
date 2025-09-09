package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples());
    }

    private static int multiples() {
        int i = 1;
        int count = 0;

        while (i < 1000) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
            i++;
        }
        return count;
    }
}
