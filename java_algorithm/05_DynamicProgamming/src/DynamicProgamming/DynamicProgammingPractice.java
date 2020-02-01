package DynamicProgamming;

public class DynamicProgammingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(10));
	}
	
	public static int fibo(int num) {
		int[] fiboArr = new int[num + 1];
		fiboArr[0] = 0;
		fiboArr[1] = 1;
		
		for (int i = 2; i < fiboArr.length; i++) {
			fiboArr[i] = fiboArr[i - 1] + fiboArr[i - 2]; 
		}
		return fiboArr[num];
	}

}
