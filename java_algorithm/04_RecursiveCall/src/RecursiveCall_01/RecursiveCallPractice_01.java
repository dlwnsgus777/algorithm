package RecursiveCall_01;

public class RecursiveCallPractice_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorialNum = factorial(4);
		System.out.println(factorialNum);
	}
	
	public static int factorial(int num) {
		if (num > 1) {
			return num * factorial(num - 1);
		} else {
			return num;
		}
	}

}
