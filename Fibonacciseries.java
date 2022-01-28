package selenium;

public class Fibonacciseries {
	public static void main(String[] args) {
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		System.out.println("Fibonacci series");
		for (int i = 1; i <= range; ++i) {
			int thirdNum = firstNum + secNum;
			firstNum = secNum;
			secNum = thirdNum;
			System.out.println(thirdNum);
		}
	}

}
