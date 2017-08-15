package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = new int[5]; // 20byte
		arr[0] = 3;
		arr[1] = 4;
		arr[2] = 5;
		
		System.out.println(arr.length); //배열 사이즈
		
		for(int i = 0; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
		
		for(int n : arr){ //호이지문 -> 배열 arr에 있는 모든 배열을 다 돌림
			System.out.println(n);
		}
		
	}

}
