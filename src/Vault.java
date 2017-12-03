import java.util.Random;

public class Vault {
	int r = new Random().nextInt(1000);
	private int secretCode = r;

	boolean tryCode(int guess) {
		if (guess == secretCode) {
			return true;
		} else {
			return false;
		}

	}
}
