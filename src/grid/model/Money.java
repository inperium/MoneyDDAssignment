package grid.model;

public class Money {
	
	private int amount;
	
	public Money(){
		this.amount = calculateWorth();
	}
	
	public int calculateWorth()
	{
		int money = (int) ((Math.random())*10900);
		return money;
	}
	
	public String toString()
	{
		String value = "$  " +  String.valueOf(amount);
		return value;
	}
}