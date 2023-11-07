package ar.edu.unlam.pb2;

public class Camion extends Vehiculo implements Terrestre{

	public Camion(Integer id, String nombre) {
		super(id, nombre);
	}

	@Override
	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return 0.0;
	}


}
