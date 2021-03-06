package chainofresponsibility;

public class AddNumber implements Chain{

	private Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;		
	}

	@Override
	public void calculate(Number request) {
		if(request.getCalcWanted() == "add"){
			System.out.println(request.getNumber1() + " + " + request.getNumber2() + " = " + (request.getNumber1() + request.getNumber2()));
		} else{
			nextInChain.calculate(request);
		}
		
	}

}
