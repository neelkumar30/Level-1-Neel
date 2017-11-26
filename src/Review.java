
public class Review {
	int lives;
	String name;
	Review(String n, int lives){
		 this.lives = lives;
		 name = n;
	}
	void variable() {
		System.out.println(lives);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Review hi = new Review("Hi2.0", 8);
		hi.variable();
	}
}
