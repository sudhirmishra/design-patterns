package visitor;

public class Necessity implements Visitable{
	
	private double price;
	
	public Necessity(double newPrice) {
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
