package chainofresponsibility;

public interface Chain {
	
	public void setNextChain(Chain nextChain);
	public void calculate(Number request);
}
