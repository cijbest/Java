package array;

public class MyArray {
	
	Object[] objectArr; // Object : �迭�� ��� Ÿ���� �ְ� ���� �� ����Ѵ�.
	
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
	
	public void addElement(int num){ //num�� intArr�� �־��
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
	
	public int removeElement(int position){ // position : ������ ��ġ(�ε��� ��ȣ)
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
	
	public boolean isEmpty(){ //�迭�� ����ִ���
		if(count == 0){
			return true;
		}return false;
		
	}
	
	public int getSize(){ //�迭 ����� ������
		return count;
	}
	
	public int getElement(int position){ //position�� �ִ� ���� ������ �Ͷ�(���� �� ����)
		if(position < 0 || position >=count){
			System.out.println("�˻� ��ġ ���� �̺��. ���� ����Ʈ�� ������ " + count + "�� �Դϴ�.");
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
		for(int i = 0; i < count; i++){ //�ᱹ count�� �����Ͱ� ��� �ִ� �迭 ũ�Ⱚ�� �ȴ�.
			intArr[i] = 0;
		}
		count = 0;
	}

}