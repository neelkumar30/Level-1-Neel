
public class SpyRunner {
	public static void main(String[] args) {
		Vault vault = new Vault();
		SecretAgent Lacazette = new SecretAgent();
		int crack = Lacazette.findCode(vault);
		if (crack != -1) {
			System.out.println("Yay");
		} else {
			System.out.println("Fail");
		}
	}
}
