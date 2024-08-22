package GestionParqueadero;

import java.time.LocalDateTime;

public class Camion extends Vehiculo{
	
	private double capacidadCarga;

	public Camion(String placa, String marca, String modelo, LocalDateTime checkIn, double capacidadCarga) {
		super(placa, marca, modelo, checkIn, "CAMION");
		this.capacidadCarga = capacidadCarga;
	}

	public double getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	
	

}
