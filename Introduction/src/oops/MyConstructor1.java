package oops;
class Vehicle {
	int wheels;
	
	Vehicle() {
		wheels = 4;
	}
}

public class MyConstructor1 {
	MyConstructor1() {
        System.out.println("object is now created");		
	}

	public static void main(String[] args) {
		
		Vehicle car = new Vehicle();
		Vehicle car2 = new Vehicle();
		
		System.out.println(car2.wheels + "wheels" );
		
		

	}

}
