package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Medalha;
import view.ViewDiferen�aPaises;
import view.ViewSolicitarPais;

public class ControleDiferen�aPaises {

	private BDSimulado bds;

	public ControleDiferen�aPaises(BDSimulado bds) {
		this.bds = bds;
	}

	@SuppressWarnings("unused")
	public void Diferen�aPaises() {

		int diferen�aOuroPais1 = 0;
		int diferen�aPrataPais1 = 0;
		int diferen�aBronzePais1 = 0;
		int diferen�aOuroPais2 = 0;
		int diferen�aPrataPais2 = 0;
		int diferen�aBronzePais2 = 0;

		ArrayList<Medalha> medalhas = bds.getMedalhas();
		ViewSolicitarPais vsp1 = new ViewSolicitarPais();
		String pais1 = vsp1.getPais();
		ViewSolicitarPais vsp2 = new ViewSolicitarPais();
		String pais2 = vsp2.getPais();
		String p = "";
		for (int i = 0; i < medalhas.size(); i++) {
			if (medalhas.get(i).getPais().equals(pais1)) {
				diferen�aOuroPais1 = medalhas.get(i).getQtdMedalhaOuro();
				diferen�aPrataPais1 = medalhas.get(i).getQtdMedalhaPrata();
				diferen�aBronzePais1 = medalhas.get(i).getQtdMedalhaBronze();
			}
			if (medalhas.get(i).getPais().equals(pais1)) {
				diferen�aOuroPais2 = medalhas.get(i).getQtdMedalhaOuro();
				diferen�aPrataPais2 = medalhas.get(i).getQtdMedalhaPrata();
				diferen�aBronzePais2 = medalhas.get(i).getQtdMedalhaBronze();
			}
		}
		diferen�aOuroPais2 = diferen�aOuroPais2 - diferen�aOuroPais1;
		diferen�aPrataPais2 = diferen�aPrataPais1 - diferen�aPrataPais2;
		p += "Diferen�a de Medalha entre entre os paises " + pais1 + " e " + pais2 + "\n - Quantidades Medalhas de Ouro: "
				+ diferen�aOuroPais2 + "\n - Quantidades Medalhas de Prata: " + diferen�aPrataPais2
				+ "\n - Quantidades Medalhas de Bronze: " + diferen�aBronzePais2;

		ViewDiferen�aPaises vde = new ViewDiferen�aPaises(p);
	}
}
