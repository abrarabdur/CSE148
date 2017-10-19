package p1;

public class Stock {
	private String symbol;
	private String name;
	private double price;

	// overloaded constructors
	public Stock(String symbol, String name, double price) {
		super();
		this.symbol = symbol;
		this.name = name;
		this.price = price;
	}

	public Stock(String symbol, String name) {
		super();
		this.symbol = symbol;
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Symbol=" + symbol + ", Name=" + name + ", Price=" + price;
	}

}
