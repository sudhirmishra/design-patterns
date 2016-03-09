package command;

import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {

	public static void main(String[] args){
		
		ElectronicDevice newDevice = TVRemote.getDevice();
		
		TurnTVOn onCommand = new TurnTVOn(newDevice);
			
		DeviceButton onPressed = new DeviceButton(onCommand);
		
		onPressed.press();
		
		
		// -----------------------------------
		
		TurnTVOff offCommand = new TurnTVOff(newDevice);
		
		onPressed = new DeviceButton(offCommand);
		
		onPressed.press();
		
		// -----------------------------------
		
		TurnTVUp volUpCommand = new TurnTVUp(newDevice);
		
		onPressed = new DeviceButton(volUpCommand);
		
		onPressed.press();
		onPressed.press();
		onPressed.press();
		onPressed.pressUndo();

		// -----------------------------------
		
		Television theTV = new Television();
		Radio theRadio = new Radio();
		
		List<ElectronicDevice> devices = new ArrayList<ElectronicDevice>();
		
		devices.add(theRadio);
		devices.add(theTV);
		
		TurnItAllOff turnOffDevices = new TurnItAllOff(devices);
		
		DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
		
		turnThemOff.press();

		// -----------------------------------
		
		turnThemOff.pressUndo();
		
		
	}
}

