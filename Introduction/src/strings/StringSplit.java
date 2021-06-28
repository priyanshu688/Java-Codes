package strings;

public class StringSplit {

	public static void main(String[] args) {

        String cars = "Hyundai, Maruti, Suzuki, Swift, Ferrari, Lamborgini";
        String allCars[] = cars.split(",");
        
        for(String cars1:allCars) {
        	System.out.println(cars1);
        }

	}

}
