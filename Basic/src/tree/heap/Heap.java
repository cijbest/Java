package tree.heap;

public class Heap {
	private int HEAP_SIZE;
	private int heapArr[];
	
	public Heap(){
		HEAP_SIZE = 0;
		heapArr = new int[50];
	}
	
	public void insertHeap(int input){
		
		int i = ++HEAP_SIZE;
		while(i != 1 && (input > heapArr[i/2])){ //max heap  / min heap을 하고 싶으면 input < heapArr[i/2] 로 변경
			heapArr[i] = heapArr[i/2];
			i = i/2;
		}
		heapArr[i] = input;
	}
	
	public int deleteHeap(){
		int parent, child;
		int data, temp;
		data = heapArr[1]; //맨 위에 있는 거 줄
		
		temp = heapArr[HEAP_SIZE]; // 맨 뒤에 있는거 하나 가져 옴 / 0번 인덱스 안씀
		HEAP_SIZE -= 1; //하나 감소
		parent = 1; child = 2;
		
		while(child <= HEAP_SIZE){
			if((child < HEAP_SIZE) && (heapArr[child] < heapArr[child+1])){ //v min?
				child++;
			}
			
			if(temp >= heapArr[child]) break; //v min
			heapArr[parent] = heapArr[child];
			parent = child;
			child *= 2;
		}
		
		heapArr[parent] = temp;
		return data;
	}
	
	public int getHeapSize(){
		return HEAP_SIZE;
	}
	
	public void printHeap(){
		System.out.printf("\nHaep >>> ");
		for(int i = 1; i <= HEAP_SIZE; i++){
			System.out.printf("[%d]", heapArr[i]);
		}
	}
	
	public static void main(String[] args){
		
		Heap h = new Heap();
		h.insertHeap(13);
		h.insertHeap(8);
		h.insertHeap(10);
		h.insertHeap(15);
		h.insertHeap(20);
		h.insertHeap(19);
		
		h.printHeap();
		
		int n, data;
		n = h.getHeapSize();
		for(int i = 1; i<= n; i++){ //N
			data = h.deleteHeap(); //logN
			System.out.printf("\n deleted Item : [%d]", data);
		}
	}

}
