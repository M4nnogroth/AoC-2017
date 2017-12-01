public class DayOne {
    public static int dayOnePartOne(String captcha) {
        int sum = 0;

        for (int i = 0; i < captcha.length() - 1; i++) {
            if (captcha.charAt(0) == captcha.charAt(captcha.length() - 1)) sum += captcha.charAt(0);

            if (captcha.charAt(i) == captcha.charAt(i + 1)) {
                sum += Character.getNumericValue(captcha.charAt(i));
            }
        }
        return sum;
    }

    public static int dayOnePartTwo(String captcha) {
        int sum = 0;
        int halfway = captcha.length() / 2;

        int j = 0;
        for (int i = 0; i < captcha.length(); i++, j++) {
            if (j + halfway > captcha.length() - 1) j = -halfway;

            if (captcha.charAt(i) == captcha.charAt((j + halfway))) {
                sum += Character.getNumericValue(captcha.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Part one: " + dayOnePartOne("1122"));
        System.out.println("Part two: " + dayOnePartTwo("1212"));
    }
}
