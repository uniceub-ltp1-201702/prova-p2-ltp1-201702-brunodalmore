package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Medalha;
import view.ViewDiferen�aPaises;
import view.ViewSolicitarPais;

public class ControleDiferen�aEstadosUnidos {

	private BDSimulado bds;

	public ControleDiferen�aEstadosUnidos(BDSimulado bds) {
		this.bds = bds;
	}
	@SuppressWarnings("unused")
	public void Diferen�aEstadosUnidos() {

		int diferen�aOuro = 0;
		int diferen�aPrata = 0;
		int diferen�aBronze = 0;
		
		ArrayList<Medalha> medalhas = bds.getMedalhas();

		ViewSolicitarPais vsp = new ViewSolicitarPais();
		String pais = vsp.getPais();
		String p = "";
		for (int i = 0; i < medalhas.size(); i++) {
			if (medalhas.get(i).getPais().equalsIgnoreCase(pais)) {
				diferen�aOuro = medalhas.get(i).getQtdMedalhaOuro() - medalhas.get(0).getQtdMedalhaOuro();
				diferen�aPrata = medalhas.get(i).getQtdMedalhaPrata() - medalhas.get(0).getQtdMedalhaPrata();
				diferen�aBronze = medalhas.get(i).getQtdMedalhaBronze() - medalhas.get(0).getQtdMedalhaBronze();
				p += "Diferen�a de Medalha dos paises " + pais + " e  os " + medalhas.get(0).getPais()
						+ "\n - Quantidade Medalhas de Ouro: " + diferen�aOuro + "\n - Quantidade Medalhas de Prata: "
						+ diferen�aPrata + "\n - Quantidade Medalhas de Bronze: " + diferen�aBronze;
			}
		}

		ViewDiferen�aPaises vde = new ViewDiferen�aPaises(p);
	}
}
