package grid.model;

public class Money {
	
	public Money(){
		toString();
	}
	
	public String toString()
	{
		int worth = (int) (Math.random())*10;
		return "Client's worth: " + worth;
	}
}