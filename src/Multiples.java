public class Multiples {
    public static void main(String[] args) {
        int total = 0;
        int i = 1;
        while (i < 1000) {
            if (i % 3 == 0 || i % 5 == 0) {
                total += 1;
            }
            i += 1;
        }
        System.out.println("there are " + total + " non-negative multiples of 3 or 5 below 1000");
    }
}

