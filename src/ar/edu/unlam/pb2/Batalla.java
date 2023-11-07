package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class Batalla {
	
	
	private TipoDeBatalla tipoDeBatalla;
	private Double latitud;
	private Double longitud;
	private List<Vehiculo> armada;
	
	
	public Batalla(TipoDeBatalla tipoDeBatlla, Double latitud, Double longitud) {
		this.setTipoDeBatalla(tipoDeBatlla); 
		this.setLatitud(latitud); 
		this.setLongitud(longitud);
		setArmada(new ArrayList<>());
	}

	public TipoDeBatalla getTipoDeBatalla() {
		return tipoDeBatalla;
	}

	public void setTipoDeBatalla(TipoDeBatalla tipoDeBatalla) {
		this.tipoDeBatalla = tipoDeBatalla;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public void agregarVehiculoQueVaALaBatalla(Vehiculo vehiculoAMandar) {
		armada.add(vehiculoAMandar);
	}

	public List<Vehiculo> getArmada() {
		return armada;
	}

	public void setArmada(List<Vehiculo> armada) {
		this.armada = armada;
	}

}
