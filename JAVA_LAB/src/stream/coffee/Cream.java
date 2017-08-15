package stream.coffee;

public class Cream extends Decorator{

	public Cream(Coffee coffee) {
		super(coffee);
	}
	
	public void brewing(){
		super.brewing();
		System.out.print(" Adding Wipping Cream");
	}

}
