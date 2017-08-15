package polynomial;

public class PolyNode {
	
	private int degree;
	private int coef;
	PolyNode next;
	
	public PolyNode(int degree, int coef){
		this.degree = degree;
		this.coef = coef;
	}
	
	public int getDegree(){
		return degree;
	}
	
	public int getCoef(){
		return coef;
	}
	
	

}
