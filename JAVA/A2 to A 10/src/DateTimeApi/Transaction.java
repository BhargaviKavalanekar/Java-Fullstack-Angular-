package DateTimeApi;

public class Transaction {
	private Trade trader;
	private int year;
	private int value;

	public Transaction(Trade trader, int year, int value)
	{
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trade getTrader(){ 
		return this.trader;
	}

	public int getYear(){
		return this.year;
	}

	public int getValue(){
		return this.value;
	}

	@Override
	public String toString() {
		return "Transaction [year=" + year + ", value=" + value + "]";
	}
}
