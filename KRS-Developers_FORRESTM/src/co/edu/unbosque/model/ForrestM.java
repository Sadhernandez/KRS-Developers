package co.edu.unbosque.model;

import java.util.ArrayList;

import co.edu.unbosque.model.persistence.Propiedades;

public class ForrestM {

	private Propiedades prop;

	private ArrayList<Pista> Pistas;

	public ForrestM(Propiedades prop, ArrayList<Pista> pistas) {
		super();
		this.prop = new Propiedades();
		Pistas = new ArrayList<Pista>();
	}

	public String cargaNombreVentana() {
		return prop.getProp().getProperty("TituloVentana");
	}

	public Propiedades getProp() {
		return prop;
	}

	public void setProp(Propiedades prop) {
		this.prop = prop;
	}

	public ArrayList<Pista> getPistas() {
		return Pistas;
	}

	public void setPistas(ArrayList<Pista> pistas) {
		Pistas = pistas;
	}

}
