package array;

public class MyArray {
	
	Object[] objectArr; // Object : 배열에 모든 타입을 넣고 싶은 때 사용한다.
	
	int[] intArr;
	public int ARRAY_SIZE;
	int count;
	public static final int ERROR_NUM = -999999;
	
	public MyArray(){
		ARRAY_SIZE = 10;
		intArr = new int [ARRAY_SIZE];
		count = 0;
	}
	
	public MyArray(int size){
		ARRAY_SIZE = size;
		intArr = new int [ARRAY_SIZE];
		count = 0;
	}
	
	public void addElement(int num){ //num을 intArr에 넣어라
		if(isFull()){
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;
		
	}
	
	public void intsertElement(int position, int num){
		if(isFull()){
			System.out.println("not enough memory");
			return;
		}
		if(position < 0 || position > count){
			System.out.println("position error");
			return;
		}
		
		for(int i = count ; i-1 >= position; i--){
			intArr[i] = intArr[i-1];
		}
		intArr[position] = num;
		count++;
		
	}
	
	public int removeElement(int position){ // position : 삭제할 위치(인덱스 번호)
		int ret = ERROR_NUM;
		if(isEmpty()){
			System.out.println("there is no element");
			return ret;
		}
		if(position < 0 || position >= count){
			System.out.println("insert Error");
			return ret;
		}
		for(int i = position; i < count-1 ; i++){
			intArr[i] = intArr[i+1];
		}
		count--;
		return ret;
	}
	
	public boolean isEmpty(){ //배열이 비어있는지
		if(count == 0){
			return true;
		}return false;
		
	}
	
	public int getSize(){ //배열 사이즈가 얼마인지
		return count;
	}
	
	public int getElement(int position){ //position에 있는 값을 가지고 와라(지울 값 리턴)
		if(position < 0 || position >=count){
			System.out.println("검색 위치 오류 이비다. 현재 리스트의 개수는 " + count + "개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	
	public boolean isFull(){
		if(count == ARRAY_SIZE){
			return true;
		}
		else return false;
	}
	
	public void printAll(){
		for(int i = 0; i < count; i++){
			System.out.println(intArr[i]);
		}
	}
	
	public void removeAll(){
		for(int i = 0; i < count; i++){ //결국 count는 데이터가 들어 있는 배열 크기값이 된다.
			intArr[i] = 0;
		}
		count = 0;
	}

}
