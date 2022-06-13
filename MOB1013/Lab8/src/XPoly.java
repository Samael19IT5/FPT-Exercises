import java.util.Arrays;

public final class XPoly {
    public static final double sum(double... x) {
        double s = 0;
        for (double v : x) {
            s += v;
        }
        return s;
    }

    public static final double min(double... x) {
        Arrays.sort(x);
        return x[0];
    }

    public static final double max(double... x) {
        Arrays.sort(x);
        return x[x.length - 1];
    }

    public static final String toUpperFirstChar(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            char firstChar = words[i].charAt(0);
            String upperFirstChar = String.valueOf(firstChar).toUpperCase();
            words[i] = upperFirstChar + words[i].substring(1);
        }
        return String.join(" ", words);
    }
}
