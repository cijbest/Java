package array;

public class TwoDimensionTest {

	public static void main(String[] args) {

		int[][] arr = new int[3][5];
		
		System.out.println(arr.length); //���� ����
		System.out.println(arr[0].length); //���� ����
		
		int[][] gugu = new int[8][9];
		
		for(int i = 0; i < gugu.length; i++){
			for(int j = 0; j < gugu[0].length; j++){
				gugu[i][j] = (i+2)*(j+1);
			}
		}
		
		for(int i = 0; i < gugu.length; i++){
			for(int j = 0; j < gugu[0].length; j++){
				System.out.print((i+2) +"*" + (j+1) + "=" + gugu[i][j] + " ");
			}System.out.println();
		}
		
		
		
	}

}