package recursive;

public class RecursiveTest {

	public static void main(String[] args) { //피보나치 : 0 1 1 2 3 5 .....

		int n = factorial_iter(5);
		System.out.println(n);
		
		n = factorial(5);
		System.out.println(n);
		
		int fib = fibonacci(10);
		System.out.println(fib);
		
		fib = fibonacci_iter(10);
		System.out.println("for문 -> "+fib);
		
		
	}
	
	public static int fibonacci_iter(int n){
		if(n < 2) return n;
		else{
			int pre = 0;
			int current = 1;
			int next = 0;
			for(int i = 2; i <= n ; i++){
				next = pre + current;
				pre = current;
				current =next;
			}
			return current;
		}
		
	}
	
	public static int fibonacci(int n){
		if(n == 0) return 0;
		else if(n == 1) return 1;
		else return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static int factorial_iter(int n){
		int i;
		int ret = 1;
		for(i = n; i >= 1; i--){
			ret = ret * i;
		}
		
		return ret;
	}
	
	public static int factorial(int n){
		if(n == 1){
			return 1;
		}
		else{
			return n*factorial_iter(n-1);
		}
		
	}
	
	

}
