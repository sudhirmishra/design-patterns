package visitor;

public class Tobacco implements Visitable{
	
	private double price;
	
	public Tobacco(double newPrice) {
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
