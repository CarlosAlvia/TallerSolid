package Adicionales;

public class Frutilla extends Aderezo{
	
	private String nombre;
	
	public Frutilla() {
		this.nombre = "Frutilla";
	}
	
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}