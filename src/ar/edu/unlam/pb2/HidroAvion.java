package ar.edu.unlam.pb2;

public class HidroAvion extends Vehiculo implements Acuatico, Volador{


	public HidroAvion(Integer id, String modelo) {
		super(id, modelo);
	}


	@Override
	public Double getAltura() {
		// TODO Auto-generated method stub
		return 0.0;
	}


//	public Double getAltitud() {
//		// TODO Auto-generated method stub
//		return null;
//	}


	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return 0.0;
	}

}
