package ar.edu.unlam.pb2;

import java.util.Objects;

public class Vehiculo {
	
	private Integer id;
	private String nombre;
	
	public Vehiculo(Integer id, String nombre) {
		this.setId(id);
		this.setNombre(nombre);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(id, other.id);
	} 
	
	
	
}
