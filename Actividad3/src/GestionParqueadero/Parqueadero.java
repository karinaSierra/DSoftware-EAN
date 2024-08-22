package GestionParqueadero;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private List<Vehiculo> vehiculos;

    public Parqueadero(){
        this.vehiculos = new ArrayList<>(); 
        }

    public void registrarCheckIn(Vehiculo vehiculo) {
        vehiculo.setCheckIn(LocalDateTime.now());
        vehiculos.add(vehiculo);
        System.out.println("Se registró el vehículo: " + vehiculo.getPlaca() + " - " + vehiculo.getTipoVehiculo());
    }

    public void registrarCheckOut(Vehiculo vehiculo) {

        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equals(vehiculo.getPlaca())) {
                v.setCheckOut(LocalDateTime.now());
                System.out.println("Se registró la salida del vehículo: " + vehiculo.getPlaca() + " - " + vehiculo.getTipoVehiculo());
                return; 
            }
        }
        System.out.println("Vehículo no encontrado para registrar salida.");
    }

    public String consultarEstado(String placa) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                if (vehiculo.getCheckOut() == null) {
                    long horasEstacionado = LocalDateTime.now().toEpochSecond(java.time.ZoneOffset.UTC) - vehiculo.getCheckIn().toEpochSecond(java.time.ZoneOffset.UTC);
                    return "El vehículo " + placa + " está estacionado desde hace " + horasEstacionado / 3600 + " horas.";
                } else {
                    return "El vehículo " + placa + " ya no está estacionado.";
                }
            }
        }
        return "Vehículo no encontrado.";
    }
}
