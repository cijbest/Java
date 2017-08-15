package doublelinkedlist;

public class DListNode {

	private String data;
	public DListNode next;
	public DListNode prev;
	
	public DListNode(){
		prev = null;
		next = null;
	}
	
	public DListNode(String data){
		this.data = data;
		prev = null;
		next = null;
	}
	
	public DListNode(String data, DListNode prev, DListNode next){
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
	
	public String getData(){
		return data;
	}
}
