package Postres;

import java.util.ArrayList;

import Adicionales.Aderezo;

public class Postre {
	private String sabor;
	private double precioParcial;
	private ArrayList<String> aderezos;
	
	public Postre(String sabor, double precioParcial) {
		this.sabor=sabor;
		this.precioParcial=precioParcial;
		aderezos=new ArrayList<>();
	}
	public ArrayList<String> getAderezos() {
        return aderezos;
    }
	public void agregarAderezo() {
		//Este método agrega aderezos
	}
}
