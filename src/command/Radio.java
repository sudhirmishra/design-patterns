package command;

public class Radio  implements ElectronicDevice{
	
	private int volume = 0;
	
	@Override
	public void on() {
		System.out.println("Radio On");
		
	}

	@Override
	public void off() {
		System.out.println("Radio Off");
		
	}

	@Override
	public void volumeUp() {
		
		volume++;
		System.out.println("Radio Volume at "+volume);
		
	}

	@Override
	public void volumeDown() {
		
		volume--;
		System.out.println("Radio Volume at "+volume);
		
	}
}
