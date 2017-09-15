/*interface ElectronicDevices{
	public void turnOn();
	public void turnOff();
}*/

public class Television implements ElectronicDevices{
	public void turnOn(){
		System.out.println("ON");
	}
	public void turnOff(){
		System.out.println("OFF");
	}
	public void displayChannel(){
		System.out.println("You are trying to watch into future ");
	}

	public static void turnObject(Object o){
		if(o instanceof ElectronicDevices){
			ElectronicDevices e = (ElectronicDevices)o;
			e.turnOn();
		}
	}

	public static void main(String args[]){
		ElectronicDevices ed = new Television();
		ed.turnOn();
		ed.turnOff();
		//ed.displayChannel();

		Television t = new Television();
		if(t instanceof ElectronicDevices){
			System.out.println("This reference satisfies base interface class.");
			Television.turnObject(ed);
			Television.turnObject(t);		
		}
	}
}