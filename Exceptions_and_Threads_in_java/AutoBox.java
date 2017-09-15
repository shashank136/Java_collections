public class AutoBox{
	public static void main(String args[]){
		Integer intObject =  new Integer(1);
		int intPrimitive = 2;

		Integer tempInt;
		int tempPri;

		tempInt = new Integer(intPrimitive);
		tempPri = intObject.intValue();

		tempInt = intPrimitive; // Autoboxing
		System.out.println(tempInt); // 2
		
		tempPri = intObject; // Unboxing
		System.out.println(tempPri); // 1
	}
}