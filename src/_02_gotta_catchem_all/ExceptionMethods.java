package _02_gotta_catchem_all;

public class ExceptionMethods {
	static String reverseString(String s) {
		if (s.equals("")) {
			throw new IllegalStateException();
		} else {
			String s2 = "";
			char[] c = s.toCharArray();
			for (int i = c.length - 1; i >= 0; i--) {
				s2 += c[i];
			}
			return s2;
		}
	}

	static double divide(double a, double b) {
		if (b == 0.0) {
			throw new IllegalArgumentException();
		} else {
			return a / b;
		}
	}
}
