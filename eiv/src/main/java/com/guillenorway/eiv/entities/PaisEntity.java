package com.guillenorway.eiv.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="paises")
public class PaisEntity {

	@Id
	@Column (name="id_pais", nullable=false)
	private Integer idPais = null;
	
	@Column (name="nombre", nullable=false, length=100)
	private String nombre = null;
	
	@Column (name="prefijo", nullable=true)
	private Integer prefijo = null;

	public PaisEntity() {
		super();
	}

	public PaisEntity(Integer idPais, String nombre, Integer prefijo) {
		super();
		this.idPais = idPais;
		this.nombre = nombre;
		this.prefijo = prefijo;
	}

	public Integer getIdPais() {
		return idPais;
	}

	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(Integer prefijo) {
		this.prefijo = prefijo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPais == null) ? 0 : idPais.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaisEntity other = (PaisEntity) obj;
		if (idPais == null) {
			if (other.idPais != null)
				return false;
		} else if (!idPais.equals(other.idPais))
			return false;
		return true;
	}
}
