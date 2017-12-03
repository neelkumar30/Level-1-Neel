
public class SecretAgent {

	int findCode(Vault aaron) {
		for (int i = 0; i < 101; i++) {
			boolean stephen = aaron.tryCode(i);
			if (stephen == true) {
				return i;
			}

		}
		return -1;

	}
}
