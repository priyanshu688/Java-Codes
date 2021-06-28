package methods;

public class ClassIntroduction {

	public static void main(String[] args) {

    int firstNumber = 34;
    int secondNumber = 23;
    
    int result = maxOf(firstNumber , secondNumber);
    
    System.out.println(result);

	}
    static int maxOf(int a , int b) {
    	if(a > b) {
    		return a;
    		}else {
    		return b;
    	}
    }
	

}
