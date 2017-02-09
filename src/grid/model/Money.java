package grid.model;

public class Money {
	
	public Money(){
		toString();
	}
	
	public String toString()
	{
		int worth = (int) ((Math.random())*10900);
		return "Person: " + worth;
	}
}