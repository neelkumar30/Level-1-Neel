package houses;

import javax.swing.JOptionPane;

public class HouseRunner {
	public static void main(String[] args) {

		HouseBuilder Ozil = new HouseBuilder();
		Ozil.movetoBottomLeftCorner();

		for (int i = 0; i < 9; i++) {

			String height1 = JOptionPane.showInputDialog("Please enter a height");
			int height = Integer.parseInt(height1);
			Ozil.drawHouse(height);
		}

	}

}
