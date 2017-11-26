
public class Constructor {
	public static void main(String[] args) {
		Frog frog = new Frog("Hops");
		Frog frog2 = new Frog("Hops2.0");
		frog.sayHi();
		frog2.sayHi();
	}
}
class Frog {
	String name;
	
	Frog(String name){
		this.name = name;
		System.out.println("Made a frog "  + name);
	}
	void sayHi() {
		System.out.println(name + " says hi");
	}
}
