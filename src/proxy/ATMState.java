package proxy;

public interface ATMState {
	
	
	public void insertCard();
	public void ejectCard();
	public void insertPin(int pinEntered);
	public void requestCash(int cashToWithdraw);
	
	
}
