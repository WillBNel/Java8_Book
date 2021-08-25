package calculator;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(addTwo(8084d, 1540d));
		System.out.println(mulTwo(145d, 56d));
		System.out.println(minTwo(445546d, 1546544d));
		divTwo(6d, 3d);
	}

	public static double addTwo(double numb1, double numb2) {
		return numb1 + numb2;
	}

	public static double mulTwo(double numb1, double numb2) {
		return numb1 * numb2;
	}

	public static double minTwo(double numb1, double numb2) {
		return numb1 - numb2;
	}

	public static void divTwo(double numb1, double numb2) {
		if (numb1 < numb2) {
			System.out.println("The devision cannot be perfomed");

		} else {
			System.out.println(numb1 / numb2);
		}

	}
}
