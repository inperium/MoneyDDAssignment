package grid.model;

public class Money {
	
	private int worth;
	
	public Money(){
		int worth = (int) ((Math.random()) * 1000);
		toString();
	}
	
	public String toString()
	{
		return "The worth is: " + worth;
	}
}