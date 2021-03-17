public class FizzBuzz {
    public String of(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        if (n % 3 == 0) {
            result.append("fizz");
        }
        if (n % 5 == 0) {
            result.append("buzz");
        }
        return result.isEmpty() ? String.valueOf(n) : result.toString();
    }
}
