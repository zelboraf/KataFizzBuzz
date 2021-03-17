public class FizzBuzz {
    public String of(int n) {
        if (n == 0) {
            return "0";
        }
        String result = "";
        if (n % 3 == 0) {
            result += "fizz";
        }
        if (n % 5 == 0) {
            result += "buzz";
        }
        return result.equals("") ? String.valueOf(n) : result;
    }
}
