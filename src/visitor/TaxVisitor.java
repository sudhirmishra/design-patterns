package visitor;

public class TaxVisitor implements Visitor {

	public TaxVisitor(){
		
	}
	
	@Override
	public double visit(Liquor item) {
		System.out.println("Liquor item: Price with Tax");
		return (item.getPrice() * .18 + item.getPrice() );
	}

	@Override
	public double visit(Tobacco item) {
		System.out.println("Tobacco item: Price with Tax");
		return (item.getPrice() * .32 + item.getPrice() );
	}

	@Override
	public double visit(Necessity item) {
		System.out.println("Necessity item: Price with Tax");
		return (item.getPrice() * 0 + item.getPrice() );
	}

}
