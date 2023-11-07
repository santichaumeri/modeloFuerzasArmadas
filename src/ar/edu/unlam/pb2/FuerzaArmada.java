package ar.edu.unlam.pb2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FuerzaArmada {
	
		private Set<Vehiculo> convoy;
		private Map<String, Batalla> batallas;
		
		

		public FuerzaArmada() {
			this.convoy = new  HashSet<Vehiculo>();
			this.batallas = new  HashMap<String, Batalla>();
		}

		
		public void agregarVehiculo(Vehiculo nuevo) {
			convoy.add(nuevo);	
		}


		public Integer getCapacidadDeDefensa() {
			return convoy.size();
		}


		public Batalla crearBatalla(String nombre, TipoDeBatalla terrestre, Double latitud, Double longitud) {
			Batalla nueva = new Batalla(terrestre,latitud,longitud);
			batallas.put(nombre, nueva);
			return nueva;
		}


		public Batalla getBatalla(String nombre) {
			
			for (Map.Entry<String, Batalla> entry : batallas.entrySet()) {
				String key = entry.getKey();
				Batalla val = entry.getValue();
				
				if (key.equals(nombre)) {
					return val;
				}
			}
			return null;
		}


		public boolean enviarALaBatalla(String nombre, Integer id) throws VehiculoInexistente, VehiculoIncompatible {
			
			Vehiculo vehiculoAMandar= buscarVehiculoPorID(id);
			
			Batalla batalla= getBatalla(nombre);
			
			Boolean seEnvio = false;
			
			switch (batalla.getTipoDeBatalla()) {
			
			case TERRESTRE:
				if (!(vehiculoAMandar instanceof Terrestre)) {
					throw new VehiculoIncompatible();
				}
				batalla.agregarVehiculoQueVaALaBatalla(vehiculoAMandar);
				seEnvio= true;
				break;
				
			case NAVAL:
				if (!(vehiculoAMandar instanceof Acuatico)) {
					throw new VehiculoIncompatible();
				}
				batalla.agregarVehiculoQueVaALaBatalla(vehiculoAMandar);
				seEnvio= true;
				break;
				
			case AEREA:
				if (!(vehiculoAMandar instanceof Volador)) {
					throw new VehiculoIncompatible();
				}
				batalla.agregarVehiculoQueVaALaBatalla(vehiculoAMandar);
				seEnvio= true;
				break;
			default:
				break;
			}
			
			return seEnvio;
		}


		private Vehiculo buscarVehiculoPorID(Integer id) throws VehiculoInexistente {
			
			for (Vehiculo vehiculo : convoy) {
				
				if (vehiculo.getId().equals(id)) {
					return vehiculo;
				}
			}
			throw new VehiculoInexistente("VEHICULO INEXISTENTE");
			
		}
		
}
