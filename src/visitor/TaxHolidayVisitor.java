package visitor;

public class TaxHolidayVisitor implements Visitor{
	
	public TaxHolidayVisitor(){
		
	}
	
	@Override
	public double visit(Liquor item) {
		System.out.println("Liquor item: Price with Tax");
		return (item.getPrice() * .10 + item.getPrice() );
	}

	@Override
	public double visit(Tobacco item) {
		System.out.println("Tobacco item: Price with Tax");
		return (item.getPrice() * .30 + item.getPrice() );
	}

	@Override
	public double visit(Necessity item) {
		System.out.println("Necessity item: Price with Tax");
		return (item.getPrice() * 0 + item.getPrice() );
	}
}
