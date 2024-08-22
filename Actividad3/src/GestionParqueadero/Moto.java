package GestionParqueadero;

import java.time.LocalDateTime;

public class Moto extends Vehiculo {
	
	private int cilindraje;

	public Moto(String placa, String marca, String modelo, LocalDateTime checkIn, int cilindraje) {
		super(placa, marca, modelo, checkIn, "MOTO");
		this.cilindraje = cilindraje;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

}
