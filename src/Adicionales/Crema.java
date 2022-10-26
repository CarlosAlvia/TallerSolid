package Adicionales;

public class Crema extends Aderezo{
	
	private String nombre;
	
	public Crema() {
		this.nombre = "Crema";
	}
	
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
