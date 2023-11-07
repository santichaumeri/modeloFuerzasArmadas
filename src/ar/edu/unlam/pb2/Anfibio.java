package ar.edu.unlam.pb2;

public class Anfibio extends Vehiculo implements Terrestre,Acuatico{

	public Anfibio(Integer id, String nombre) {
		super(id, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return 0.0;
	}


}
