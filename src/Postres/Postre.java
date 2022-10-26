package Postres;

import java.util.ArrayList;

import Adicionales.Aderezo;

public class Postre {
	protected String sabor;
	protected double precioParcial;
	protected ArrayList<String> aderezos;
	
	public Postre(String sabor) {
		this.sabor=sabor;
		aderezos=new ArrayList<>();
	}
	public ArrayList<String> getAderezos() {
        return aderezos;
    }
	public void agregarAderezo() {
		//Este método agrega aderezos
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public double getPrecioParcial() {
		return precioParcial;
	}
	public void setPrecioParcial(double precioParcial) {
		this.precioParcial = precioParcial;
	}
	public void setAderezos(ArrayList<String> aderezos) {
		this.aderezos = aderezos;
	}
	
}
