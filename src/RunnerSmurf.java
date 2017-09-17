
public class RunnerSmurf {
	public static void main(String[] args) {
		
		System.out.println("This is Handy Smurf");
		Smurf HandySmurf = new Smurf("Handy Smurf");
		HandySmurf.eat();
		HandySmurf.getName();
		
		Smurf PapaSmurf = new Smurf("Papa Smurf");
		System.out.println("This is Papa Smurf");
		System.out.println("Papa Smurf is wearing a " + PapaSmurf.getHatColor() + " hat");
		System.out.println("Papa Smurf is a " + PapaSmurf.isGirlOrBoy());
		
		System.out.println("This is Smurfette");
		Smurf Smurfette = new Smurf("Smurfette");
		System.out.println("Smurfette is wearing a " + Smurfette.getHatColor() + " hat");
		System.out.println("Smurfette is a " + Smurfette.isGirlOrBoy());
	}

}
