public class PowerOfTwo {
    public static void main(String[] args) {
        int N = 3;

        if (N > 0 && (N & (N - 1)) == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static class SumOfDigits {
        public static int sumOfDigits(int N) {
            int sum = 0;

            while (N != 0) {
                sum += N % 10;
                N /= 10;
            }

            return sum;
        }

        public static void main(String[] args) {
            int N = 179;

            int sum = sumOfDigits(N);
            System.out.println("Sum of digits: " + sum);
        }
    }
}

