package grid.model;

public class Money {
	
	public Money(){
		toString();
	}
	
	public String toString()
	{
		int worth = (int) (Math.random());
		return "The worth is: " + worth;
	}
}