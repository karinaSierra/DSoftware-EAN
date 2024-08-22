package GestionParqueadero;

import java.time.LocalDateTime;

public class Automovil extends Vehiculo{
	
	private String tipoGasolina;

	public Automovil(String placa, String marca, String modelo, LocalDateTime checkIn, String tipoGasolina) {
		super(placa, marca, modelo, checkIn, "CARRO");
		this.tipoGasolina = tipoGasolina;
	}

	public String getTipoGasolina() {
		return tipoGasolina;
	}

	public void setTipoGasolina(String tipoGasolina) {
		this.tipoGasolina = tipoGasolina;
	}
	
	

}
