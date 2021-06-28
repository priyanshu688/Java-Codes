package oops;
class Dog {
	String breed, name ;
	
	public void jump() {
		System.out.println("my dog" + name +" jumped");
	}
	public void description() {
		System.out.println("my dogs name is " + name + " and its breed is " + breed);
	}
}

public class MainClass2 {

	public static void main(String[] args) {
      Dog husky = new Dog();
      Dog poodle = new Dog();
      
      husky.breed = " Husky";
      husky.name  = "Browny";
      
      poodle.breed ="Poddle";
      poodle.name = "Molchnd";
      
      husky.jump();
      husky.description();
      
      poodle.jump();
      poodle.description();
      
      


	}

}
