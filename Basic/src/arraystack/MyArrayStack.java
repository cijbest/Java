package arraystack;

import array.MyArray;

public class MyArrayStack {

	private MyArray stack;
	private int top;
	
	public MyArrayStack(){
		
		stack = new MyArray();
		top = 0;
	}
	
	public void push(int data){
		
		if(top == stack.ARRAY_SIZE){
			System.out.println("Stack is full");
			return;
		}
		
		stack.addElement(data);
		top++;
	}
	
	public int pop(){
		
		if(isEmpty()){
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		
		int num = stack.removeElement(top-1);
		top--;
		return num;
	}
	
	public int peek(){
		
		if(isEmpty()){
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		
		return stack.getElement(top-1); //꼭대기에 있는 요소 그냥 리턴 해 줌
	}
	
	public boolean isEmpty(){
		if(top == 0) return true;
		else return false;
	}
	
	public int getSize(){
		return stack.getSize();
	}
	
	public void printAll(){
		stack.printAll();
	}
}
