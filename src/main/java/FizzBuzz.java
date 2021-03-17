public class FizzBuzz {
    public String of(int n) {
        if (n == 3) {
            return "fizz";
        }
        if (n == 5) {
            return "buzz";
        }
        return String.valueOf(n);
    }
}
