
package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O1 {

	public static void main(String[] args) {

		for (int i=1; i<=10; i++) {
			String input = showInputDialog(i + ". Poengsum: ");
			int karakterScore = Integer.parseInt(input);	

			if ((karakterScore <= 100)&&(90 <= karakterScore)){
				showMessageDialog(null, "Resultat: A");}
			else if ((karakterScore <= 89)&&(80 <= karakterScore)){
				showMessageDialog(null, "Resultat: B");
			}

			else if ((karakterScore <= 79)&&(60 <= karakterScore)){
				showMessageDialog(null, "Resultat: C");
			}

			else if ((karakterScore <= 59)&&(50 <= karakterScore)) {
				showMessageDialog(null, "Resultat: D");
			}

			else if ((karakterScore <= 49)&& (karakterScore >= 40)) {
				showMessageDialog(null, "Resultat: E");
			}

			else if ((karakterScore <= 39)&&(karakterScore >= 0)) {
				showMessageDialog(null, "Resultat: F");
			}

			else {
				showMessageDialog(null, "Karakter er 1-100");
				i--;
			}

			System.out.println(i);
		}

	}

}
