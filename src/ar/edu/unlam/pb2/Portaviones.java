package ar.edu.unlam.pb2;

public class Portaviones extends Vehiculo implements Acuatico{

	public Portaviones(Integer id, String nombre) {
		super(id, nombre);
		
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return 0.0;
	}

}
