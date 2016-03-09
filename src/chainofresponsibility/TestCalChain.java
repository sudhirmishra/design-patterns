package chainofresponsibility;

public class TestCalChain {
	
	public static void main(String[] args){
		Chain chainCalc1 = new AddNumber();
		Chain chainCalc2 = new SubtractNumber();
		Chain chainCalc3 = new MultiplyNumber();
		Chain chainCalc4 = new DivideNumber();
		
		chainCalc1.setNextChain(chainCalc2);	
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		Number number = new Number(2,4,"div");
		
		chainCalc1.calculate(number);
	}
	
}
