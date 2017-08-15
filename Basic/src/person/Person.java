package person;

public class Person {

	int age;
	String name;
	boolean isMarried;//String marry;
	int childNum;
	
	//constructor overloading [메소드 오버로딩]
	public Person(){}
	
	
	public Person(String name){
		this.name = name;
	}
	
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	///////////////////////////////////////
	public void setAge(int a){
		age = a;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setIsMarried(boolean m){
		isMarried = m;
	}
	
	public void setChildNum(int c){
		childNum = c;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean setIsMarried(){
		return isMarried;
	}
	
	public int getChildNum(){
		return childNum;
	}
	
}
