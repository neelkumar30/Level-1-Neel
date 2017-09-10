
public class Runner {
	public static void main(String[] args) {
		
	
	SeaCreature Spongebob = new SeaCreature("Spongebob");
	SeaCreature Squidward = new SeaCreature("Squidward");
	SeaCreature Patrick = new SeaCreature("Patrick");
	String name = Spongebob.getName();
	System.out.println(name);
	Spongebob.eat();
	Spongebob.laugh();
	String name2 = Squidward.getName();
	System.out.println(name2);
	Squidward.eat();
	Squidward.laugh();
	String name3 = Patrick.getName();
	System.out.println(name3);
	Patrick.eat();
	Patrick.laugh();
	}
}
