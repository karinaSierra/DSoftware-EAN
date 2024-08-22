package GestionParqueadero;

import java.time.LocalDateTime;

public class Vehiculo {
	
	private String placa;
	private String marca;
	private String modelo;
	private LocalDateTime checkIn;
	private String tipoVehiculo;
	private LocalDateTime checkOut;
	
	public Vehiculo(String placa, String marca, String modelo, LocalDateTime checkIn, 
			String tipoVehiculo) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.checkIn = checkIn;
		this.tipoVehiculo = tipoVehiculo;
		this.checkOut = checkOut;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public LocalDateTime getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalDateTime checkIn) {
		this.checkIn = checkIn;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public LocalDateTime getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(LocalDateTime checkOut) {
		this.checkOut = checkOut;
	}

}
