package visitor;

public class Liquor implements Visitable{

	private double price;
	
	public Liquor(double newPrice) {
		price = newPrice;
	}
	
	public double getPrice(){
		return price;
	}
	
	@Override
	public double accept(Visitor visitor) {

		return visitor.visit(this);
	}

}
