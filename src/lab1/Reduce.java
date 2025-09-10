package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(1000));
    }

    public static int reduce(int n) {
        int count = 0;
        while (n != 0) {

            if (n % 2 == 0) {
                n /= 2;
            }
            else {
                n--;
            }
            count++;
        }
        return count;
    }
}
