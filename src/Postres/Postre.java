package Postres;

import java.util.ArrayList;

import Adicionales.Aderezo;

public class Postre {
	protected String sabor;
	protected double precioParcial;
	protected ArrayList<Aderezo> aderezos;
	
	public Postre(String sabor) {
		this.sabor=sabor;
		aderezos=new ArrayList<>();
	}
	public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
	public void agregarAderezo(Aderezo aderezo) {
		aderezos.add(aderezo);
	}
	public void quitarAderezo(Aderezo aderezo) {
		aderezos.remove(aderezo);
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
	public void setAderezos(ArrayList<Aderezo> aderezos) {
		this.aderezos = aderezos;
	}
	
}
