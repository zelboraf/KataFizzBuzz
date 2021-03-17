public class FizzBuzz {
    public String of(int n) {
        if (n == 0) {
            return "0";
        }
        if (n % 3 == 0) {
            return "fizz";
        }
        if (n == 5) {
            return "buzz";
        }
        return String.valueOf(n);
    }
}
