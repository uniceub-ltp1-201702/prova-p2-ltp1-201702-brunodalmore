package view;

import javax.swing.JOptionPane;

public class ViewDiferen�aPaises {
	public ViewDiferen�aPaises(String diferenca) {

		if (diferenca != "") {
			JOptionPane.showMessageDialog(null, diferenca);
		} else {
			JOptionPane.showMessageDialog(null, "Pa�s n�o encontrado");
		}
	}
}
